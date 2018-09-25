package com.test.color;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.test.color.MainActivity;

//スタート画面部分

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 画面切り替え  **********************************
    public void onStart(View v){
        Intent intent = new Intent(this,PlayActivity.class);
        startActivity(intent);
    }
}