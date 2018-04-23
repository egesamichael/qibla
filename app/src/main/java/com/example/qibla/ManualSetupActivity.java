package com.example.qibla;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManualSetupActivity extends AppCompatActivity {

    Button save_location_button;
    public static TextInputLayout user_location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_setup);
        overridePendingTransition(R.anim.slide_down, R.anim.stay);

        save_location_button = findViewById(R.id.saveLocationButton);

        user_location = findViewById(R.id.user_location);

        save_location_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initiate next activity to choose automatic or manual setup of app.
                Intent intent = new Intent(ManualSetupActivity.this, SetPrayerTimesActivity.class);
                startActivity(intent);
            }
        });
    }
}
