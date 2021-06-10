package com.example.logo;

public class Admin_Chat_Msg_Model {
    private String text;
    private String time;
    private int viewType;

    public Admin_Chat_Msg_Model(String text, String time, int viewType) {
        this.text = text;
        this.time = time;
        this.viewType = viewType;
    }

    public String getText() {
        return text;
    }

    public String getTime() {
        return time;
    }

    public int getViewType() {
        return viewType;
    }
}

