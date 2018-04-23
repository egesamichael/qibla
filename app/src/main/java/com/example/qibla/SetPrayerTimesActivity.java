package com.example.qibla;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SetPrayerTimesActivity extends AppCompatActivity {

    Button setPrayersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_prayer_times);

        setPrayersButton = findViewById(R.id.set_prayers_button);

        setPrayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initiate next activity to choose automatic or manual setup of app.
                Intent intent = new Intent(SetPrayerTimesActivity.this, PrayerTimesActivity.class);
                startActivity(intent);
            }
        });
    }

}
