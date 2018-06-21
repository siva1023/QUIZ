package com.siva.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Constitution extends AppCompatActivity {
    int i ;
    int score;

    String[] question = {"The number of major languages, recognized in the Indian Union as official language, are",
            "The constitution is divided into how many articles ",
            "Which articles gives special status to Jammu and Kashmir?",
            "Eighth Schedule to the Constitution of India deals with ___.",
            "The national flag was adopted by the Constituent Assembly of India on 22 July 1947 and was presented to the nation on 14th August 1947 on behalf of"
    };

    String[] optionA = {"A. 15", "A. 395", "A. 305", " A. Official languages", "A. the minorities of India"};

    String[] optionB = {"B. 22", "B. 448", "B. 320", "B. Municipalities (urban local government)", "B. the National Integration Council"};

    String[] optionC = {"C. 12", "C. 452", "C. 370", " C. List of oaths of offices for elected officials and judges.", "C. the women of India"};

    String[] optionD = {"D. 9", "D. 368", "D. 356", "D.Anti defection provisions for Members of Parliament", "D. the people of India"};

    public int[] answers = {1,1,2,0,2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constitution);


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






