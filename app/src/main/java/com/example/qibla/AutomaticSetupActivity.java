package com.example.qibla;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class AutomaticSetupActivity extends AppCompatActivity {

    ViewFlipper icon_carousel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automatic_setup);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(AutomaticSetupActivity.this, AutomaticSetupSetRecited.class);
                startActivity(intent);
            }


        }, 3000);
    }
}
