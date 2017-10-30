package com.netfoxplus.www.netfoxpluscom;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.netfoxplus.www.netfoxpluscom.MainActivity;
import com.netfoxplus.www.netfoxpluscom.R;

public class SplashActivity extends Activity {
    private final int DURACION_SPLASH = 2500;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_spash);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(SplashActivity.this, selectionActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }

}


