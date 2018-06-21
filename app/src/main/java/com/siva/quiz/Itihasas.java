package com.siva.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Itihasas extends AppCompatActivity {
    int i ;
    int score;

    String[] question = {"Who is the step-father of Karna? He is also the charioteer of Bhisma in Mahabharatha?",
            "In Ramayana, when Lakshmana was unconscious in battlefield, who asked Hanuman to bring Sanjeevani Herbs?",
            "Which demoness acompanied Mother Sita in Ashoka Vanam in Lanka during her Kidnapped period ? She is also the daughter of Vibhisana.",
            "Who is the mother and father of Vyasdev ?",
            "Who is the mother of Garuda ?"
    };

    String[] optionA = {"A. Shalya", "A. Rama", "A. Mandhodari", "A. Satyavati and Parashara", "A. Vinathi"};

    String[] optionB = {"B. Drupada", "B. Susena", "B. Trigata", "B. Ganga and Shantanu", "B. Kadruva"};

    String[] optionC = {"C. Athiratha", "C. Jambavan", "C. Ayonmukhi", "C. Ganga and Parashara", "C. Madri"};

    String[] optionD = {"D. Satyaki", "D. Sugriva", "D. Lankini", "D. Satyavati and Shantanu", "D. Sunithi"};

    public int[] answers = {2,1,1,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itihasas);


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
            Toast.makeText(getApplicationContext(),"Your score is:"+String.valueOf(score), Toast.LENGTH_LONG).show();
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

