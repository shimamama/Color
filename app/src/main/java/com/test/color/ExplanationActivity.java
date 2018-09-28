package com.test.color;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ExplanationActivity extends AppCompatActivity {

    String[] result1 = {
            "銀色とは、色としては白や灰色だが金属光沢、つまり強い指向性を持つことで銀色になる。" +
                    "ただし、完全な指向性を持てばそれは鏡面になる。" +
                    "色だけの性質ではないので、色空間や表色系だけで完全に表すことはできないが、" +
                    "ウェブカラーにおいて銀色は#C0C0C0として定義されており、これは明るい灰色である",

            "紫苑色は特に平安中期に愛好され、『源氏物語』の「紫苑色の折にあいたる薄物の裳」と" +
                    "あるように織色、重色、染色の三種があり秋の衣装に用いられた。",

            "濡羽色とは、女性の髪の色彩を形容する言葉。またその髪のもつ黒の色名。"+
                    "日本人女性の理想美であり、もっと一般的には烏羽色、濡烏、烏の濡れ羽色とも言う。" +
                    "青みを帯びた黒を指す。",

            "花紺青とは、一般的にスマルトのことである。" +
                    "スマルトはコバルト顔料のことで、天然顔料の紺青と人工的に作られたプルシアンブルーを区別するために、" +
                    "前者を岩紺青、後者を花紺青と称することがある。",

            "孔雀緑とは、別名孔雀色のことで、" +
                    "近代にできた色名で明治頃に西洋から伝わった『ピーコックグリーン』を和訳したもの。",

            "蜜柑色とは、蜜柑の果実のような色のこと。",

            "百塩茶とは、何回も染重ねた濃い赤紫褐色のこと。「百」は回数の多いこと、" +
                    "「塩」は染液に浸すことに由来する色名である。" +
                    "深い褐色にわざわざ染めることにより市場できちんとした値打ちのある染色品につけられた色名である。",

            "月白とは、わずかに青みを含んだ月のような白色のこと。" ,

            "支子色とは、クチナシの実で染めた色のこと。",

            "聴色とは、染料の紅花大一斤で、絹一疋を染めた色名称である。" +
                    "紅の濃染が高価であった平安時代は、一斤染の色が上限である紅の聴色（許色）とされ、" +
                    "これより濃い染は禁色とされた。",

            "竜胆色とは、竜胆の花のような色のこと。薄い青紫色。",

            "白茶とは、薄くて白っぽい感じの茶色のこと。",

            "唐紅とは、濃い紅色のことで、深紅の色を指す。別名、韓紅花とも呼ぶ。" +
                    "「紅の八塩」という意味があり、「八塩」は、何度も染液に漬けること。",

            "梅重とは、重なりあった紅い梅の花のような明るい紅色のこと。",

            "天色とは、晴天の澄んだ空のような鮮やかな青色のこと。" +
                    "別名は真空色。",

            "花緑青とは、緑色の顔料で、パリスグリーン、エメラルドグリーン、" +
                    "シュヴァインフルトグリーンなどとも呼ばれる。",
    };

    int[] reImg2 = {
            R.drawable.gin,
            R.drawable.shion,
            R.drawable.nureba_iro,
            R.drawable.hanakonnj,
            R.drawable.kujaku,
            R.drawable.mikan,
            R.drawable.momoshio,
            R.drawable.geppa,
            R.drawable.kutina,
            R.drawable.yurushi,
            R.drawable.rin,
            R.drawable.shira,
            R.drawable.karakure,
            R.drawable.ume,
            R.drawable.amaama,
            R.drawable.harokus,
    };

    //前の画面に戻ったとき値を保存したまま状態にしておく用
    int score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);

        //フォント　**********************************************
        TextView txt04 = (TextView) findViewById(R.id.ex_text);
        Typeface font04 = Typeface.createFromAsset(getAssets(), "shirokuma.otf");
        txt04.setTypeface(font04);

        TextView txt05 = (TextView) findViewById(R.id.back_start_button);
        txt05.setTypeface(font04);

        TextView txt06 = (TextView) findViewById(R.id.back_result_button);
        txt06.setTypeface(font04);

        //取得　*********************************************
        int score = getIntent().getIntExtra("score" , 0);
        if( score < 0) score = 0;
        if( score >= result1.length) score = result1.length;

        ((ImageView)findViewById(R.id.eximage)).setImageResource(reImg2[score]);
        ((TextView)findViewById(R.id.ex_text)).setText(result1[score]);

    }

    //スタート画面に戻る  *****************************************
    public void onBst(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    //前の画面へ戻る  *********************************************
    public void onBre(View v){
        score2 = getIntent().getIntExtra("score", 0);
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("score" , score2);
        startActivity(intent);
        finish();
    }

    //BACKキーを押された時にアプリを終了するかどうか  *******************
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if (keyCode == KeyEvent.KEYCODE_BACK){
            new AlertDialog.Builder(this)
                    .setTitle("アプリケーションの終了")
                    .setMessage("アプリケーションを終了してよろしいですか？")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // TODO 自動生成されたメソッド・スタブ
                            ExplanationActivity.this.finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // TODO 自動生成されたメソッド・スタブ

                        }
                    })
                    .show();

            return true;
        }
        return false;
    }
}
