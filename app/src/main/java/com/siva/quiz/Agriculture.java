package com.siva.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Agriculture extends AppCompatActivity {
    int i ;
    int score;

    String[] question = {"The percentage of irrigated land in India is about",
            "The percentage of India's total population employed in agriculture is nearly",
            "Which of the following crops needs maximum water per hectare?",
            "The south-west monsoon contributes ____ of the total rain in India.",
            "Which of the following crops is regarded as a plantation crop?"};


    String[] optionA = {"A. 45", "A. 40%", "A. Barley", "A. 86%", "A. Coconut"};

    String[] optionB = {"B. 65", "B. 50%", "B. Maize", "B. 50%", "B. Cotton"};

    String[] optionC = {"C. 35", "C. 60%", "C. Sugarcane", "C. 22%", "C. Sugarcane"};


    String[] optionD = {"D. 25", "D. 70%", "D. Wheat", "D. 100%", "D. Rice"};

    public int[] answers = {1, 3, 2, 0, 2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture);

         i = 0;
score = 0;
        TextView textView = findViewById(R.id.question);
        textView.setText(question[0]);

        RadioButton radioButtonA = (RadioButton) findViewById(R.id.optionA);
        radioButtonA.setText(optionA[0]);

        RadioButton radioButtonB = (RadioButton) findViewById(R.id.optionB);
        radioButtonB.setText(optionB[0]);

        RadioButton radioButtonC = (RadioButton) findViewById(R.id.optionC);
        radioButtonC.setText(optionC[0]);

        RadioButton radioButtonD = (RadioButton) findViewById(R.id.optionD);
        radioButtonD.setText(optionD[0]);


    }

    public void back(View v) {
        finish();
    }

    public void next(View view) {



        TextView textView = findViewById(R.id.question);

        RadioButton radioButtonA = (RadioButton) findViewById(R.id.optionA);

        RadioButton radioButtonB = (RadioButton) findViewById(R.id.optionB);

        RadioButton radioButtonC = (RadioButton) findViewById(R.id.optionC);

        RadioButton radioButtonD = (RadioButton) findViewById(R.id.optionD);


        boolean valueA = radioButtonA.isChecked();
        boolean valueB = radioButtonB.isChecked();
        boolean valueC = radioButtonC.isChecked();
        boolean valueD = radioButtonD.isChecked();

        if ((answers[0] == 0 && valueA) || (answers[0] == 1 && valueB) || (answers[0] == 2 && valueC) ||
                (answers[0] == 3 && valueD)) {
            score += 10;
        }


        if (i == 4) {
            Toast.makeText(getApplicationContext(),"Your score is:"+ String.valueOf(score), Toast.LENGTH_LONG).show();

            Button b = (Button)findViewById(R.id.button4);
            b.setVisibility(View.VISIBLE);



        }
        else {
            if ((answers[i] == 0 && valueA) || (answers[i] == 1 && valueB) || (answers[i] == 2 && valueC) ||
                    (answers[i] == 3 && valueD)) {


                score += 10;
            }
            ++i;
            textView.setText(question[i]);
            radioButtonA.setText(optionA[i]);
            radioButtonB.setText(optionB[i]);
            radioButtonC.setText(optionC[i]);
            radioButtonD.setText(optionD[i]);


            radioButtonA.setChecked(false);
            radioButtonB.setChecked(false);
            radioButtonC.setChecked(false);
            radioButtonD.setChecked(false);

        }

        }
    }



