package com.example.demo.model;

import java.util.List;

public class AjaxResponseBody {

    private String msg;
    private GoldenCow cow;
    private List<GoldenCow> cows;

    public AjaxResponseBody() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public GoldenCow getCow() {
        return cow;
    }

    public void setCow(GoldenCow cow) {
        this.cow = cow;
    }

    public List<GoldenCow> getCows() {
        return cows;
    }

    public void setCows(List<GoldenCow> cows) {
        this.cows = cows;
    }
}
