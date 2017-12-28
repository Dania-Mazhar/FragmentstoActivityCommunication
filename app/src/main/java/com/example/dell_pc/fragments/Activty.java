package com.example.dell_pc.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public abstract class Activty extends AppCompatActivity implements Frag_A.OnFragmentInteractionListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activty);
    }


    public void OnButtonPressed(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

