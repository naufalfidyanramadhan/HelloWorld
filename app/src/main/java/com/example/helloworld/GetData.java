package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GetData extends AppCompatActivity {
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

        age = getIntent().getIntExtra("AGE", 20);
        TextView tv = findViewById(R.id.textView4);

        tv.setText(age);
    }
}