package com.recyclerview.personagens;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        List<Personagem> personagensList = new ArrayList<>();
        personagensList.add(new Personagem("Kratos", "226", "970", R.drawable.kratos));
        personagensList.add(new Personagem("Batman", "30", "850", R.drawable.batman));
        personagensList.add(new Personagem("Deadpool", "28", "900", R.drawable.deadpool));
        personagensList.add(new Personagem("Ghost", "24", "700", R.drawable.ghost));
        personagensList.add(new Personagem("Joker", "50", "750", R.drawable.joker));
        personagensList.add(new Personagem("Marcus Holloway", "24", "850", R.drawable.marcus_holloway));
        personagensList.add(new Personagem("Master Chief", "47", "825", R.drawable.master_chief));
        personagensList.add(new Personagem("Nathan Drake", "36", "775", R.drawable.nathan_drake));
        personagensList.add(new Personagem("Spider-Man", "20", "805", R.drawable.spider_man));
        personagensList.add(new Personagem("Venom", "32", "880", R.drawable.venom));

        RecyclerView recyclerView = findViewById(R.id.id_recyclerView);
        Adapter recyclerViewAdapter = new Adapter(personagensList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}