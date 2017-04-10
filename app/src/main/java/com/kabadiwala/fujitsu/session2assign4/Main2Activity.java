package com.kabadiwala.fujitsu.session2assign4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity   implements View.OnClickListener {

    Button mseekbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mseekbtn = (Button) findViewById(R.id.seek_btn);
        mseekbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent (Main2Activity.this,MainActivity.class);
        startActivity(intent);
    }

    }
