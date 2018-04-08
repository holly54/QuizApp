package com.example.holly.quizapp;

import android.support.v7.app.AppCompatActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.holly.quizapp.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the score as a toast
     */

    public void displayScore(View view) {
        int score = calculateScore();
        String scoreMessage = getString(R.string.final_Score, score);
        Toast.makeText(this, scoreMessage,
                Toast.LENGTH_SHORT).show();

    }

    /**
     * Calculates total questions answered correctly
     *
     * @return score
     */

    private int calculateScore() {
        int score = 0;

        //Checks if question one is answered correctly

        RadioButton radioOne = (RadioButton) findViewById(R.id.question_One_Second_Ans);
        boolean answerQuestionOne = radioOne.isChecked();

        if (answerQuestionOne) {
            score++;
        }

        //Checks if question two is answered correctly

        CheckBox firstCheckBoxQuestionTwo = (CheckBox) findViewById(R.id.question_Two_First_Ans);
        boolean firstChoiceQuestionTwo = firstCheckBoxQuestionTwo.isChecked();

        CheckBox secondCheckBoxQustionTwo = (CheckBox) findViewById(R.id.question_Two_Second_Ans);
        boolean secondChoiceQuestionTwo = secondCheckBoxQustionTwo.isChecked();

        CheckBox thirdCheckBoxQuestionTwo = (CheckBox) findViewById(R.id.question_Two_Third_Ans);
        boolean thirdChoiceQuestionTwo = thirdCheckBoxQuestionTwo.isChecked();

        CheckBox fourthCheckBoxQuestionTwo = (CheckBox) findViewById(R.id.question_Two_Fourth_Ans);
        boolean fourthChoiceQuestionTwo = fourthCheckBoxQuestionTwo.isChecked();

        if (secondChoiceQuestionTwo && fourthChoiceQuestionTwo) {
            score++;
        }

        //Checks if question three is answered correctly

        RadioButton radioThree = (RadioButton) findViewById(R.id.question_Three_Fourth_Ans);
        boolean answerQuestionThree = radioThree.isChecked();

        if (answerQuestionThree) {
            score++;
        }

        //Checks if question four is answered correctly

        RadioButton radioFour = (RadioButton) findViewById(R.id.question_Four_First_Ans);
        boolean answerQuestionFour = radioFour.isChecked();

        if (answerQuestionFour) {
            score++;
        }

        //Checks if question five is answered correctly

        RadioButton radioFive = (RadioButton) findViewById(R.id.question_Five_Second_Ans);
        boolean answerQuestionFive = radioFive.isChecked();

        if (answerQuestionFive) {
            score++;
        }

        //Checks if question six is answered correctly

        RadioButton radioSix = (RadioButton) findViewById(R.id.question_Six_First_Ans);
        boolean answerQuestionSix = radioSix.isChecked();

        if (answerQuestionSix) {
            score++;
        }

        //Checks if question seven is answered correctly

        CheckBox firstCheckBoxQuestionSeven = (CheckBox) findViewById(R.id.question_Seven_First_Ans);
        boolean firstChoiceQuestionSeven = firstCheckBoxQuestionSeven.isChecked();

        CheckBox secondCheckBoxQuestionSeven = (CheckBox) findViewById(R.id.question_Seven_Second_Ans);
        boolean secondChoiceQuestionSeven = secondCheckBoxQuestionSeven.isChecked();

        CheckBox thirdCheckBoxQuestionSeven = (CheckBox) findViewById(R.id.question_Seven_Third_Ans);
        boolean thirdChoiceQuestionSeven = thirdCheckBoxQuestionSeven.isChecked();

        CheckBox fourthCheckBoxQuestionSeven = (CheckBox) findViewById(R.id.question_Seven_Fourth_Ans);
        boolean fourthChoiceQuestionSeven = fourthCheckBoxQuestionSeven.isChecked();

        if (thirdChoiceQuestionSeven && fourthChoiceQuestionSeven) {
            score++;
        }

        //Checks if question eight is answered correctly

        EditText answer = (EditText) findViewById(R.id.question_Eight);
        String userInput = answer.getText().toString();

        if (userInput.equalsIgnoreCase("memphis")) {
            score++;
        }

        //Checks if question nine is answered correctly

        RadioButton radioNine = (RadioButton) findViewById(R.id.question_Nine_First_Ans);
        boolean answerQuestionNine = radioNine.isChecked();

        if (answerQuestionNine) {
            score++;
        }

        //Checks if question ten is answered correctly

        RadioButton radioTen = (RadioButton) findViewById(R.id.question_Ten_Second_Ans);
        boolean answerQuestionTen = radioTen.isChecked();

        if (answerQuestionTen) {
            score++;
        }

        return score;

    }

}