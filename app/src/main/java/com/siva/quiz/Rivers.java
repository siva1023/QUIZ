package com.siva.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Rivers extends AppCompatActivity {
    int i ;
    int score;

    String[] question = {"Which of the following groups of rivers originate from the Himachal mountains?",
            "Which of the following important rivers of India does not originate from the Western Ghats?",
            "Which of the following river does not originates from India?",
            "Which of the following is not the Peninsular Rivers of India?",
            "Which of the following river is named as the “Dakshina Ganga”?"
    };

    String[] optionA = {"A. Beas, Ravi and Chenab", "A. Cauvery", "A. Ganga", "A Mahanadi", "A. Mahanadi"};

    String[] optionB = {"B. Ravi, Chenab and Jhelum", "B. Godavari", "B. Yamuna", "B. Godavari", "B Krishna"};

    String[] optionC = {"C. Sutlej, Beas and Ravi", "C. Krishna", "C. Chambal", "C. Krishna", "C Godavari"};

    String[] optionD = {"D. Sutlej, Ravi and Jhelum", "D. Mahanadi", "D. Brahmaputra", "D. Ganga", "D. Cauvery"};

    public int[] answers = {0,3,3,3,3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rivers);


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
            Toast.makeText(getApplicationContext(), "Your score is:"+String.valueOf(score), Toast.LENGTH_LONG).show();
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

