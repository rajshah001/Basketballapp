package com.example.android.basketballapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointsa = 0;
    int pointsb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        pointsa += 1;
        displayForTeamA(pointsa);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        pointsa += 2;
        displayForTeamA(pointsa);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        pointsa += 3;
        displayForTeamA(pointsa);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamB(View v) {
        pointsb += 1;
        displayForTeamB(pointsb);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        pointsb += 2;
        displayForTeamB(pointsb);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        pointsb += 3;
        displayForTeamB(pointsb);
    }

    /**
     * Resets the score for Teams
     */
    public void Reset(View V) {
        pointsa = 0;
        pointsb = 0;
        displayForTeamA(pointsa);
        displayForTeamB(pointsb);
    }
}