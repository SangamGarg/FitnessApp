package com.example.fitnesszone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button button=(Button) findViewById(R.id.button4);
        VideoView videoView=(VideoView) findViewById(R.id.videoView4);
        String path="android.resource://com.example.fitnesszone/"+R.raw.third;
        Uri u=Uri.parse(path);
        videoView.setVideoURI(u);
        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,Main2Activity.class);
                startActivity(intent);
              //  overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}