package com.example.admin.fitnessyoga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void btnGym(View view)
    {
        Intent intent = new Intent(Menu.this, Gym.class);
        startActivity(intent);
    }
    public void btnYoga(View view)
    {
        Intent intent = new Intent(Menu.this, Yoga.class);
        startActivity(intent);
    }
    //Yoga
    public void btnCamera(View view)
    {
        Intent intent = new Intent(Menu.this, Camera.class);
        startActivity(intent);
    }
    public void btnNote(View view)
    {
        Intent intent = new Intent(Menu.this, Gym.class);
        startActivity(intent);
    }

    public void btnYogaa(View view)
    {
        Intent intent = new Intent(Menu.this, Yoga.class);
        startActivity(intent);
    }
}
