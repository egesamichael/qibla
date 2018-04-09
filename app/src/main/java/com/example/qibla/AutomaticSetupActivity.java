package com.example.qibla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class AutomaticSetupActivity extends AppCompatActivity {

    ViewFlipper icon_carousel;
    boolean nextView = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automatic_setup);

        int icons[] = {R.mipmap.location_icon, R.mipmap.clock_icon, R.mipmap.mic_icon, R.mipmap.check_icon};

        icon_carousel = findViewById(R.id.view_flipper);

        // flip to next icon
        for (int i= 0; i < icons.length; i++) {
            iconFlipper(icons[i]);
        }
        nextView = true;

        /*if (nextView == true) {
            Intent intent = new Intent(AutomaticSetupActivity.this, MainPrayerTimesPageActivity.class);
            startActivity(intent);
        }*/



    }
    public void iconFlipper (int icon) {
        ImageView iconView = new ImageView (this);
        iconView.setBackgroundResource(icon);

        icon_carousel.addView(iconView);
        icon_carousel.setFlipInterval(4000);
        icon_carousel.setAutoStart(true);

        // Animation:
        icon_carousel.setInAnimation(this, android.R.anim.slide_in_left);
        icon_carousel.setOutAnimation(this, android.R.anim.slide_out_right);
    }

}
