package me.spheric.hackfest16;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    private TextToSpeech myTTS;
    private static final int MY_PERMISSIONS_REQUEST_FINE_LOCATION = 111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        /*myTTS=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    myTTS.setLanguage(Locale.KOREAN);
                }
            }
        });*/

        findViewById(R.id.btn_firetruck).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {

            //String myText = "인천시 연수구 인천타워대로 241에 발생한 화재로 인해 출동하는 소방차가 약 400m 후방에서 접근중입니다. 꺼져주세요";
            //myTTS.speak(myText, TextToSpeech.QUEUE_FLUSH, null);

            Intent intent = null;
            intent = new Intent(MainActivity.this, FireTruckActivity.class);

            startActivity(intent);
        }
    };


}
