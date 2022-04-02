package com.example.umairfyp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Score {

    @SerializedName("r")
    @Expose
    private Integer r;
    @SerializedName("w")
    @Expose
    private Integer w;
    @SerializedName("o")
    @Expose
    private Float o;
    @SerializedName("inning")
    @Expose
    private String inning;

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Float getO() {
        return o;
    }

    public void setO(Float o) {
        this.o = o;
    }

    public String getInning() {
        return inning;
    }

    public void setInning(String inning) {
        this.inning = inning;
    }

}