package com.example.remote.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.remote.R;

public class colorRec extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colorrec);
        Button back=findViewById(R.id.backMenu_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_translate =new Intent();
                intent_translate .setClass(colorRec.this,meta.class);
                startActivity(intent_translate );
                finish();
            }});
        Button recognizeStart=findViewById(R.id.recognizeStart_btn);
        recognizeStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="05 1";
                ECBLE.easySendData(msg, false);}});
        Button recognizeStop=findViewById(R.id.recognizeStop_btn);
        recognizeStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="05 0";
                ECBLE.easySendData(msg, false);}});
    }
}
