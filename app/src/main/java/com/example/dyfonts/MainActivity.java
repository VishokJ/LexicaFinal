package com.example.dyfonts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void allFonts(View view) {
        Intent intent = new Intent(MainActivity.this, AllFonts.class);
        startActivity(intent);
        finish();
    }

    public void fontTest(View view) {
        Intent intent = new Intent(MainActivity.this, InstructionsActivity.class);
        startActivity(intent);
        finish();
    }

    public void conTest(View view) {
        Intent intent = new Intent(MainActivity.this, InstructionContrast.class);
        startActivity(intent);
        finish();
    }

    public void allCons(View view) {
        Intent intent = new Intent(MainActivity.this, AllContrasts.class);
        startActivity(intent);
        finish();
    }
}
