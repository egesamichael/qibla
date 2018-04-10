package com.example.qibla;

import android.animation.AnimatorSet;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;
import android.animation.ObjectAnimator;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button initiate_button;
    private TextView app_descr_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initiate_button = findViewById(R.id.app_init_button);
        app_descr_text = findViewById(R.id.app_description);


        // Slide in Button
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                app_descr_text.setVisibility(View.VISIBLE);
                app_descr_text.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left));
            }
        }, 3000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                app_descr_text.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_out_right));
                app_descr_text.setVisibility(View.INVISIBLE);
                initiate_button.setVisibility(View.VISIBLE);
                initiate_button.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left));
            }


        }, 9000);

        initiate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initiate next activity to choose automatic or manual setup of app.
                Intent intent = new Intent(MainActivity.this, ManOrAutoSetup.class);
                startActivity(intent);
            }
        });



    }






        //initiate_button.setVisibility(View.VISIBLE);

/*        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                initiate_button.setVisibility(View.VISIBLE);
                initiate_button.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left));
            }
        }, 3000);

    }*/

/*
- delay 3 seconds
- slide description in
- hold for 4 seconds
- slide description out
- slide button in


 */
/*    private TextView qiblaName;
    private Button initiate_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link java object to defined XML button
        initiate_button = findViewById(R.id.app_init_button);



    }
 */

}


