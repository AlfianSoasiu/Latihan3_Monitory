package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode);
    }
    public void biodata (View view){
        Intent intent = new Intent(this,BiodataActivity.class);
        startActivity(intent);
    }
}