package com.sheepyang.loadingman;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_rider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_rider = (ImageView) findViewById(R.id.iv_rider);
        AnimationDrawable manAnima  = (AnimationDrawable) iv_rider.getDrawable();
        manAnima.start();

        Animation backAnimation1 = AnimationUtils.loadAnimation(this, R.anim.bg_loading1);
        Animation backAnimation2 = AnimationUtils.loadAnimation(this, R.anim.bg_loading2);

        ImageView ivBack1 = (ImageView) findViewById(R.id.iv_back1);
        ImageView ivBack2 = (ImageView) findViewById(R.id.iv_back2);
        ivBack1.startAnimation(backAnimation1);
        ivBack2.startAnimation(backAnimation2);
    }
}
