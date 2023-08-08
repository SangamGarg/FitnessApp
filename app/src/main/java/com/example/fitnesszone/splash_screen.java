package com.example.fitnesszone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class splash_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        ImageView imageView=findViewById(R.id.logo);
        ImageView imageView1=findViewById(R.id.logo2);
        Animation top= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_animaton);
        Animation bottom= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo2_animation);

        imageView.setAnimation(top);
        imageView1.setAnimation(bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                finish();
            }
        }, 2500);
    }
}