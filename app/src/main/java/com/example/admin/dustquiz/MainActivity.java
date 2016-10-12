package com.example.admin.dustquiz;

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

    public void firstTopic(View view) {
        Intent objIntent = new Intent(MainActivity.this, TopicOne.class);
        startActivity(objIntent);

    }
    public void secondTopic(View view) {
        Intent objIntent = new Intent(MainActivity.this, TopicTwo.class);
        startActivity(objIntent);

    }
    public void thirdTopic(View view) {
        Intent objIntent = new Intent(MainActivity.this, TopicThree.class);
        startActivity(objIntent);

    }
}
