package com.example.fruits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setSubtitle("Developed by Mayank Virole");
        ArrayList<Fruits> androidFruits = new ArrayList<>();
        androidFruits.add(new Fruits("शेब" , "Apple",R.drawable.apple));
        androidFruits.add(new Fruits("केला" , "Banana", R.drawable.banana));
        androidFruits.add(new Fruits("नारियल", "Coconut", R.drawable.coconut));
        androidFruits.add(new Fruits("संतरा", "Orange", R.drawable.orange));
        androidFruits.add(new Fruits("अनानास", "Pineapple", R.drawable.pineapple));
        androidFruits.add(new Fruits("तरबूज ","Watermelon",R.drawable.watermelon));
        androidFruits.add(new Fruits("पपीता", "Papaya",R.drawable.papaya));
        androidFruits.add(new Fruits("आम", "Mango", R.drawable.mango));
        androidFruits.add(new Fruits("जामुन ", "BlackBerry",R.drawable.blackberry));
        androidFruits.add(new Fruits("चेरी फल", "Cherry", R.drawable.cherry));

        FruitsAdapter fruitAdapter = new FruitsAdapter(this, androidFruits);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(fruitAdapter);
    }
}