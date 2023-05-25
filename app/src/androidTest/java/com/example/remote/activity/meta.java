package com.example.remote.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import com.example.remote.R;

public class meta extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meta);
        Button music=findViewById(R.id.music_btn);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_translate =new Intent();
        intent_translate .setClass(meta.this,music.class);
                startActivity(intent_translate );
            }});
        Button trace=findViewById(R.id.trace_btn);
        trace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_translate =new Intent();
                intent_translate .setClass(meta.this,trace.class);
                startActivity(intent_translate );
            }});
        Button wifi=findViewById(R.id.wifi_btn);
        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_translate =new Intent();
                intent_translate .setClass(meta.this,wifi.class);
                startActivity(intent_translate );
            }});
        Button colorRec=findViewById(R.id.checkout_btn);
        colorRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_translate =new Intent();
                intent_translate .setClass(meta.this,colorRec.class);
                startActivity(intent_translate );
            }});
        Button fan=findViewById(R.id.fan_btn);
        fan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_translate =new Intent();
                intent_translate .setClass(meta.this,fan.class);
                startActivity(intent_translate );
            }});
    }
}
