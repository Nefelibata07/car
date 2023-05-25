package com.example.remote.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.remote.R;

public class music extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);

        //设定左上角返回键
        String menuTitle = "蜂鸣和音乐";
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.title_layout);//设置标题样式
            TextView textView = (TextView) actionBar.getCustomView().findViewById(R.id.display_title);//获取标题布局的textview
            textView.setText(menuTitle);//设置标题名称，menuTitle为String字符串
            actionBar.setHomeButtonEnabled(true);//设置左上角的图标是否可以点击
            actionBar.setDisplayHomeAsUpEnabled(true);//给左上角图标的左边加上一个返回的图标
            actionBar.setDisplayShowCustomEnabled(true);// 使自定义的普通View能在title栏显示，即actionBar.setCustomView能起作用
        }

       /* Button back=findViewById(R.id.backMenu_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_translate =new Intent();
                intent_translate .setClass(music.this,meta.class);
                startActivity(intent_translate );
                finish();
            }});*/
        Button beepStart=findViewById(R.id.beepStart_btn);
        beepStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="02 1";
                ECBLE.easySendData(msg, false);
//                String urlHead= contant.urlHead;
//                StringBuilder urlSB=new StringBuilder(urlHead);
//                String msg="02 1";
//                urlSB.append(msg);
//                System.out.println(urlSB);
//                HttpGetRequest.sendOkHttpGetRequest(urlSB.toString(),
//                        new Callback() {
//                            @Override
//                            public void onFailure(Call call, IOException e) {
//                                Looper.prepare();
//                                System.out.println("get请求失败");
//                                System.out.println(e.getMessage());
//                                Looper.loop();
//                            }
//                            @Override
//                            public void onResponse(Call call, Response response) throws IOException {
//                                Looper.prepare();
//                                String res=response.body().string();
//                                System.out.println("get请求成功");
//                                System.out.println(res);
//                                System.out.println(res.length());
//                                Looper.loop();
//                            }
//                        });
            }
        });
        Button beepStop=findViewById(R.id.beepStop_btn);
        beepStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="02 0";
                ECBLE.easySendData(msg, false);
            }});
        Button musicStart=findViewById(R.id.musicStart_btn);
        musicStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="02 2";
                ECBLE.easySendData(msg, false);
               }});
        Button musicNext=findViewById(R.id.musicNext_btn);
        musicNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="02 4";
                ECBLE.easySendData(msg, false);
               }});
        Button musicStop=findViewById(R.id.musicStop_btn);
        musicStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="02 3";
                ECBLE.easySendData(msg, false);
}});
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish(); // back button
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
