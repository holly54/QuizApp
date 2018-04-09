package com.example.holly.quizapp;

import com.example.holly.quizapp.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Global strings for the results summary listing
     */
    String questionOneResultsSummary;
    String questionTwoResultsSummary;
    String questionThreeResultsSummary;
    String questionFourResultsSummary;
    String questionFiveResultsSummary;
    String questionSixResultsSummary;
    String questionSevenResultsSummary;
    String questionEightResultsSummary;
    String questionNineResultsSummary;
    String questionTenResultsSummary;


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
        scoreMessage += "\n" + questionOneResultsSummary;
        scoreMessage += "\n" + questionTwoResultsSummary;
        scoreMessage += "\n" + questionThreeResultsSummary;
        scoreMessage += "\n" + questionFourResultsSummary;
        scoreMessage += "\n" + questionFiveResultsSummary;
        scoreMessage += "\n" + questionSixResultsSummary;
        scoreMessage += "\n" + questionSevenResultsSummary;
        scoreMessage += "\n" + questionEightResultsSummary;
        scoreMessage += "\n" + questionNineResultsSummary;
        scoreMessage += "\n" + questionTenResultsSummary;

        Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG).show();

    }

    /**
     * Calculates total questions answered correctly
     *
     * @return score
     */

    public int calculateScore() {
        int score = 0;

        //Checks if question one is answered correctly

        RadioButton radioOne = (RadioButton) findViewById(R.id.question_One_Second_Ans);
        boolean answerQuestionOne = radioOne.isChecked();

        if (answerQuestionOne) {
            score++;
            questionOneResultsSummary = getString(R.string.questionOneIsCorrect);
        } else {
            questionOneResultsSummary = getString(R.string.questionOneIsWrong);
        }

        //Checks if question two is answered correctly

        CheckBox firstCheckBoxQuestionTwo = (CheckBox) findViewById(R.id.question_Two_First_Ans);
        boolean firstChoiceQuestionTwo = firstCheckBoxQuestionTwo.isChecked();

        CheckBox secondCheckBoxQuestionTwo = (CheckBox) findViewById(R.id.question_Two_Second_Ans);
        boolean secondChoiceQuestionTwo = secondCheckBoxQuestionTwo.isChecked();

        CheckBox thirdCheckBoxQuestionTwo = (CheckBox) findViewById(R.id.question_Two_Third_Ans);
        boolean thirdChoiceQuestionTwo = thirdCheckBoxQuestionTwo.isChecked();

        CheckBox fourthCheckBoxQuestionTwo = (CheckBox) findViewById(R.id.question_Two_Fourth_Ans);
        boolean fourthChoiceQuestionTwo = fourthCheckBoxQuestionTwo.isChecked();

        if (!firstChoiceQuestionTwo && secondChoiceQuestionTwo && !thirdChoiceQuestionTwo && fourthChoiceQuestionTwo) {
            score++;
            questionTwoResultsSummary = getString(R.string.questionTwoIsCorrect);
        } else {
            questionTwoResultsSummary = getString(R.string.questionTwoIsWrong);
        }

        //Checks if question three is answered correctly

        RadioButton radioThree = (RadioButton) findViewById(R.id.question_Three_Fourth_Ans);
        boolean answerQuestionThree = radioThree.isChecked();

        if (answerQuestionThree) {
            score++;
            questionThreeResultsSummary = getString(R.string.questionThreeIsCorrect);
        } else {
            questionThreeResultsSummary = getString(R.string.questionThreeIsWrong);
        }
        //Checks if question four is answered correctly

        RadioButton radioFour = (RadioButton) findViewById(R.id.question_Four_First_Ans);
        boolean answerQuestionFour = radioFour.isChecked();

        if (answerQuestionFour) {
            score++;
            questionFourResultsSummary = getString(R.string.questionFourIsCorrect);
        } else {
            questionFourResultsSummary = getString(R.string.questionFourIsWrong);
        }

        //Checks if question five is answered correctly

        RadioButton radioFive = (RadioButton) findViewById(R.id.question_Five_Second_Ans);
        boolean answerQuestionFive = radioFive.isChecked();

        if (answerQuestionFive) {
            score++;
            questionFiveResultsSummary = getString(R.string.questionFiveIsCorrect);
        } else {
            questionFiveResultsSummary = getString(R.string.questionFiveIsWrong);
        }

        //Checks if question six is answered correctly

        RadioButton radioSix = (RadioButton) findViewById(R.id.question_Six_First_Ans);
        boolean answerQuestionSix = radioSix.isChecked();

        if (answerQuestionSix) {
            score++;
            questionSixResultsSummary = getString(R.string.questionSixIsCorrect);
        } else {
            questionSixResultsSummary = getString(R.string.questionSixIsWrong);
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

        if (!firstChoiceQuestionSeven && !secondChoiceQuestionSeven && thirdChoiceQuestionSeven && fourthChoiceQuestionSeven) {
            score++;
            questionSevenResultsSummary = getString(R.string.questionSevenIsCorrect);
        } else {
            questionSevenResultsSummary = getString(R.string.questionSevenIsWrong);
        }

        //Checks if question eight is answered correctly

        EditText answer = (EditText) findViewById(R.id.question_Eight);
        String userInput = answer.getText().toString();

        if (userInput.equalsIgnoreCase("memphis")) {
            score++;
            questionEightResultsSummary = getString(R.string.questionEightIsCorrect);
        } else {
            questionEightResultsSummary = getString(R.string.questionEightIsWrong);
        }

        //Checks if question nine is answered correctly

        RadioButton radioNine = (RadioButton) findViewById(R.id.question_Nine_First_Ans);
        boolean answerQuestionNine = radioNine.isChecked();

        if (answerQuestionNine) {
            score++;
            questionNineResultsSummary = getString(R.string.questionNineIsCorrect);
        } else {
            questionNineResultsSummary = getString(R.string.questionNineIsWrong);
        }

        //Checks if question ten is answered correctly

        RadioButton radioTen = (RadioButton) findViewById(R.id.question_Ten_Second_Ans);
        boolean answerQuestionTen = radioTen.isChecked();

        if (answerQuestionTen) {
            score++;
            questionTenResultsSummary = getString(R.string.questionTenIsCorrect);
        } else {
            questionTenResultsSummary = getString(R.string.questionTenIsWrong);
        }

        return score;

    }

}