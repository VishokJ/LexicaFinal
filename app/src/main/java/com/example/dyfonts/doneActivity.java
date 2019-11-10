package com.example.dyfonts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class doneActivity extends VerdanaActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
        TextView verdanaText = findViewById(R.id.bblText);

        verdanaText.setText("Verdana: " + Global.verdanaTime + " seconds");
        TextView arialText = findViewById(R.id.bgText);
        arialText.setText("Arial: " + Global.arialTime + " seconds");
        TextView casualText = findViewById(R.id.wgText);
        casualText.setText("Casual: " + Global.casualTime + " seconds");
        TextView courierText = findViewById(R.id.wbText);
        courierText.setText("Courier: " + Global.courierTime + " seconds");
        TextView cursiveText = findViewById(R.id.rgText);
        cursiveText.setText("Cursive: " + Global.cursiveTime + " seconds");
        TextView monospaceText = findViewById(R.id.wblText);
        monospaceText.setText("Monospace: " + Global.monoTime + " seconds");
        TextView sansText = findViewById(R.id.boText);
        sansText.setText("Sans: " + Global.sansTime + " seconds");
        TextView serifText = findViewById(R.id.bwText);
        serifText.setText("Serif: " + Global.serifTime + " seconds");
        TextView timesText = findViewById(R.id.brText);
        timesText.setText("Times New Roman: " + Global.timesTime + " seconds");
    }
    public void backButton(View view) {
        Intent intent = new Intent(doneActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
