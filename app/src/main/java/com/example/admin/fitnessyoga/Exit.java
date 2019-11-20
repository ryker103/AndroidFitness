package com.example.admin.fitnessyoga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Exit extends AppCompatActivity {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);

        img = (ImageView)findViewById(R.id.imgExit);

    }
    public void btnExit(View View)
    {
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
