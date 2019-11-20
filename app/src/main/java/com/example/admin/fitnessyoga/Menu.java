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
    //GYM
    public void btnGym(View View)
    {
        Intent intent = new Intent(Menu.this, Gym.class);
        startActivity(intent);
    }
    //NOTE
    public void btnNote(View View)
    {
        Intent intent = new Intent(Menu.this, Note.class);
        startActivity(intent);
    }
    //CAMERA
    public void btnCamera(View View)
    {
        Intent intent = new Intent(Menu.this, Camera.class);
        startActivity(intent);
    }
    //EXIT
    public void btnExit(View View)
    {
        Intent intent = new Intent(Menu.this, Exit.class);
        startActivity(intent);
    }

}
