package com.example.iiatimd_w1_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toSecondScreenButton = findViewById(R.id.toSecondScreen);
        toSecondScreenButton.setOnClickListener(this);
    }

    public void onClick(View v){
        Log.d("onClick Test", "Hallo ik ben gelklikt");

        //bundle
        Bundle bundelForSecondScreen = new Bundle();

        //string
        String name = "Jeroen";

        // string in bunde plaatsen
        // key = "name"
        bundelForSecondScreen.putString("name",name);

        //Bundle meegeven aan de Intent (Intent is een wijziging van een scherm naar de ander)
        Intent toSecondScreenIntent = new Intent(this,SecondActivity.class);

        //als je bundle mee wilt geven moet je dieze wel ook echt doorgeven om later te kunnen uitlezen
        toSecondScreenIntent.putExtras(bundelForSecondScreen);

        //bundle
        Bundle bundelForLogin = new Bundle();

        //string
        String login_gegevens = "login-name, login-pwd";

        // string in bunde plaatsen
        // key = "name"
        bundelForLogin.putString("login-gegevens",login_gegevens);

        //Bundle meegeven aan de Intent (Intent is een wijziging van een scherm naar de ander)
        Intent toCheckLoginIntent = new Intent(this,SecondActivity.class);

        //als je bundle mee wilt geven moet je dieze wel ook echt doorgeven om later te kunnen uitlezen
        toCheckLoginIntent.putExtras(bundelForLogin);

        //starten activiy
        startActivity(toCheckLoginIntent);
    }
}
