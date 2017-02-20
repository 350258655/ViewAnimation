package com.example.mac.viewanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnactivity = (Button) findViewById(R.id.btn_activity);
        Button btnlayout = (Button) findViewById(R.id.btn_layout);
        Button btnframe = (Button) findViewById(R.id.btn_frame);
        Button btnview = (Button) findViewById(R.id.btn_view);


        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ViewAnimationActivity.class));
            }
        });


        btnframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FrameAnimationActivity.class));
            }
        });


        btnlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LayoutAnimationActivity.class));
            }
        });


        btnactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ActivityAnimationActivity.class));
                //必须位于startActivity或者finish之后
                overridePendingTransition(R.anim.enter_anim,R.anim.exit_anim);

            }
        });

    }
}
