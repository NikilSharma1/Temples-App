package com.example.templesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Temple>templeArrayList=new ArrayList<>();
        templeArrayList.add(new Temple("Badrinath",R.drawable.badrinath));
        templeArrayList.add(new Temple("Kedarnath",R.drawable.kedarnath));
        templeArrayList.add(new Temple("Kashi Vishwanath", R.drawable.kashi));
        templeArrayList.add(new Temple("Khajuraho",R.drawable.khajuraho));
        templeArrayList.add(new Temple("Kanchipuram",R.drawable.kanchipuram));
        templeArrayList.add(new Temple("Lingaraja",R.drawable.lingaraja));
        templeArrayList.add(new Temple("Konark",R.drawable.sun));
        templeArrayList.add(new Temple("Virupaksha",R.drawable.virupaksha));
        templeArrayList.add(new Temple("Somnath",R.drawable.somnath));
        templeArrayList.add(new Temple("Brihadeeswara",R.drawable.brihadeeswara));
        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        CustomAdapter customAdapter=new CustomAdapter(templeArrayList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(customAdapter);



    }
}