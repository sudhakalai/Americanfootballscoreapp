package com.example.android.americanfootballscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.americanfootballscoreapp.R.dimen.score;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Declaring global variables*/
    int teamAScore = 0;
    int teamBScore = 0;
    int teamAFoul = 0;
    int teamBFoul = 0;

    /*Display team A score*/
    public void teamAScorePoints(int a) {
        TextView scoreA = (TextView) findViewById(R.id.teamAScore);
        scoreA.setText(String.valueOf(a));
    }

    /*Display team B score*/
    public void teamBScorePoints(int a) {
        TextView scoreB = (TextView) findViewById(R.id.teamBScore);
        scoreB.setText(String.valueOf(a));
    }

    /*Display team A foul score*/
    public void teamAFoulPoints(int a) {
        TextView foulA = (TextView) findViewById(R.id.teamAFoulScore);
        foulA.setText(String.valueOf(a));
    }

    /*Display team B foul score*/
    public void teamBFoulPoints(int a) {
        TextView foulB = (TextView) findViewById(R.id.teamBFoulScore);
        foulB.setText(String.valueOf(a));
    }

    /*Field goal team A*/

    public void fieldGoalA(View view) {
        teamAScore += 3;
        teamAScorePoints(teamAScore);
    }

    /*Field goal team B*/

    public void fieldGoalB(View view) {
        teamBScore += 3;
        teamBScorePoints(teamBScore);
    }

       /*Touch Down team A*/

    public void touchDownA(View view) {
        teamAScore += 6;
        teamAScorePoints(teamAScore);
    }

    /*Touch Down team B*/

    public void touchDownB(View view) {
        teamBScore += 6;
        teamBScorePoints(teamBScore);
    }

       /*Extra team A*/

    public void extraA(View view) {
        teamAScore += 1;
        teamAScorePoints(teamAScore);
    }

    /*Extra team B*/

    public void extraB(View view) {
        teamBScore += 1;
        teamBScorePoints(teamBScore);
    }
    /*Safety team A*/

    public void safetyA(View view) {
        teamAScore += 2;
        teamAScorePoints(teamAScore);
    }

    /*Safety team B*/

    public void safetyB(View view) {
        teamBScore += 2;
        teamBScorePoints(teamBScore);
    }
    /*Fair catch kick team A*/

    public void fairCatchKickA(View view) {
        teamAScore += 3;
        teamAScorePoints(teamAScore);
    }

    /*Fair catch kick team B*/

    public void fairCatchKickB(View view) {
        teamBScore += 3;
        teamBScorePoints(teamBScore);
    }

    /*Foul team A*/

    public void foulA(View view) {
        teamAFoul += 1;
        teamAFoulPoints(teamAFoul);
    }

    /*Foul team B*/

    public void foulB(View view) {
        teamBFoul += 1;
        teamBFoulPoints(teamBFoul);
    }

    /* Reset*/

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        teamAFoul = 0;
        teamBFoul = 0;
        teamAScorePoints(teamAScore);
        teamBScorePoints(teamBScore);
        teamAFoulPoints(teamAFoul);
        teamBFoulPoints(teamBFoul);
    }


}
