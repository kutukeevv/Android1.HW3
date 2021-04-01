package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private RecyclerView rvList;
    private RecyclerAdapter adapter;
    List<ChatModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvList = findViewById(R.id.rv_list);

        list.add(0,new ChatModel(getResources().getDrawable(R.drawable.avatar), "Azamat", "Zdorova otec", "16:00", true));
        list.add(1,new ChatModel(getResources().getDrawable(R.drawable.avatar), "Akylai", "Kak dela na uchebe?", "19:00", true));
        OnItemClickListener listener = (pos, chatModel) -> {
            Toast.makeText(this, pos + " " + chatModel.getChatName() + " " + chatModel.getLastMessage(), Toast.LENGTH_SHORT).show();
        };
        adapter = new RecyclerAdapter(this, list, listener);
        rvList.setAdapter(adapter);
    }
}