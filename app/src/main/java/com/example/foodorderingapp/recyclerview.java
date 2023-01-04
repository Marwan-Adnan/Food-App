package com.example.foodorderingapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerview extends AppCompatActivity {
    RecyclerView recyclerview ;
 String s1[] ,s2[] ;
 int images[]  = {R.drawable.cat_1,R.drawable.cat_2,R.drawable.cat_3,R.drawable.cat_4,R.drawable.cat_5,R.drawable.ic_1,R.drawable.ic_2,R.drawable.ic_3,R.drawable.ic_4,R.drawable.ic_5,R.drawable.ic_7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        recyclerview =findViewById(R.id.recycleview);
        s1 = getResources().getStringArray(R.array.name_food);
        s2 = getResources().getStringArray(R.array.food_description);
        MyAdapter myAdapter =new MyAdapter(this,s1,s2,images);
        recyclerview.setAdapter(myAdapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

    }
}