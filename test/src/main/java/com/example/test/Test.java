package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.navigationtry.Home;
import com.example.navigationtry.LoadPage;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void btn_test(View view) {
        Intent i= new Intent(this, LoadPage.class);
        startActivity(i);
    }
}