package com.example.remote.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.remote.R;

public class trace extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trace);
        Button back=findViewById(R.id.backMenu_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_translate =new Intent();
                intent_translate .setClass(trace.this,meta.class);
                startActivity(intent_translate );
                finish();
            }});
        Button avoidStart=findViewById(R.id.avoidStart_btn);
        avoidStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="04 2";
                ECBLE.easySendData(msg, false);}});
        Button traceStart=findViewById(R.id.traceStart_btn);
        traceStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="04 1";
                ECBLE.easySendData(msg, false);}});
        Button avoidStop=findViewById(R.id.avoidStop_btn);
        avoidStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="04 3";
                ECBLE.easySendData(msg, false);}});
        Button traceStop=findViewById(R.id.traceStop_btn);
        traceStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="04 0";
                ECBLE.easySendData(msg, false);
            }});
    }
}
