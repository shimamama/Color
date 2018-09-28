package com.test.color;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.test.color.MainActivity;

import java.nio.channels.GatheringByteChannel;

//スタート画面部分

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //タイトルとボタンにフォント追加  ******************************
        TextView txt = (TextView) findViewById(R.id.title_text);
        Typeface font = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt.setTypeface(font);

        Button txt2 = (Button) findViewById(R.id.title_start);
        txt2.setTypeface(font);

        Button txt21 = (Button) findViewById(R.id.credit);
        txt21.setTypeface(font);
    }

    // 画面切り替え  **********************************
    public void onStart(View v){
        Intent intent = new Intent(this,PlayActivity.class);
        startActivity(intent);
        finish();
    }

    //クレジット画面  *************************************
    public void onCredit(View v){
        Intent intent = new Intent(this,CreditActivity.class);
        startActivity(intent);
        finish();
    }
}