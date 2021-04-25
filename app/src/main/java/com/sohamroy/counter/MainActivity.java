package com.sohamroy.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        display(scoreA, R.id.teamA_score);
        display(scoreB, R.id.teamB_score );
    }

    private void display(int number, int setId){
        TextView t = (TextView) findViewById(setId);
        t.setText("" + number);
    }

    public void threePointA(View view) {
        scoreA += 3;
        display(scoreA, R.id.teamA_score);
    }

    public void threePointB(View view) {
        scoreB += 3;
        display(scoreB, R.id.teamB_score);
    }

    public void twoPointA(View view) {
        scoreA += 2;
        display(scoreA, R.id.teamA_score);
    }
    public void twoPointB(View view) {
        scoreB += 2;
        display(scoreB, R.id.teamB_score);
    }

    public void penaltyA(View view) {
        scoreA += 1;
        display(scoreA, R.id.teamA_score);
    }
    public void penaltyB(View view) {
        scoreB += 1;
        display(scoreB, R.id.teamB_score);
    }

//    private void displayB(int number){
//        TextView t = (TextView) findViewById(R.id.teamB_score);
//        t.setText("" + number);
//    }

}