package com.test.color;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

        TextView txt22 = (TextView) findViewById(R.id.credit_text0);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt22.setTypeface(font2);

        TextView txt23 = (TextView) findViewById(R.id.credit_text1);
        txt23.setTypeface(font2);

        TextView txt24 = (TextView) findViewById(R.id.credit_text2);
        txt24.setTypeface(font2);

        TextView txt25 = (TextView) findViewById(R.id.credit_text3);
        txt25.setTypeface(font2);

        TextView txt26 = (TextView) findViewById(R.id.back_start_button2);
        txt26.setTypeface(font2);
    }

    //スタート画面に戻る  *****************************************
    public void onBs(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
