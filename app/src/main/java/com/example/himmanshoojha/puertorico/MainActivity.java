package com.example.himmanshoojha.puertorico;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.Recycler_v);

        adapter = new MyAdapter(this,getData());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

    }
    private ArrayList<Model> getData(){

        ArrayList<Model>models = new ArrayList<>();

        Model obj = new Model(R.drawable.a,"Le Grand Residency");

        models.add(obj);

         obj = new Model(R.drawable.b,"Reddison Blu");

        models.add(obj);

        obj = new Model(R.drawable.c,"Le Grand Residency");

        models.add(obj);

        obj = new Model(R.drawable.d,"Reddison Blu");

        models.add(obj);

        obj = new Model(R.drawable.e,"Le Grand Residency");

        models.add(obj);

        return  models;
    }
}
