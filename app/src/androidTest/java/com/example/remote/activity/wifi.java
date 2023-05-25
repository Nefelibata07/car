package com.example.remote.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.remote.R;
import com.example.remote.utils.HttpGetRequest;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class wifi extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wifi);
        Button back=findViewById(R.id.backMenu_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_translate =new Intent();
                intent_translate .setClass(wifi.this,meta.class);
                startActivity(intent_translate );
            }});
        Button test=findViewById(R.id.wifiStart_btn);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        String urlHead="127.0.0.1:8080/test";
//        String urlFind=urlHead+"user/getPassword?account=";
        StringBuilder urlSB=new StringBuilder(urlHead);
        String msg="04 2";
        urlSB.append(msg);
        System.out.println(urlSB);
        HttpGetRequest.sendOkHttpGetRequest(urlSB.toString(),
                new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Looper.prepare();
                        System.out.println("get请求失败");
                        System.out.println(e.getMessage());
                        Looper.loop();
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        Looper.prepare();
                        String res=response.body().string();
                        System.out.println("get请求成功");
                        System.out.println(res);
                        System.out.println(res.length());
                        Looper.loop();
                    }
                });}});
    }
}
