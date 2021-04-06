package com.example.homescreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.aboutus.AboutUs;
import com.example.asktheexpert.expert;
import com.example.contactus.ContactUs;
import com.example.faq.FAQ;
import com.example.feed_back.Feedback;
import com.example.refer.Refer;
import com.example.subject_choice.subject_choice.CareerOpportunity;


import com.google.android.material.navigation.NavigationView;

public class  MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigationview);
        toolbar = findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        }




    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    public void btn_ask(View view) {
        Intent i = new Intent(this, expert.class);
        startActivity(i);
    }

    public void btn_aptitudetest(View v) {
        Intent i = new Intent(this, com.example.aptitudetest.AptitudeTest.class);
        startActivity(i);
    }

    public void btn_subjectchoice(View v) {
        Intent i = new Intent(this, CareerOpportunity.class);
        startActivity(i);
    }


    public void btn_faq(View v) {
        Intent i = new Intent(this, FAQ.class);
        startActivity(i);
    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){

        int itemId = menuItem.getItemId();
        if (itemId == R.id.about_us) {
            Intent intent = new Intent(MainActivity.this, AboutUs.class);
            startActivity(intent);
        } else if (itemId == R.id.contact_us) {
            Intent intent;
            intent = new Intent(MainActivity.this, ContactUs.class);
            startActivity(intent);
        } else if (itemId == R.id.terms) {
            Intent intent;
            intent = new Intent(MainActivity.this, Terms.class);
            startActivity(intent);
        } else if (itemId == R.id.Share) {
            Intent intent;
            intent = new Intent(MainActivity.this, Refer.class);
            startActivity(intent);
        } else if (itemId == R.id.rate_us) {
            Intent intent;
            intent = new Intent(MainActivity.this, Feedback.class);
            startActivity(intent);
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}