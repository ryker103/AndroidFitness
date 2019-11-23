package com.example.admin.fitnessyoga;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HolderM extends RecyclerView.ViewHolder implements View.OnClickListener {

    static ImageView imageVieww;
    static TextView titlee;
    static TextView descrip;
    ItemClickListener itemClickListener;

    HolderM(@NonNull View itemView)
    {
        super(itemView);

        this.imageVieww = itemView.findViewById(R.id.imageViewROW);
        this.titlee = itemView.findViewById(R.id.titleROW);
        this.descrip = itemView.findViewById(R.id.descriptionROW);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemClickListener(v, getLayoutPosition());

    }

    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener = ic;
    }
}
