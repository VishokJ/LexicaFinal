package com.example.dyfonts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AllFonts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_fonts);
    }
    public void backButton(View view) {
        Intent intent = new Intent(AllFonts.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
