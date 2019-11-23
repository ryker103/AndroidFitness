package com.example.admin.fitnessyoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Chan extends AppCompatActivity {

    RecyclerView recyclerViewGYM;
    AdapterM adapterGYM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chan);

        recyclerViewGYM = findViewById(R.id.recyclerView);
        recyclerViewGYM.setLayoutManager(new LinearLayoutManager(this)); //tao recyclerview trong LinearLayout

        adapterGYM = new AdapterM(this, getMyList());

        recyclerViewGYM.setAdapter(adapterGYM);
    }

    private ArrayList<Model> getMyList() {
        ArrayList<Model> models = new ArrayList<>();


                //chân
        Model m = new Model();
        m.setTitle("Step-Up");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.chana);
        models.add(m);

        m = new Model();
        m.setTitle("Pistol Squat");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.chanb);
        models.add(m);

        m = new Model();
        m.setTitle("Glute-Ham Raise");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.chanc);
        models.add(m);

        m = new Model();
        m.setTitle("Bulgarian Split Squat");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.chand);
        models.add(m);

        m = new Model();
        m.setTitle("Romanian Deadlift.");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.chanf);
        models.add(m);



        return models;
    }
}
