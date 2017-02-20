package com.example.mac.viewanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class ViewAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);
        final Button btngotoanim = (Button) findViewById(R.id.btn_gotoanim);

        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.myanim);

        btngotoanim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngotoanim.startAnimation(animation);
            }
        });



    }
}
