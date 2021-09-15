package com.example.recycler_view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<FoodViewHolder>{

   private Context mContext;
   List<ModelClass>MyFoodlist;

    public MyAdapter(Context mContext, List<ModelClass> myFoodlist) {
        this.mContext = mContext;
        MyFoodlist = myFoodlist;
    }

    @Override
    public FoodViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View mView=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new FoodViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull  FoodViewHolder holder, int position) {
        holder.imageView.setImageResource(MyFoodlist.get(position).getItemImage());
        holder.mTitle.setText(MyFoodlist.get(position).getItemName());
        holder.mDecription.setText(MyFoodlist.get(position).getItemDec());
        holder.mPrice.setText(MyFoodlist.get(position).getItemPrice());




    }

    @Override
    public int getItemCount() {
        return MyFoodlist.size();
    }
}

class FoodViewHolder extends RecyclerView.ViewHolder{

    ImageView  imageView;
    TextView mTitle,mDecription,mPrice;
    CardView cardView;

    public FoodViewHolder(View itemView) {
        super(itemView);

        imageView=itemView.findViewById(R.id.image);
        mTitle=itemView.findViewById(R.id.txtTitle);
        mPrice=itemView.findViewById(R.id.txtPrice);
        mDecription=itemView.findViewById(R.id.txtDescription);
        cardView=itemView.findViewById(R.id.card);
    }
}
