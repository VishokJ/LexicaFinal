package com.example.dyfonts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InstructionContrast extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_instructions);
        }

        public void startTest(View view) {
                Intent intent = new Intent(InstructionContrast.this, BblActivity.class);
                startActivity(intent);
                finish();
        }
}
