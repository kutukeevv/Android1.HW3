package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private List<ChatModel> list;
    private LayoutInflater inflater;
    private OnItemClickListener listener;
    private ChatModel chatModel;
    private Context context;

    public RecyclerAdapter(Context context, List<ChatModel> list, OnItemClickListener listener) {
        this.inflater = LayoutInflater.from(context);
        this.list = list;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_chat, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecyclerViewHolder holder, int position) {
        chatModel = list.get(position);
        holder.userName.setText(chatModel.getChatName());
        holder.lastMessage.setText(chatModel.getLastMessage());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(position, chatModel));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        private TextView userName;
        private TextView lastMessage;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.item_user_name_txt);
            lastMessage = itemView.findViewById(R.id.item_chat_last_message_txt);
        }
    }
}
