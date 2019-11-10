package com.example.dyfonts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dyfonts.R;

public class AllContrasts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrasts);
    }
    public void backButton(View view) {
        Intent intent = new Intent(AllContrasts.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
