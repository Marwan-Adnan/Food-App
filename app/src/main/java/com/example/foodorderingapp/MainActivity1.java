package com.example.foodorderingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity1 extends AppCompatActivity {
    FloatingActionButton fab ;
    ImageView profile,profile1,listview;
    long time ;

    EditText serch;
    private ConstraintLayout btndetals ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        fab=findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyCart.class);
                startActivity(intent);


            }
        });
        btndetals=findViewById(R.id.btndetals);
        btndetals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShowDetal.class);
                startActivity(intent);


            }
        });
        profile1=findViewById(R.id.profile1);
        profile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NavigationActivity.class);
                startActivity(intent);


            }
        });
        profile=findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NavigationActivity.class);
                startActivity(intent);


            }
        });
        serch=findViewById(R.id.serch);
        serch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), recyclerview.class);
                startActivity(intent);


            }
        });
        listview=findViewById(R.id.listview);
        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);


            }
        });
    }
//    @Override
//    public void onBackPressed() {
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setMessage("Are you sure you want to exit").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                MainActivity1.super.onBackPressed();
//            }
//        })
//                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.cancel();
//                    }
//                });
//        AlertDialog alertDialog = builder.create();
//        alertDialog.show();
//
//    }

//    @Override
//    public void onBackPressed() {
//        if (time +2000 > System.currentTimeMillis()){
//
//            super.onBackPressed();
//        }else{
//            Toast.makeText(this, "Tap again to push the app to background", Toast.LENGTH_SHORT).show();
//        }
//        time=System.currentTimeMillis();
//    }
}