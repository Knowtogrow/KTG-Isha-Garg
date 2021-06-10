package com.example.predictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Career_Predictor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predictor);
    }

        // BUTTON DETAILS

    public void Submit (View view){
            startActivity(new Intent(getApplicationContext(), Loading.class));
        }
    }
