package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Items_Details extends AppCompatActivity {

     ImageView foodImage;
     TextView foodDec,foodPrice,foodname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_details);

        foodImage=findViewById(R.id.itemimage);
        foodDec=findViewById(R.id.fooddec);
        foodPrice=findViewById(R.id.foodPrice);
        foodname=findViewById(R.id.foodName);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            foodImage.setImageResource(bundle.getInt("Image"));
            foodDec.setText(bundle.getString("Description"));
            foodPrice.setText(bundle.getString("Price"));
            foodname.setText(bundle.getString("Name"));
        }

    }
}