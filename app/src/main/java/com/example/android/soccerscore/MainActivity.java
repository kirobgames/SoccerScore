package com.example.android.soccerscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText teamLeftNameEditText;
    EditText teamRightNameEditText;

    Button startScoreCount;

    TextView playedHalf;

    TextView teamText;
    TextView teamLeftNameText;
    TextView teamRightNameText;

    TextView goalText;
    TextView goalTeamLeftText;
    TextView goalTeamRightText;

    TextView penaltyText;
    TextView penaltyTeamLeftText;
    TextView penaltyTeamRightText;

    TextView cornerKickText;
    TextView cornerKickTeamLeftText;
    TextView cornerKickTeamRightText;

    TextView foulsText;
    Button foulsTeamLeft;
    Button foulsTeamRight;

    TextView throwInText;
    Button throwInTeamLeft;
    Button throwInTeamRight;

    TextView yellowCardText;
    Button yellowCardTeamLeft;
    Button yellowCardTeamRight;

    TextView redCardText;
    Button redCardTeamLeft;
    Button redCardTeamRight;

    TextView tapText;

    Button cornerTopLeft;
    Button cornerBottomLeft;
    Button cornerTopRight;
    Button cornerBottomRight;

    Button goalLeft;
    Button goalRight;

    Button penaltyLeft;
    Button penaltyRight;

    Button reset;
    Button secondHalf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Set start screen */

        teamLeftNameEditText = (EditText) findViewById(R.id.team_Left_Name_Edit_Text);
        teamRightNameEditText = (EditText) findViewById(R.id.team_Right_Name_Edit_Text);

        startScoreCount = (Button) findViewById(R.id.start_Score_Count);

        /* Set base screen */

        playedHalf = (TextView) findViewById(R.id.playedHalf);

        teamText = (TextView) findViewById(R.id.team_Text);
        teamLeftNameText = (TextView) findViewById(R.id.team_Left_Name_Text);
        teamRightNameText = (TextView) findViewById(R.id.team_Right_Name_Text);

        goalText = (TextView) findViewById(R.id.goal_Text);
        goalTeamLeftText = (TextView) findViewById(R.id.goal_Team_Left);
        goalTeamRightText = (TextView) findViewById(R.id.goal_Team_Right);

        penaltyText = (TextView) findViewById(R.id.penalty_Text);
        penaltyTeamLeftText = (TextView) findViewById(R.id.penalty_Team_Left);
        penaltyTeamRightText = (TextView) findViewById(R.id.penalty_Team_Right);

        cornerKickText = (TextView) findViewById(R.id.corner_Kick_Text);
        cornerKickTeamLeftText = (TextView) findViewById(R.id.corner_Kick_Team_Left);
        cornerKickTeamRightText = (TextView) findViewById(R.id.corner_Kick_Team_Right);

        foulsText = (TextView) findViewById(R.id.fouls_Text);
        foulsTeamLeft = (Button) findViewById(R.id.fouls_Team_Left);
        foulsTeamRight = (Button) findViewById(R.id.fouls_Team_Right);

        throwInText = (TextView) findViewById(R.id.throw_In_Text);
        throwInTeamLeft = (Button) findViewById(R.id.throw_In_Team_Left);
        throwInTeamRight = (Button) findViewById(R.id.throw_In_Team_Right);

        yellowCardText = (TextView) findViewById(R.id.yellow_Card_Text);
        yellowCardTeamLeft = (Button) findViewById(R.id.yellow_Card_Team_Left);
        yellowCardTeamRight = (Button) findViewById(R.id.yellow_Card_Team_Right);

        redCardText = (TextView) findViewById(R.id.red_Card_Text);
        redCardTeamLeft = (Button) findViewById(R.id.red_Card_Team_Left);
        redCardTeamRight = (Button) findViewById(R.id.red_Card_Team_Right);

        tapText = (TextView) findViewById(R.id.tap_Text);

        cornerTopLeft = (Button) findViewById(R.id.corner_Top_Left);
        cornerBottomLeft = (Button) findViewById(R.id.corner_Bottom_Left);
        cornerTopRight = (Button) findViewById(R.id.corner_Top_Right);
        cornerBottomRight = (Button) findViewById(R.id.corner_Bottom_Right);

        goalLeft = (Button) findViewById(R.id.goal_Left);
        goalRight = (Button) findViewById(R.id.goal_Right);

        penaltyLeft = (Button) findViewById(R.id.penalty_Left);
        penaltyRight = (Button) findViewById(R.id.penalty_Right);

        reset = (Button) findViewById(R.id.reset);
        secondHalf = (Button) findViewById(R.id.second_Half);
    }

    public void startScoreCount(View view) {

        if(teamLeftNameEditText.getText().toString().equals("")) {
            teamLeftNameText.setText(R.string.team_a);
        }else{
            teamLeftNameText.setText(teamLeftNameEditText.getText().toString());
        }

        if(teamRightNameEditText.getText().toString().equals("")) {
            teamRightNameText.setText(R.string.team_b);
        }else{
            teamRightNameText.setText(teamRightNameEditText.getText().toString());
        }

        teamLeftNameEditText.setVisibility(View.GONE);
        teamRightNameEditText.setVisibility(View.GONE);
        startScoreCount.setVisibility((View.GONE));

        playedHalf.setVisibility(View.VISIBLE);

        teamText.setVisibility(View.VISIBLE);
        teamLeftNameText.setVisibility(View.VISIBLE);
        teamRightNameText.setVisibility(View.VISIBLE);

        goalText.setVisibility(View.VISIBLE);
        goalTeamLeftText.setVisibility(View.VISIBLE);
        goalTeamRightText.setVisibility(View.VISIBLE);

        penaltyText.setVisibility(View.VISIBLE);
        penaltyTeamLeftText.setVisibility(View.VISIBLE);
        penaltyTeamRightText.setVisibility(View.VISIBLE);


        cornerKickText.setVisibility(View.VISIBLE);
        cornerKickTeamLeftText.setVisibility(View.VISIBLE);
        cornerKickTeamRightText.setVisibility(View.VISIBLE);

        foulsText.setVisibility(View.VISIBLE);
        foulsTeamLeft.setVisibility(View.VISIBLE);
        foulsTeamRight.setVisibility(View.VISIBLE);

        throwInText.setVisibility(View.VISIBLE);
        throwInTeamLeft.setVisibility(View.VISIBLE);
        throwInTeamRight.setVisibility(View.VISIBLE);

        yellowCardText.setVisibility(View.VISIBLE);
        yellowCardTeamLeft.setVisibility(View.VISIBLE);
        yellowCardTeamRight.setVisibility(View.VISIBLE);

        redCardText.setVisibility(View.VISIBLE);
        redCardTeamLeft.setVisibility(View.VISIBLE);
        redCardTeamRight.setVisibility(View.VISIBLE);

        tapText.setVisibility(View.VISIBLE);

        cornerTopLeft.setVisibility(View.VISIBLE);
        cornerBottomLeft.setVisibility(View.VISIBLE);
        cornerTopRight.setVisibility(View.VISIBLE);
        cornerBottomRight.setVisibility(View.VISIBLE);

        goalLeft.setVisibility(View.VISIBLE);
        goalRight.setVisibility(View.VISIBLE);

        penaltyLeft.setVisibility(View.VISIBLE);
        penaltyRight.setVisibility(View.VISIBLE);

        reset.setVisibility(View.VISIBLE);
        secondHalf.setVisibility(View.VISIBLE);

    }

    public void startSecondHalf(View view) {

        playedHalf.setText(R.string.second_half);

        secondHalf.setVisibility(View.GONE);

        changeText(teamLeftNameText,teamRightNameText);

        changeText(goalTeamLeftText,goalTeamRightText);

        changeText(penaltyTeamLeftText,penaltyTeamRightText);

        changeText(cornerKickTeamLeftText,cornerKickTeamRightText);

        changeButton(foulsTeamLeft,foulsTeamRight,true);

        changeButton(throwInTeamLeft,throwInTeamRight,true);

        changeButton(yellowCardTeamLeft,yellowCardTeamRight,true);

        changeButton(redCardTeamLeft,redCardTeamRight,true);

        changeButton(cornerTopLeft,cornerTopRight,false);

        changeButton(cornerBottomLeft,cornerBottomRight,false);

        changeButton(goalLeft,goalRight,false);

        changeButton(penaltyLeft,penaltyRight,false);
    }

    private void changeText(TextView viewOne, TextView viewTwo){

        String changeHelper;

        changeHelper = viewOne.getText().toString();
        viewOne.setText(viewTwo.getText().toString());
        viewTwo.setText(changeHelper);

        viewOne.setBackgroundResource(R.drawable.team_right_text);
        viewTwo.setBackgroundResource(R.drawable.team_left_text);
    }

    private void changeButton(Button viewOne, Button viewTwo, boolean changeText){

        if(changeText) {
            String changeHelper;

            changeHelper = viewOne.getText().toString();
            viewOne.setText(viewTwo.getText().toString());
            viewTwo.setText(changeHelper);

            viewOne.setBackgroundResource(R.drawable.right_team_button);
            viewTwo.setBackgroundResource(R.drawable.left_team_button);
        }else{
            viewOne.setBackgroundResource(R.drawable.left_team_button);
            viewTwo.setBackgroundResource(R.drawable.right_team_button);
        }

    }

    public void leftGoal(View view) {
        increaseTextValue(goalTeamRightText);
    }

    public void rightGoal(View view) {
        increaseTextValue(goalTeamLeftText);
    }

    public void leftPenalty(View view) {
        increaseTextValue(penaltyTeamRightText);
        leftFouls(view);
    }

    public void rightPenalty(View view) {
        increaseTextValue(penaltyTeamLeftText);
        rightFouls(view);
    }

    public void leftCorner(View view) {
        increaseTextValue(cornerKickTeamRightText);
    }

    public void rightCorner(View view) {
        increaseTextValue(cornerKickTeamLeftText);
    }

    private void increaseTextValue(TextView view){
        int num = Integer.valueOf(view.getText().toString()) + 1;
        String number = "" + num;
        view.setText(number);
    }


    public void leftFouls(View view) {
        increaseButtonValue(foulsTeamLeft);
    }

    public void rightFouls(View view) {
        increaseButtonValue(foulsTeamRight);
    }

    public void leftThrowIn(View view) {
        increaseButtonValue(throwInTeamLeft);
    }

    public void rightThrowIn(View view) {
        increaseButtonValue(throwInTeamRight);
    }

    public void leftYellowCard(View view) {
        increaseButtonValue(yellowCardTeamLeft);
    }

    public void rightYellowCard(View view) {
        increaseButtonValue(yellowCardTeamRight);
    }

    public void leftRedCard(View view) {
        increaseButtonValue(redCardTeamLeft);
    }

    public void rightRedCard(View view) {
        increaseButtonValue(redCardTeamRight);
    }

    private void increaseButtonValue(TextView view){
        int num = Integer.valueOf(view.getText().toString()) + 1;
        String number = "" + num;
        view.setText(number);
    }

    public void reset(View view) {

        teamLeftNameEditText.setVisibility(View.VISIBLE);
        teamLeftNameEditText.setText("");
        teamRightNameEditText.setVisibility(View.VISIBLE);
        teamRightNameEditText.setText("");
        startScoreCount.setVisibility((View.VISIBLE));

        playedHalf.setVisibility(View.GONE);
        playedHalf.setText(R.string.first_half);

        teamText.setVisibility(View.GONE);
        teamLeftNameText.setVisibility(View.GONE);
        teamLeftNameText.setText("");
        teamRightNameText.setVisibility(View.GONE);
        teamRightNameText.setText("");

        goalText.setVisibility(View.GONE);
        resetText(goalTeamLeftText,goalTeamRightText);

        penaltyText.setVisibility(View.GONE);
        resetText(penaltyTeamLeftText,penaltyTeamRightText);

        cornerKickText.setVisibility(View.GONE);
        resetText(cornerKickTeamLeftText,cornerKickTeamRightText);

        foulsText.setVisibility(View.GONE);
        resetButton(foulsTeamLeft,foulsTeamRight,true);

        throwInText.setVisibility(View.GONE);
        resetButton(throwInTeamLeft,throwInTeamRight,true);

        yellowCardText.setVisibility(View.GONE);
        resetButton(yellowCardTeamLeft,yellowCardTeamRight,true);

        redCardText.setVisibility(View.GONE);
        resetButton(redCardTeamLeft,redCardTeamRight,true);

        tapText.setVisibility(View.GONE);

        resetButton(cornerTopLeft,cornerTopRight,false);

        resetButton(cornerBottomLeft,cornerBottomRight,false);

        resetButton(goalLeft,goalRight,false);

        resetButton(penaltyLeft,penaltyRight,false);

        resetButton(reset,secondHalf,false);

    }

    private void resetText(TextView viewOne, TextView viewTwo){

        viewOne.setVisibility(View.GONE);
        viewOne.setText(R.string.zero);
        viewTwo.setVisibility(View.GONE);
        viewTwo.setText(R.string.zero);

    }

    private void resetButton(Button viewOne, Button viewTwo, boolean resetText){

        viewOne.setVisibility(View.GONE);
        viewTwo.setVisibility(View.GONE);

        if(resetText){
            viewTwo.setText(R.string.zero);
            viewOne.setText(R.string.zero);
        }

    }
}
