package com.example.admin.dustquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class TopicThree extends AppCompatActivity {


    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_three);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1a1:
                if (checked)
                    // Answer one
                    score = score + 1;
                break;
            case R.id.q1a2:
                if (checked)
                    // Answer two
                    score = score + 0;
                break;

            //q2
            case R.id.q2a1:
                if (checked)
                    // Answer one
                    score = score + 0;
                break;
            case R.id.q2a2:
                if (checked)
                    // Answer two
                    score = score + 1;
                break;

            //q3
            case R.id.q3a1:
                if (checked)
                    // Answer one
                    score = score + 0;
                break;
            case R.id.q3a2:
                if (checked)
                    // Answer two
                    score = score + 1;
                break;
            //q4
            case R.id.q4a1:
                if (checked)
                    // Answer one
                    score = score + 1;
                break;
            case R.id.q4a2:
                if (checked)
                    // Answer two
                    score = score + 0;
                break;
            //q5
            case R.id.q5a1:
                if (checked)
                    // Answer one
                    score = score + 0;
                break;
            case R.id.q5a2:
                if (checked)
                    // Answer two
                    score = score + 1;
                break;
        }}


    public void results(View view) {
        displayScore(score);
    }

    private void displayScore(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.result);
        quantityTextView.setText("" + number);
    }

}
