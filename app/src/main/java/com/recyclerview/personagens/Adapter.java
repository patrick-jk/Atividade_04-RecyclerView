package com.recyclerview.personagens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Personagem> mPersonagens;

    public Adapter(List<Personagem> mPersonagens) {
        this.mPersonagens = mPersonagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.personagem_lista_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.characterName.setText(mPersonagens.get(position).getName());
        holder.characterAge.setText(mPersonagens.get(position).getAge());
        holder.characterScore.setText(mPersonagens.get(position).getScore());
        holder.characterPic.setImageResource(mPersonagens.get(position).getPic());
    }

    @Override
    public int getItemCount() {
        return mPersonagens.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView characterName, characterAge, characterScore;
        ImageView characterPic;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            characterName = itemView.findViewById(R.id.personagem_name);
            characterAge = itemView.findViewById(R.id.personagem_age);
            characterScore = itemView.findViewById(R.id.personagem_score);
            characterPic = itemView.findViewById(R.id.personagem_pic);
        }
    }
}
