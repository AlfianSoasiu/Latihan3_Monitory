package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //GET THE
        Intent intent = getIntent();
        String message = intent.getStringExtra(BiodataActivity.EXTRA_MESSAGE);

        // CAPTURE
        TextView textView = findViewById(R.id.baris12);
        textView.setText(message);

        TextView textView2 = findViewById(R.id.baris22);
        textView2.setText(message);
    }
}