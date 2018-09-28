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
            "白銅色とは、金属の白銅の色ようなわずかに青みを含んだ明るい灰色のことです。" +
                    "白銅に因んだ色ですが、実際の白銅の色はさらに金属的な光沢があります。" +
                    "白銅色が使われるようになったのは近代からで、明治以降の新しい色になります。",

            "紫苑色とは、紫苑の花の色のような少し青みのある薄い紫色のことです。" +
                    "紫苑はキク科シオン属の多年草で、古名を「のし」といい、" +
                    "平安時代には「しおに」とも呼ばれていました。秋には薄紫色の美しい花を咲かせることから、" +
                    "古くからとても愛されており、紫苑色の色名はその可憐な花の色からきています。" +
                    "襲の色目としても秋を表わし、「表・薄色、裏・青」、「表・紫、裏・蘇芳」などの組み合わせがありました。",

            "濡羽色とは、烏の羽のような艶のある黒色のことです。" +
                    "烏といえば真っ黒というイメージですが、よく見るとその羽は青や紫、緑などの" +
                    "光沢を帯びて見えます。これは羽毛の表面にわずかに構造色を持つためです。" +
                    "まっすぐで健康的な女性の髪もまた同様に、水や髪油などを含むことで、" +
                    "わずかな干渉色を浮かべた「烏の濡羽色」のような美しい黒となるのです。",

            "花紺青とは、紫色を帯びた暗い青色のことです。人類最古のコバルト顔料「スマルト」の和名。" +
                    "スマルトはエジプトやミケーネ文明の頃から用いられていました。" +
                    "日本では顔料の「紺青色」の中でも、人造の顔料を「花紺青」、天然のアズライトを" +
                    "原料とする顔料を「岩紺青」と呼んで区別します。",

            "孔雀緑とは、孔雀の美しい青緑の羽のような鮮やかな青緑色のことです。" +
                    "孔雀の羽に見られる青みがかった鮮やかな緑に由来しています。" +
                    "近代にできた色名で明治の頃に西洋から伝わった『ピーコックグリーン』を和訳したものです。" +
                    "孔雀の青い羽根に由来した『孔雀青』という色もありますが、" +
                    "こちらも同時期に伝わった『ピーコックブルー』を和訳してできた色名です。",

            "蜜柑色とは、蜜柑の果実の表皮のような黄赤色のことです。" +
                    "JISの色彩規格ではだいだい色よりも少し赤みが少なく黄色みが強いとされています。" +
                    "蜜柑は、ミカン科の常緑小高木で、皮がむきやすく、甘みのある果実の総称をさしています。" +
                    "国産の温州みかんが代表的で、そこから柑子色より色鮮やかな蜜柑色が生まれました。",

            "百塩茶とは、赤みの焦茶色のことで、今日の「チョコレート色」に近い色です。" +
                    "百塩の「百」は回数の多いこと、「塩」は「入」で浸染をいい、" +
                    "何回も染め重ねた濃い色を指しています。" +
                    "「百塩茶」はその染法から名付けられた江戸時代の染色です。" +
                    "僧侶の袈裟が色褪せた黒色として形容として使われました。",

            "月白とは、月の光を思わせる薄い青みを含んだ白色のことです。" +
                    "色名の月白を「つきしろ」と読むと、月が東の空に昇るの際に空がだんだん" +
                    "明るく白んでいく様子を指し、特に月見客が十五夜を待ち焦がれる思いを表現しました。" +
                    "また「月代(つきしろ)」とも書かれ「三秋」の季語にもなっています。" +
                    "和色の中には『純白』『胡粉』『乳白色』『銀白色』『卯の花色』など" +
                    "白を表す様々な色名がありますが、そんな中でも月白は文学的で風流さを感じさせる色名です。",

            "支子色とは、クチナシの実で染めた、少し赤みのある黄色のことです。" +
                    "クチナシは奈良時代より黄丹の下染めに使われていましたが,支子の色名は" +
                    "ありませんでした。色名がみられるようになるのは平安時代から。" +
                    "当時は黄支子と呼ばれており、延喜式に記述がある他、" +
                    "古今和歌集などにもその名が詠まれています。ただし、厳密にはクチナシで染めた" +
                    "黄色に紅花の赤をわずかに重ね染めした色を支子色、クチナシのみで染めた色を黄支子と呼んで区別されました。",

            "聴色とは、紅花で染められた淡い紅色のことです。" +
                    "紅花大一斤で絹一疋(きぬいっぴき)が染められた色合いを指し、" +
                    "一般的には『一斤染』という色名で知られています。" +
                    "古代、紅花は大変高価な染料であり、それを用いた紅染も色が濃くなるほど高額でした。" +
                    "そのため、濃染の紅色は皇族や高い身分の人にしか使用を許されない『禁色』とされ、" +
                    "逆にだれでも着用が許された色が『聴色』だったのです。",

            "竜胆色とは、竜胆の花のような薄い青紫色のことです。竜胆は日本の山野に自生するリンドウ科の多年草。" +
                    "桔梗と共に日本の秋を代表する花です。竜胆の小さく可憐な花は、日本人に古くから愛好され、" +
                    "色名も平安の頃より重ねの色目として用いられてきました。" +
                    "ちなみに、竜胆の根は極めて苦いことから「竜の胆」のようだと例えられ、そこから竜胆とよばれるようになったようです。" +
                    "襲の色目としては、「表・蘇芳、裏・青」などが用いられ代表的な秋の配色になります。",

            "白茶とは、薄くて明るい感じの茶色のことです。色あせて白っぽくなることを白茶けるといいます。" +
                    "江戸時代の元禄中期は比較的濃い茶色系が流行しましたが、" +
                    "「煤竹廃れて白茶起こり」とあるように、文化・文政期に入ると薄い茶系が" +
                    "茶人や数寄者が好む粋な色として流行しました。明治に入ると女性の着物にも多く用いられる色となっています。",

            "唐紅とは、紅花で染めた濃い紅赤色のことです。" +
                    "奈良時代には「紅の八塩」と呼ばれていた色で、別に「韓紅」とも表記します。" +
                    "八塩とは八回染め重ねるの意で、紅花による濃染めのことをいいます。" +
                    "平安時代には濃い紅花の赤色が、舶来の赤の意味と美しさを強調するために『唐紅、韓紅』" +
                    "となったといいます。当時の紅花は黄金に例えられるほど高価だったことから、" +
                    "濃い紅色は『禁色』とされていました。",

            "梅重とは、重なり合った紅い梅の花のような明るい紅赤色のことです。" +
                    "平安時代の襲の装束に由来した色名で、重ねの色目としては「表・濃紅、裏・紅梅」" +
                    "で紅梅の花の重なりを表した配色となっており、十一月から二月にかけて着用されていました。" +
                    "淡い『薄紅梅』の着物に鮮やかな『梅重』の帯でアクセントをきかせるような" +
                    "同系色での組み合わせは、伝統的な配色で「匂い」と呼ばれました。",

            "天色とは、晴天の澄んだ空のような鮮やかな青色のことです。『真空色』の別名も。" +
                    "「天」は「あめ」とも読まれますが「あま」と読むのが一般的です。" +
                    "天色は読み方によって色や意味が違っています。" +
                    "「あめいろ」と読む場合は天色 あまいろと同じ色を指しますが、" +
                    "「そらいろ」と読まれる場合は『空色』と同じ色を意味し、天色よりも薄い青色を指しました。" +
                    "また「てんしょく」とも読まれ、この場合は色ではなく単に天候や空模様を指すことが多いようです。",

            "花緑青とは、明るく渋い青緑色のことです。十九世紀初めのパリで生産された酢酸銅と亜砒酸銅の" +
                    "複塩による緑系の人工顔料『パリス・グリーン』の色で、" +
                    "青みの濃い『緑青』ということから日本では『花緑青』と呼ばれるようになりました。" +
                    "我が国で青色を意味する「花」を冠して、旧来の緑青と区別しています。",
    };

    int[] reImg2 = {
            R.drawable.haku,
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
