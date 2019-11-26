package com.creativestoreid.arf.elink_master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

import com.wang.avi.AVLoadingIndicatorView;

public class SplashActivity extends AppCompatActivity {
    private LinearLayout lv_loading;
    private AVLoadingIndicatorView avi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        lv_loading = (LinearLayout) findViewById(R.id.lv_loading);
        avi= (AVLoadingIndicatorView) findViewById(R.id.avi);
        avi.setIndicator("BallScaleMultipleIndicator");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(i);
                finish();
            }

        }, 3000);
    }
}
