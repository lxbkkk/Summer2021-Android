package com.example.mediaworksdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VideoDetailActivity extends AppCompatActivity {

    String mockUrl = "https://stream7.iqilu.com/10339/upload_transcode/202002/18/20200218114723HDu3hhxqIT.mp4";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_detail);

        VideoView videoView = findViewById(R.id.vv_detail);
        videoView.setVideoURI(Uri.parse(mockUrl));

        // TODO 4 添加控制
        videoView.setMediaController(new MediaController(this));

        videoView.start();

        // TODO 5 app注册为播放器类型
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse(mockUrl),"video/*");
        startActivity(intent);
    }
}
