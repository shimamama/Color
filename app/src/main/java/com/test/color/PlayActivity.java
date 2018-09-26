package com.test.color;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.test.color.R;

public class PlayActivity extends AppCompatActivity {

    // 問題 *** 上から順に問1～  *************************
    String[] question = {
            "甘いものが好き",
            "食事より睡眠",
            "インドア派",
    };

    // yesの時の加点　
    // 2進数で考える  **********************************
    int[] yes = {1, 2, 4};

    int r = 0;  //問題番号
    int count = 3;  // 問題数カウント
    int score = 0;   // スコア
    int bcount = 0;  //Buttonカウント　"0"だったらBACKボタン非表示(無効)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //フォント追加  *******************************************
        TextView txt3 = (TextView) findViewById(R.id.tvCount);
        Typeface font3 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt3.setTypeface(font3);

        TextView txt4 = (TextView) findViewById(R.id.tvQuestion);
        Typeface font4 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt4.setTypeface(font4);

        TextView txt5 = (TextView) findViewById(R.id.yes_button);
        Typeface font5 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt5.setTypeface(font5);

        TextView txt6 = (TextView) findViewById(R.id.no_button);
        Typeface font6 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt6.setTypeface(font6);

        TextView txt7 = (TextView) findViewById(R.id.back_button);
        Typeface font7 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt7.setTypeface(font7);

        // 出題   ***********************************
        ((TextView) findViewById(R.id.tvQuestion)).setText(question[r]);

        //backButton非表示
        findViewById(R.id.back_button).setVisibility(View.INVISIBLE);
    }

    // Yesボタン   **********************************
    public void onYes(View v) {
        count--;
        score += yes[r]; // スコアの加算
        r++;
        bcount++;

        findViewById(R.id.back_button).setVisibility(View.VISIBLE);

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
        bcount++;

        findViewById(R.id.back_button).setVisibility(View.VISIBLE);

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

    //backボタン　質問と加点を一つ戻す ******************************
    public void onBack(View v){

        bcount--;

        if (bcount == 0){
            findViewById(R.id.back_button).setVisibility(View.INVISIBLE);
        }

        count++;
        r--;
        score -= yes[r];
        ((TextView) findViewById(R.id.tvCount)).setText("残り" + count + "問");
        // 出題   ************************************
        ((TextView) findViewById(R.id.tvQuestion)).setText(question[r]);

    }
}





