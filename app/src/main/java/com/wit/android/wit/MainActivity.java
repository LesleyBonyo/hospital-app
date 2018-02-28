package com.wit.android.wit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goWelcome(View view) {
        Intent new_intent = new Intent(this,WelcomeActivity.class);
        startActivity(new_intent);
    }
}
