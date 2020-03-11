package com.maugarciaf.employeemeeting;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.maugarciaf.employeemeeting.utils.Tools;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Tools.setSystemBarColor(this);
        //jarras_id         = findViewById(R.id.jarras_id);
        //fromtop     = AnimationUtils.loadAnimation(this,R.anim.from_top);

        //splash_version_id.setAnimation(from_bottom);
        //jarras_id.setAnimation(fromtop);
        //splash_center_id.setAnimation(from_bottom_center);

        Thread logoTimer = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    Log.d("Exception", "Exception" + e);
                } finally {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                }
                finish();
            }
        };
        logoTimer.start();
    }
}
}
