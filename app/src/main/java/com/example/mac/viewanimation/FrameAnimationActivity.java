package com.example.mac.viewanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class FrameAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);
        ImageView img = (ImageView) findViewById(R.id.img);

        //设置背景
        img.setBackgroundResource(R.drawable.frame);

        final AnimationDrawable animationDrawable = (AnimationDrawable) img.getBackground();

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //开始动画
                animationDrawable.start();
            }
        });


    }
}
