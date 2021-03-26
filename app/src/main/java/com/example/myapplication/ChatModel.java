package com.example.myapplication;

import android.graphics.drawable.Drawable;

public class ChatModel {
    Drawable avatar;
    String chatName, lastMessage, time ;
    boolean prochteno;

    public ChatModel(Drawable avatar, String chatName, String lastMessage, String time, boolean prochteno){
        this.avatar = avatar;
        this.chatName = chatName;
        this.lastMessage = lastMessage;
        this.time = time;
        this.prochteno = prochteno;
    }
}
