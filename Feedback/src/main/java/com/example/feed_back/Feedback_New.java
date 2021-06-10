package com.example.feed_back;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import com.firebase.client.Firebase;


import androidx.appcompat.app.AppCompatActivity;

public class Feedback_New extends AppCompatActivity {
    private Firebase Ref;
    private EditText username,feedback;
    TextView tvFeedback;
    RatingBar rbStars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);

        username = (EditText)findViewById(R.id.user);
        feedback = (EditText)findViewById(R.id.feedback);
        Firebase.setAndroidContext(this);
        Ref=new Firebase("https://feed-back-9d701-default-rtdb.firebaseio.com/");



        tvFeedback = findViewById(R.id.tvFeedback);
        rbStars = findViewById(R.id.rbStars);

        rbStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (rating == 0) {
                    tvFeedback.setText("Very Dissatisfied");
                } else if (rating == 1) {
                    tvFeedback.setText("Dissatisfied");
                } else if (rating == 2 ) {
                    tvFeedback.setText("Average");
                } else if (rating == 3 ) {
                    tvFeedback.setText("OK");
                } else if (rating == 4) {
                    tvFeedback.setText("Satisfied");
                } else if (rating == 5) {
                    tvFeedback.setText("Very Satisfied");
                } else {

                }


            }
        });
    }

    public void feedbacksent(View view) {
        String usernameinput=username.getText().toString();
        String feedbackinput=feedback.getText().toString();
        Firebase Refusername=Ref.child("Username");
        Refusername.setValue(usernameinput);
        Firebase Reffeedback=Ref.child("Feedback_New");
        Reffeedback.setValue(feedbackinput);
    }
}