package com.example.umairfyp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.umairfyp.model.Model;
import com.example.umairfyp.model.players_list.Player;
import com.example.umairfyp.network.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PlayersListActivity extends AppCompatActivity {

    String apiKey = "7d2dc5ae-9763-41fe-8f0d-00217c6a0d8f";
    Player playerModel;
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_list);
        rv = findViewById(R.id.rv_players_list);
        rv.setLayoutManager(new LinearLayoutManager(this));

        RetrofitClient.getInstance().getServices().getPlayersList(apiKey, 0).enqueue(new Callback<Player>() {
            @Override
            public void onResponse(Call<Player> call, Response<Player> response) {
                playerModel = response.body();
                if (playerModel != null) {
                    PlayersListAdapter playersListAdapter = new PlayersListAdapter(playerModel.getData());
                    rv.setAdapter(playersListAdapter);
                }
            }

            @Override
            public void onFailure(Call<Player> call, Throwable t) {

            }
        });
    }
}