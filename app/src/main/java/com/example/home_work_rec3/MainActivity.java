package com.example.home_work_rec3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LanguageAdapter adapter;
    private ArrayList<String> languages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadData();
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.container_main);
        adapter = new LanguageAdapter(languages);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        languages=new ArrayList<>();
        languages.add("C");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        languages.add("Kotlin");
        languages.add("JavaScript");
        languages.add("Ruby");
        languages.add("C#");
        languages.add("html");
        languages.add("Scc");
        languages.add("Go");
        languages.add("SQL");
    }
}