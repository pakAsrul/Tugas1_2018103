package com.example.pertemuan1_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void biodata(View view) {
        Intent a = new Intent(MainActivity.this,
                biodata.class);
        startActivity(a);
    }

    public void segitiga(View view) {
        Intent a = new Intent(MainActivity.this, segitiga.class);
        startActivity(a);
    }

}