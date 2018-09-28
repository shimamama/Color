package com.test.color;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
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
                            MainActivity.this.finish();
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