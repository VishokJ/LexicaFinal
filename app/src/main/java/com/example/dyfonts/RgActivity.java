package com.example.dyfonts;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RgActivity extends BwActivity {
    private TextView countdownText;

    private CountDownTimer countDownTimer;
    private long timeLeftMs = 30000;
    private boolean timeRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrastsrg);
        countdownText = findViewById(R.id.countdown_text);
        startTimer();
    }

    private void startTimer() {
        timeRunning = true;
        countDownTimer = new CountDownTimer(timeLeftMs, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftMs = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    private void updateTimer() {
        String timeLeftText = "";
        int minutes = (int) timeLeftMs / 30000;
        timeLeftText += "00";
        int seconds = (int) timeLeftMs % 30000 / 1000;
        timeLeftText += ":";
        if (seconds < 10) timeLeftText += "0";
        timeLeftText += seconds;
        countdownText.setText(timeLeftText);
    }

    public void wbTest(View view) {
        Global.rgTime = 30 - (int) timeLeftMs / 1000;
        Intent intent = new Intent(RgActivity.this, WbActivity.class);
        startActivity(intent);
        finish();
    }

}

