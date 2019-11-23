package com.example.admin.fitnessyoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Bung extends AppCompatActivity {

    RecyclerView recyclerViewGYM;
    AdapterM adapterGYM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bung);

        recyclerViewGYM = findViewById(R.id.recyclerView);
        recyclerViewGYM.setLayoutManager(new LinearLayoutManager(this)); //tao recyclerview trong LinearLayout

        adapterGYM = new AdapterM(this, getMyList());

        recyclerViewGYM.setAdapter(adapterGYM);
    }

    private ArrayList<Model> getMyList() {
        ArrayList<Model> models = new ArrayList<>();

        Model  //bung
                m = new Model();
        m.setTitle("Alternating Toe Reach");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.bunga);
        models.add(m);

        m = new Model();
        m.setTitle("Lying Windshield Wipers");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.bungc);
        models.add(m);

        m = new Model();
        m.setTitle("Russian Twist");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.bungd);
        models.add(m);

        m = new Model();
        m.setTitle("Side-To-Side Crunch");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.bungv);
        models.add(m);

        //


        return models;
    }
}
