package com.example.qasim.recyclerview.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qasim.recyclerview.R;
import com.example.qasim.recyclerview.model.Human;

import java.util.List;

public class HumanController extends RecyclerView.Adapter {

private List<Human> humans;
private Context context;

    public HumanController(List<Human> humans, Context context) {
        this.humans = humans;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.item_human, viewGroup, false);
        return new HumanView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {

        Human currentHuman=humans.get(position);
        HumanView humanView= (HumanView) viewHolder;
        humanView.icon.setImageResource(currentHuman.getIcon());
        humanView.text.setText(currentHuman.getName()+" "+currentHuman.getAge());
    }


    @Override
    public int getItemCount() {
        if (humans == null)
            return 0;
        return humans.size();
    }
        class HumanView extends RecyclerView.ViewHolder {

            ImageView icon;
            TextView text;
            Button button;

            public HumanView(@NonNull View inflaterinYaratdigiKokView) {
                super(inflaterinYaratdigiKokView);
                icon = inflaterinYaratdigiKokView.findViewById(R.id.imageview_human_icon);
                text = inflaterinYaratdigiKokView.findViewById(R.id.textview_human_name);
                button = inflaterinYaratdigiKokView.findViewById(R.id.button_human_delete);
    }

}}
