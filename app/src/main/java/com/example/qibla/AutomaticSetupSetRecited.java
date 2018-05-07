package com.example.qibla;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AutomaticSetupSetRecited extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automatic_setup_set_recited);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(AutomaticSetupSetRecited.this, AutomaticSetupConfirmSetup.class);
                startActivity(intent);
            }
        }, 3000);
    }
}
