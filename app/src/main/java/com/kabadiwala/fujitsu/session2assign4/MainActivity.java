package com.kabadiwala.fujitsu.session2assign4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mhidebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mhidebtn = (Button) findViewById(R.id.hide_btn);
        mhidebtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent (MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
