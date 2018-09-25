package com.test.color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.test.color.R;

public class ResultActivity extends AppCompatActivity {

    String[] result = {
            "月白",
            "深縹",
            "花録色",
            "濡羽色",
            "百塩茶",
            "唐紅",
            "淡紅藤",
            "紫苑色",
    };

    String[] reTest = {
            "geppaku",
            "kokihanada",
            "hanarokusho",
            "nureba-iro",
            "momoshiocha",
            "karakurenai",
            "usubenifuji",
            "shionn-iro",
    };

    int[] reImg = {
            R.drawable.geppaku,
            R.drawable.kokihanada,
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
