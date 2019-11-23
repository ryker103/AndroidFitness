package com.example.admin.fitnessyoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Gym extends AppCompatActivity {

    RecyclerView recyclerViewGYM;
    AdapterM adapterGYM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym);

        recyclerViewGYM = findViewById(R.id.recyclerView);
        recyclerViewGYM.setLayoutManager(new LinearLayoutManager(this)); //tao recyclerview trong LinearLayout

        adapterGYM = new AdapterM(this, getMyList());

        recyclerViewGYM.setAdapter(adapterGYM);


    }

    private ArrayList<Model>getMyList()
    {
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Barbell Bench Press");
        m.setDescription("3 - 4 set");
        m.setImg(R.drawable.ngucgiuatangang);
        models.add(m);

        m = new Model();
        m.setTitle("Dumbbell Bench Press");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.ngucgiuatadon);
        models.add(m);

        m = new Model();
        m.setTitle("Standing Cable Crossover");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.epnguc);
        models.add(m);

        m = new Model();
        m.setTitle("Dumbbell Incline Press");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.nguctren);
        models.add(m);

        m = new Model();
        m.setTitle("Barbell Incline Press");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.nguctrentangang);
        models.add(m);

        m = new Model();
        m.setTitle("Decline press");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.ngucduoi);
        models.add(m);





        //vai
        m = new Model();
        m.setTitle("Arnold Press");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.vaia);
        models.add(m);

        m = new Model();
        m.setTitle("One Arm Press");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.vaib);
        models.add(m);

        m = new Model();
        m.setTitle("Alternating Overhead Press");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.vaic);
        models.add(m);

        m = new Model();
        m.setTitle("Band Overhead Press");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.vaid);
        models.add(m);

        m = new Model();
        m.setTitle("Incline Front Raise");
        m.setDescription("3 -4 set");
        m.setImg(R.drawable.vaif);
        models.add(m);

        //

        return models;

    }
}
