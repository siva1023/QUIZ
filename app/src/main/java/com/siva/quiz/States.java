package com.siva.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class States extends AppCompatActivity {
    int i ;
    int score;

    String[] question = {"The India's highest annual rainfall is reported at",
            "The state having a largest area of forest cover in India is",
            "The principal copper deposits of India lie in which of the following places?",
            "The two states of India, most richly endowed with iron ore, are",
            "Which of the following groups accounts for over 90 per cent of India's annual coal production?"
    };

    String[] optionA = {"A. Namchi, Sikkim", "A. Arunachal Pradesh", "A. Hazaribag and Singbhum of Bihar",
            "A. Bihar and Orissa", "A. Bihar, Orissa and West Bengal"};

    String[] optionB = {"B. Churu, Rajasthan", "B. Haryana", "B. Khetri and Daribo areas of Rajasthan",
            "B. Madhya Pradesh and Orissa", "B. Bihar, Orissa and Madhya Pradesh"};

    String[] optionC = {"C. Madhya Pradesh", "C. Anantapur in Andhra Pradesh", "C. Bihar and West Bengal",
            "C. Orissa, Madhya Pradesh and Tamil Nadu"};

    String[] optionD = {"D. Chamba, Himachal Pradesh", "D. Assam", "D. Siwaliks in Uttar Pradesh and in Karnataka",
            "D. Madhya Pradesh and West Bengal", "D. West Bengal, Madhya Pradesh and Tamil Nadu"};

    public int[] answers = {2,2,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states);


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

