package com.dxh.modueldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dxh.app_base.ActivityManner;

public class MainActivity extends AppCompatActivity {

    private Button btnOpenMain1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btnOpenMain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityManner.get("Main1Activity")));
            }
        });
    }

    private void initView() {
        btnOpenMain1 = (Button) findViewById(R.id.btn_openMain1);
    }
}
