package com.test.color;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.test.color.R;

public class ResultActivity extends AppCompatActivity {

    String[] result = {
            "白銅",
            "紫苑色",
            "濡羽色",
            "花紺青",
            "孔雀緑",
            "琥珀色",
            "百塩茶",
            "月白",
            "支子色",
            "聴色",
            "竜胆色",
            "白茶",
            "唐紅",
            "梅重",
            "天色",
            "花録色",
    };

    String[] reTest = {
            "Hakudou",
            "Shion_iro",
            "Nureba_iro",
            "Hanakonjou",
            "Kujakumidori",
            "Kohaku_iro",
            "Momoshiocha",
            "Geppaku",
            "Kuchinashi_iro",
            "Yurushi_iro",
            "Rindou_iro",
            "Shiracha",
            "Karakurenai",
            "Umegasane",
            "Ama_iro",
            "Hanarokusho"
    };

    int[] reImg = {
            R.drawable.hakudou,
            R.drawable.shion_iro,
            R.drawable.nureba_iro,
            R.drawable.hanakonjou,
            R.drawable.kujakumidori,
            R.drawable.kohaku,
            R.drawable.momoshiocha,
            R.drawable.geppaku,
            R.drawable.kuchinashiiro,
            R.drawable.yurushiiro,
            R.drawable.rindou,
            R.drawable.shiratya,
            R.drawable.karakurenai,
            R.drawable.umegasane,
            R.drawable.amairo,
            R.drawable.hanarokusho,
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

        TextView txt01 = (TextView) findViewById(R.id.again_button);
        Typeface font01 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt01.setTypeface(font01);

        TextView txt02 = (TextView) findViewById(R.id.startscreen_button);
        Typeface font02 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt02.setTypeface(font02);

        // インテントからスコアを取得    **************************
        int score = getIntent().getIntExtra("score" , 0);
        if( score < 0) score = 0;
        if( score >= result.length) score = result.length;

        // テキストと画像をセット  ********************************
        ((TextView)findViewById(R.id.tvResult)).setText(result[score]);
        ((TextView)findViewById(R.id.tvReText)).setText(reTest[score]);
        ((ImageView)findViewById(R.id.ivReImg)).setImageResource(reImg[score]);
    }

    public void onAgain(View v){
        Intent intent = new Intent(this,PlayActivity.class);
        startActivity(intent);
    }

    public void onStartscreen(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
