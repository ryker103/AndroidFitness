package com.example.admin.fitnessyoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class LungXo extends AppCompatActivity {

    RecyclerView recyclerViewGYM;
    AdapterM adapterGYM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lung_xo);


        recyclerViewGYM = findViewById(R.id.recyclerView);
        recyclerViewGYM.setLayoutManager(new LinearLayoutManager(this)); //tao recyclerview trong LinearLayout

        adapterGYM = new AdapterM(this, getMyList());

        recyclerViewGYM.setAdapter(adapterGYM);

    }

    private ArrayList<Model> getMyList() {
        ArrayList<Model> models = new ArrayList<>();

        Model //Lưng xô
                m = new Model();
        m.setTitle("Seated cable rows");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.xohitxa);
        models.add(m);

        m = new Model();
        m.setTitle("Lat machine pull down");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.xokeocap);
        models.add(m);

        m = new Model();
        m.setTitle("One arm dumbbell rows");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.xokeocapngoi);
        models.add(m);

        m = new Model();
        m.setTitle("Seated cable rows");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.xotadon);
        models.add(m);

        m = new Model();
        m.setTitle("Lat machine pull up");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.xotadon2);
        models.add(m);

        return models;

    }
}
