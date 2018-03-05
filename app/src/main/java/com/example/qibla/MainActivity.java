package com.example.qibla;

import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.animation.ObjectAnimator;

public class MainActivity extends AppCompatActivity {
    private TextView qiblaName;
    long animationDuration = 1000; //miliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qiblaName.findViewById(R.id.qibla_name);
    }
/*
    public void slideTextLeft(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(qiblaName, "x", 420f);
        animator.setDuration(animationDuration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator);
        animatorSet.start();
    }
    */


}
