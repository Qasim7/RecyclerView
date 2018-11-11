package com.example.qasim.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.qasim.recyclerview.controller.HumanController;
import com.example.qasim.recyclerview.model.Human;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Human> humanlist=new ArrayList<>();

        Human qasim=new Human("Qasim",28,R.drawable.ic_sentiment);
        Human ibrahim=new Human("Ibrahim",21,R.drawable.ic_person);
        Human elvin=new Human("Elvin",20,R.drawable.ic_person);
        Human tacir=new Human("Tacir",22,R.drawable.ic_person);
        Human nurlan=new Human("Nurlan",23,R.drawable.ic_person);

        humanlist.add(qasim);
        humanlist.add(ibrahim);
        humanlist.add(elvin);
        humanlist.add(tacir);
        humanlist.add(nurlan);

        HumanController humanController=new HumanController(humanlist,this);
        RecyclerView recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(humanController);
    }
}
