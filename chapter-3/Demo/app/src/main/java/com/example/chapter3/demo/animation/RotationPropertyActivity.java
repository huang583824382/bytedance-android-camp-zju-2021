package com.example.chapter3.demo.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chapter3.demo.R;

public class RotationPropertyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotation_property);

        // ObjectAnimator实现
        ObjectAnimator animator = ObjectAnimator.ofFloat(findViewById(R.id.image_view),
                "rotation", 0, 360);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setInterpolator(new LinearInterpolator());
        animator.setDuration(8000);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.start();

        // XML实现
//        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.rotate);
//        animator.setTarget(findViewById(R.id.image_view));
//        animator.start();

        // ValueAnimator实现
//        final View v = findViewById(R.id.image_view);
//        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0, 360);
//        valueAnimator.setRepeatCount(ValueAnimator.INFINITE);
//        valueAnimator.setInterpolator(new LinearInterpolator());
//        valueAnimator.setRepeatMode(ValueAnimator.RESTART);
//        valueAnimator.setDuration(8000);
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                v.setRotation((float) animation.getAnimatedValue());
//            }
//        });
//        valueAnimator.start();
    }
}
