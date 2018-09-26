package com.test.color;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.test.color.R;

public class ResultActivity extends AppCompatActivity {

    String[] result = {
            "月白",
            "花紺青",
            "花録色",
            "濡羽色",
            "百塩茶",
            "唐紅",
            "淡紅藤",
            "紫苑色",
    };

    String[] reTest = {
            "geppaku",
            "hanakonjou",
            "hanarokusho",
            "nureba-iro",
            "momoshiocha",
            "karakurenai",
            "usubenifuji",
            "shionn-iro",
    };

    int[] reImg = {
            R.drawable.geppaku,
            R.drawable.hanakonjou,
            R.drawable.hanarokusho,
            R.drawable.nureba_iro,
            R.drawable.momoshiocha,
            R.drawable.karakurenai,
            R.drawable.usubenifuji,
            R.drawable.shion_iro,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView txt8 = (TextView) findViewById(R.id.kekka);
        Typeface font8 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt8.setTypeface(font8);

        TextView txt9 = (TextView) findViewById(R.id.tvResult);
        Typeface font9 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt9.setTypeface(font9);

        TextView txt0 = (TextView) findViewById(R.id.tvReText);
        Typeface font0 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt0.setTypeface(font0);

        // インテントからスコアを取得    **************************
        int score = getIntent().getIntExtra("score" , 0);
        if( score < 0) score = 0;
        if( score >= result.length) score = result.length;

        // テキストと画像をセット  ********************************
        ((TextView)findViewById(R.id.tvResult)).setText(result[score]);
        ((TextView)findViewById(R.id.tvReText)).setText(reTest[score]);
        ((ImageView)findViewById(R.id.ivReImg)).setImageResource(reImg[score]);
    }
}
