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
    //NGUC
    public void btnGym(View View)
    {
        Intent intent = new Intent(Menu.this, Gym.class);
        startActivity(intent);
    }
    //Bung
    public void btnBung(View View)
    {
        Intent intent = new Intent(Menu.this, Bung.class);
        startActivity(intent);
    }
    //CHAN
    public void btnChan(View View)
    {
        Intent intent = new Intent(Menu.this, Chan.class);
        startActivity(intent);
    }
    //LUNG XO
    public void btnLungXo(View View)
    {
        Intent intent = new Intent(Menu.this, LungXo.class);
        startActivity(intent);
    }

}
