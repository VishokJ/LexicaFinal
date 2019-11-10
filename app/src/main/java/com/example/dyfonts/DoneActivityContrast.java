package com.example.dyfonts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DoneActivityContrast extends VerdanaActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done_contrast);

        TextView bblText = findViewById(R.id.bblText);
        bblText.setText("Black on blue: " + Global.bblTime + " seconds");
        TextView bgText = findViewById(R.id.bgText);
        bgText.setText("Black on gray: " + Global.bgTime + " seconds");
        TextView boText = findViewById(R.id.boText);
        boText.setText("Blue on orange: " + Global.boTime + " seconds");
        TextView brText = findViewById(R.id.brText);
        brText.setText("Black on red: " + Global.brTime + " seconds");
        TextView bwText = findViewById(R.id.bwText);
        bwText.setText("Black on white: " + Global.bwTime + " seconds");
        TextView rgText = findViewById(R.id.rgText);
        rgText.setText("Red on green: " + Global.rgTime + " seconds");
        TextView wbText = findViewById(R.id.wbText);
        wbText.setText("White on black: " + Global.wbTime + " seconds");
        TextView wblText = findViewById(R.id.wblText);
        wblText.setText("White on blue: " + Global.wblTime + " seconds");
        TextView wgText = findViewById(R.id.wgText);
        wgText.setText("White on gray: " + Global.wgTime + " seconds");
        TextView wrText = findViewById(R.id.wrText);
        wrText.setText("White on red: " + Global.wrTime + " seconds");
    }
    public void backButton(View view) {
        Intent intent = new Intent(DoneActivityContrast.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

