package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {
public static final String EXTRA_MESSAGE = "com.example.tugas3pretest.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }
    public void user (View view){
        Intent intent = new Intent(this, HomeActivity.class);
        EditText editText = (EditText) findViewById(R.id.etnama);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}