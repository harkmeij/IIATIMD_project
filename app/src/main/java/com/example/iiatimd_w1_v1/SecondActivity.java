package com.example.iiatimd_w1_v1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstances) {
        super.onCreate(savedInstances);
        //layout koppelen
        setContentView(R.layout.activity_second);

        // key values ophalen en in de muBundle plaatsen
        Bundle myBundle = getIntent().getExtras();
        //Log.d("bundleTest", myBundle.getString("name"));
        Log.d("bundleTest2", myBundle.getString("login-gegevens"));
    }


}
