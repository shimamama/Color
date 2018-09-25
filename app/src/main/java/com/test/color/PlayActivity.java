package com.test.color;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.test.color.R;

public class PlayActivity extends AppCompatActivity {

    // 問題 *** 上から順に問1～  **************************************
    String[] question = {
            "甘いものが好き",
            "食事より睡眠",
            "インドア派",
    };

    // yesの時の加点　*******************************
    int[] yes = {1, 2, 4};

    int r = 0;  //問題番号
    int count = 3;  // 問題数
    int score = 0;   // スコアの合計（評価点）

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // 出題   ***********************************
        ((TextView) findViewById(R.id.tvQuestion)).setText(question[r]);
        //r = r+1; //次の問いを表示
    }

    // Yesボタン   **********************************
    public void onYes(View v) {
        count--;
        score += yes[r]; // スコアの加算
        r++;

        if (count > 0) {
            ((TextView) findViewById(R.id.tvCount)).setText("残り" + count + "問");
            // 出題  *********************************
            ((TextView) findViewById(R.id.tvQuestion)).setText(question[r]);

        } else {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("score" , score);
            startActivity(intent);
            finish();
        }
    }


    // Noボタン   ***********************************
    public void onNo(View v) {
        count--;
        r++;
        if (count > 0) {
            ((TextView) findViewById(R.id.tvCount)).setText("残り" + count + "問");
            // 出題   ************************************

            ((TextView) findViewById(R.id.tvQuestion)).setText(question[r]);
        } else {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("score" , score);
            startActivity(intent);
            finish();
        }
    }
}