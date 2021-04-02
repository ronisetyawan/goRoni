package com.example.goroni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutama);
    }

    public void clickRS(View view) {
        //gambar rs di click

        Intent i =  new Intent(this, RS.class);

        startActivity(i);

    }

    public void clickSC(View view) {
        //gambar sc di click

        Intent i =  new Intent(this, SC.class);

        startActivity(i);
    }

    public void clickPL(View view) {
        //gambar pl di click

        Intent i =  new Intent(this, PL.class);

        startActivity(i);
    }

    public void clickSP(View view) {
        //gambar sp di click

        Intent i =  new Intent(this, SP.class);

        startActivity(i);
    }
}