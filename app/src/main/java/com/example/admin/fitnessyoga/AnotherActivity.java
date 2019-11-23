package com.example.admin.fitnessyoga;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    TextView titleAno, descripAno;
    ImageView imageAno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        ActionBar actionBar = getSupportActionBar();

        titleAno = findViewById(R.id.titleAnother);
        descripAno = findViewById(R.id.descriptionAnother);
        imageAno = findViewById(R.id.imageViewAnother);

        //lấy dữ liệu từ intent và đưa dữ liệu ra
        Intent intent = getIntent();
        String titleAnother = intent.getStringExtra("TitleAno");
        String descriptionAno = intent.getStringExtra("DescripAno");
        byte[] bytes = getIntent().getByteArrayExtra("ImageAno");

        //decode image từ previous activity

        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0, bytes.length);
        actionBar.setTitle(titleAnother);

        titleAno.setText(titleAnother);
        descripAno.setText(descriptionAno);
        imageAno.setImageBitmap(bitmap);
    }
}
