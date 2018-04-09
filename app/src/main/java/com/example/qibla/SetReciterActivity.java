package com.example.qibla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SetReciterActivity extends AppCompatActivity {

    Button setReciterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_reciter);

        setReciterButton = findViewById(R.id.set_reciter_button);

        setReciterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initiate next activity to choose automatic or manual setup of app.
                Intent intent = new Intent(SetReciterActivity.this, MainPrayerTimesPageActivity.class);
                startActivity(intent);
            }
        });

    }
}
