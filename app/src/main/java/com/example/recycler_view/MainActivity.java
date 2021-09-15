package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<ModelClass>myFoodList;
    ModelClass modelClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       recyclerView=findViewById(R.id.recycle);
       GridLayoutManager gridLayoutManager=new GridLayoutManager(MainActivity.this,2);
       recyclerView.setLayoutManager(gridLayoutManager);

       myFoodList=new ArrayList<>();
       modelClass=new ModelClass(R.drawable.pizza,"Burger King",
               "Burger King India, which launched operations in the country five year","Rs.400");
        myFoodList.add(modelClass);


        modelClass=new ModelClass(R.drawable.pizza1,"Burger King",
                "Burger King India, which launched operations in the country five year","Rs.400");
        myFoodList.add(modelClass);


        modelClass=new ModelClass(R.drawable.burger,"Burger King",
                "Burger King India, which launched operations in the country five year","Rs.400");
        myFoodList.add(modelClass);


        modelClass=new ModelClass(R.drawable.burger1,"Burger King",
                "Burger King India, which launched operations in the country five year","Rs.400");
        myFoodList.add(modelClass);


        MyAdapter myAdapter=new MyAdapter(MainActivity.this,myFoodList);
        recyclerView.setAdapter(myAdapter);






    }

}