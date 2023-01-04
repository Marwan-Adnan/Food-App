package com.example.foodorderingapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ListView lsvDish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lsvDish = findViewById(R.id.lsvDish);
        ArrayList<Dish> arr = new ArrayList<>();
        Random r = new Random();
        arr.add(new Dish(R.drawable.bu,r.nextInt(10)*5,"Burger"));
        arr.add(new Dish(R.drawable.pi,r.nextInt(10)*5,"Pizza"));
        arr.add(new Dish(R.drawable.kebab,r.nextInt(10)*5,"Kebab"));
        arr.add(new Dish(R.drawable.mansaf,r.nextInt(10)*5,"Mansaf"));
        arr.add(new Dish(R.drawable.sh,r.nextInt(10)*5,"Shawerma"));
        arr.add(new Dish(R.drawable.kk,r.nextInt(10)*5,"Kebsa"));
        arr.add(new Dish(R.drawable.fish,r.nextInt(10)*5,"Fish"));
        arr.add(new Dish(R.drawable.chp,r.nextInt(10)*5,"Chicken Pizza"));
        arr.add(new Dish(R.drawable.chmash,r.nextInt(10)*5,"Grilled chicken"));
        DishAdapter adapter = new DishAdapter(this,0,arr);
        lsvDish.setAdapter(adapter);
    }
}