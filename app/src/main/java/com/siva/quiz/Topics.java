package com.siva.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Topics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
    }

    public void Agriculture(View v) {
        Intent intent = new Intent(this, Agriculture.class);
        startActivity(intent);
    }

    public void Constitution(View v) {
        Intent intent = new Intent(this, Constitution.class);
        startActivity(intent);
    }

    public void Rivers(View v) {
        Intent intent = new Intent(this, Rivers.class);
        startActivity(intent);
    }

    public void States(View v) {
        Intent intent = new Intent(this, States.class);
        startActivity(intent);
    }

    public void Itihasas(View v) {
        Intent intent = new Intent(this, Itihasas.class);
        startActivity(intent);
    }

    public void back(View v) {
        finish();
    }

}
