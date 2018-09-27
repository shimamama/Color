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
            "蜜柑色",
            "百塩茶",
            "月白",
            "支子色",
            "聴色",
            "竜胆色",
            "白茶",
            "唐紅",
            "梅重",
            "天色",
            "花録青",
    };

    String[] reTest = {
            "Hakudou",
            "Shion_iro",
            "Nureba_iro",
            "Hanakonjou",
            "Kujakumidori",
            "Mikan_iro",
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
            R.drawable.nurebairo,
            R.drawable.hanakonjou,
            R.drawable.kujakumidori,
            R.drawable.mikaniro,
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

    //Explanationで取得する用のscore
    int score1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView txt8 = (TextView) findViewById(R.id.kekka);
        Typeface font8 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt8.setTypeface(font8);

        TextView txt9 = (TextView) findViewById(R.id.tvResult);
        txt9.setTypeface(font8);

        TextView txt0 = (TextView) findViewById(R.id.tvReText);
        txt0.setTypeface(font8);

        TextView txt01 = (TextView) findViewById(R.id.again_button);
        txt01.setTypeface(font8);

        TextView txt02 = (TextView) findViewById(R.id.startscreen_button);
        txt02.setTypeface(font8);

        TextView txt03 = (TextView) findViewById(R.id.go_exp_button);
        txt03.setTypeface(font8);

        // インテントからスコアを取得    **************************
        int score = getIntent().getIntExtra("score" , 0);
        if( score < 0) score = 0;
        if( score >= result.length) score = result.length;

        // テキストと画像をセット  ********************************
        ((TextView)findViewById(R.id.tvResult)).setText(result[score]);
        ((TextView)findViewById(R.id.tvReText)).setText(reTest[score]);
        ((ImageView)findViewById(R.id.ivReImg)).setImageResource(reImg[score]);
    }

    //もう一度診断する　　****************************************
    public void onAgain(View v){
        Intent intent = new Intent(this,PlayActivity.class);
        startActivity(intent);
    }

    //スタート画面に戻る　　**************************************
    public void onStartscreen(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    //説明画面へ　　*********************************************
    public void onExp(View v){
        score1 = getIntent().getIntExtra("score", 0);
        Intent intent = new Intent(this,ExplanationActivity.class);
        intent.putExtra("score" , score1);
        startActivity(intent);
    }
}
