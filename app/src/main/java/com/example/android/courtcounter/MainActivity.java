package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ServiceConfigurationError;

public class MainActivity extends AppCompatActivity {
    int ScoreforTeamA;
    int ScoreforTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addThreeForTeamA(View v){
        ScoreforTeamA=ScoreforTeamA+3;
        displayForTeamA(ScoreforTeamA);

    }
    public void addTwoForTeamA(View v){
        ScoreforTeamA=ScoreforTeamA+2;
        displayForTeamA(ScoreforTeamA);

    }
    public void addOneForTeamA(View v){
        ScoreforTeamA=ScoreforTeamA+1;
        displayForTeamA(ScoreforTeamA);

    }

    public void addThreeForTeamB(View v){
        ScoreforTeamB=ScoreforTeamB+3;
        displayForTeamB(ScoreforTeamB);

    }
    public void addTwoForTeamB(View v){
        ScoreforTeamB=ScoreforTeamB+2;
        displayForTeamB(ScoreforTeamB);

    }
    public void addOneForTeamB(View v){
        ScoreforTeamB=ScoreforTeamB+1;
        displayForTeamB(ScoreforTeamB);

    }
    public void resetScore(View v){
        ScoreforTeamA=0;
        ScoreforTeamB=0;
        displayForTeamA(ScoreforTeamA);
        displayForTeamB(ScoreforTeamB);

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
}
