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

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvList;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvList = findViewById(R.id.rv_list);
        List<ChatModel> list = new ArrayList<>();
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar), "Azamat", "Zdorova otec", "16:00", true));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar), "Akylai", "Kak dela na uchebe?", "19:00", true));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar), "Vladislav", "Na vihodnih kuda sobiraewsya?", "20:00", true));
        rvList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(this, list);
        rvList.setAdapter(adapter);

    }
}