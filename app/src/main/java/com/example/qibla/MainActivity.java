package com.example.qibla;

import android.animation.AnimatorSet;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.animation.ObjectAnimator;

public class MainActivity extends AppCompatActivity {
    private TextView qiblaName;
    private Button initiate_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link java object to defined XML button
        initiate_button = findViewById(R.id.app_init_button);

        initiate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initiate next activity to choose automatic or manual setup of app.
                Intent intent = new Intent(MainActivity.this, ManOrAutoSetup.class);
                startActivity(intent);
            }
        });

    }

}
