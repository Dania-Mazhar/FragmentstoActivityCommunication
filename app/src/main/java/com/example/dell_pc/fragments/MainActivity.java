package com.example.dell_pc.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnButtonPressed(String message) {
        TextView messageget= (TextView) findViewById(R.id.textmessage);
        messageget.setText(message);
    }
}
