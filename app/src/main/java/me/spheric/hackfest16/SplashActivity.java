package me.spheric.hackfest16;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler hd = new Handler();
        hd.postDelayed(new Runnable() {

            @Override
            public void run() {

            }
        }, 2000);

        Intent intent = null;
        intent = new Intent(SplashActivity.this, MainActivity.class);

        if (intent != null) {
            SplashActivity.this.startActivity(intent);
        }

        finish();

    }
}
