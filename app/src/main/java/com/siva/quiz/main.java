package com.siva.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void rules(View v) {
        Intent intent = new Intent(this,rules.class);
        startActivity(intent);
            }

    public void topic(View v) {
        Intent intent = new Intent(this,Topics.class);
        startActivity(intent);
    }

    public void back(View v) {
        finish();
    }
}
