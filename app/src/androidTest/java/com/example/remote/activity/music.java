package com.example.remote.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.remote.R;

public class music extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
        Button back=findViewById(R.id.backMenu_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_translate =new Intent();
                intent_translate .setClass(music.this,meta.class);
                startActivity(intent_translate );
            }});
    }
}
