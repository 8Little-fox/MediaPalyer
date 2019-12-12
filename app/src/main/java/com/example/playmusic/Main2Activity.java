package com.example.playmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;

public class Main2Activity extends AppCompatActivity {
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        videoView=findViewById(R.id.view);
        File file=new File(Environment.getExternalStorageDirectory(),"movie.mp4");
        if (file.exists()){
            videoView.setVideoPath(file.getAbsolutePath());
        }else {
            Toast.makeText(Main2Activity.this,"文件不存在",Toast.LENGTH_LONG).show();
        }
        MediaController mediaController=new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
        videoView.requestFocus();
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(Main2Activity.this,"结束",Toast.LENGTH_LONG).show();
            }
        });
    }
}
