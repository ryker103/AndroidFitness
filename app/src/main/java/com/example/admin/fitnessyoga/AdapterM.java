package com.example.admin.fitnessyoga;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class AdapterM extends RecyclerView.Adapter<HolderM> {

    Context c;
    ArrayList<Model> models; // tạo danh sách mảng với các tham số được định nghĩa trong mdel class

   //tao tham so


    public AdapterM(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public HolderM onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, null); //inflate cua row
        return new HolderM(view); //return view cho holder class


    }

    @Override
    public void onBindViewHolder(@NonNull final HolderM holderM, int i) {
        HolderM.titlee.setText(models.get(i).getTitle());
        HolderM.descrip.setText(models.get(i).getTitle());
        HolderM.imageVieww.setImageResource(models.get(i).getImg()); //sử dụng tài nguyên hình ảnh vì tài nguyên sẽ sử dụng hình ảnh ben ngoai

        //thư mục tài nguyên trong draveble


        holderM.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                String titleAno = models.get(position).getTitle();
                String descripAno = models.get(position).getDescription();
                BitmapDrawable bitmapDrawable = (BitmapDrawable)holderM.imageVieww.getDrawable();
                Bitmap bitmap = bitmapDrawable.getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] bytes = stream.toByteArray();

                Intent intent = new Intent(c, AnotherActivity.class);
                intent.putExtra("TitleAno", titleAno);     //Lấy dữ liệu và đặt intent
                intent.putExtra("DescripAno", descripAno);
                intent.putExtra("ImageAno", bytes);
                c.startActivity(intent);

            }
        });


       /* holderM.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                if (models.get(position).getTitle().equals("Barbell Bench Press")){

                }
                if (models.get(position).getTitle().equals("Dumbbell Bench Press")){

                }
                if (models.get(position).getTitle().equals("Standing Cable Crossover")){

                }
                if (models.get(position).getTitle().equals("Dumbbell Incline Press")){

                }
                if (models.get(position).getTitle().equals("Barbell Incline Press")){

                }
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
