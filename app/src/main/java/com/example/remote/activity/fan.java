package com.example.remote.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.remote.R;

public class fan extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fan);
        Button back=findViewById(R.id.backMenu_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_translate =new Intent();
                intent_translate .setClass(fan.this,meta.class);
                startActivity(intent_translate );
                finish();
            }});
        Button fanStop=findViewById(R.id.fanStop_btn);
        fanStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="03 0";
                ECBLE.easySendData(msg, false);
            }});
        Button speedup=findViewById(R.id.speedup_btn);
        speedup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="03 3";
                ECBLE.easySendData(msg, false);
               }});
        Button speedDown=findViewById(R.id.speeddown_btn);
        speedDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="03 4";
                ECBLE.easySendData(msg, false);}});
        Button speedRight=findViewById(R.id.speedRight_btn);
        speedRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="03 2";
                ECBLE.easySendData(msg, false);}});
        Button speedLeft=findViewById(R.id.speedLeftbtn);
        speedLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="03 1";
                ECBLE.easySendData(msg, false);}});
    }
}
