package com.example.qibla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManOrAutoSetup extends AppCompatActivity {
    private Button manual_button;
    private Button automatic_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_or_auto_setup);

        // Link java object to defined XML button:
        manual_button = findViewById(R.id.manualButton);
        automatic_button =findViewById(R.id.automaticButton);

        // Start new respective activity on button click:
        manual_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initiate next activity to choose automatic or manual setup of app.
                Intent intent = new Intent(ManOrAutoSetup.this, ManualSetupActivity.class);
                startActivity(intent);
            }
        });

        automatic_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initiate next activity to choose automatic or manual setup of app.
                Intent intent = new Intent(ManOrAutoSetup.this, AutomaticSetupActivity.class);
                startActivity(intent);
            }
        });

    }
}
