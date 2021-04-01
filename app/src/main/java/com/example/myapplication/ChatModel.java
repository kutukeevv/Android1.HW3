package com.example.myapplication;

import android.graphics.drawable.Drawable;

public class ChatModel {
    private Drawable avatar;
    private String chatName;
    private String lastMessage;
    private String time;
    private boolean prochteno;

    public ChatModel(Drawable avatar, String chatName, String lastMessage, String time, boolean prochteno){
        this.avatar = avatar;
        this.chatName = chatName;
        this.lastMessage = lastMessage;
        this.time = time;
        this.prochteno = prochteno;
    }

    public Drawable getAvatar() {
        return avatar;
    }

    public void setAvatar(Drawable avatar) {
        this.avatar = avatar;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isProchteno() {
        return prochteno;
    }

    public void setProchteno(boolean prochteno) {
        this.prochteno = prochteno;
    }
}
