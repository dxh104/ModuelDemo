package com.dxh.app_main2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dxh.app_base.ActivityManner;

public class Main2Activity extends AppCompatActivity {

    private Button btnOpenMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        btnOpenMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, ActivityManner.get("MainActivity")));
            }
        });
    }

    private void initView() {
        btnOpenMain = (Button) findViewById(R.id.btn_openMain);
    }
}
