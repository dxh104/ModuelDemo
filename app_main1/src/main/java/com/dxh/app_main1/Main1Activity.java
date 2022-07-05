package com.dxh.app_main1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dxh.app_base.ActivityManner;

public class Main1Activity extends AppCompatActivity {

    private Button btnOpenMain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        initView();
        btnOpenMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main1Activity.this, ActivityManner.get("Main2Activity")));
            }
        });
    }

    private void initView() {
        btnOpenMain2 = (Button) findViewById(R.id.btn_openMain2);
    }
}
