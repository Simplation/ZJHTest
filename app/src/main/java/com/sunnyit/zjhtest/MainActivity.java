package com.sunnyit.zjhtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sunnyit.zjhlibrary.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance()
                        .getmILoginService()
                        .launch(MainActivity.this, "");
            }
        });

        findViewById(R.id.mine_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance()
                        .getmMineService()
                        .launch(MainActivity.this, "");
            }
        });
    }
}

