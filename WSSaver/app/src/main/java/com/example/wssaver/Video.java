package com.example.wssaver;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

import java.io.File;
import java.io.IOException;

public class Video extends AppCompatActivity {
    ImageView download, mychatapp, share;
    VideoView mpariticularvideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        mpariticularvideo = findViewById(R.id.particularvideo);
        getSupportActionBar().setTitle("Video");
        share = findViewById(R.id.share);
        download = findViewById(R.id.download);
        mychatapp = findViewById(R.id.mychatapp);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Video.this, "Going to Share", Toast.LENGTH_SHORT).show();
            }
        });
        Intent intent = getIntent();
        String destpath = intent.getStringExtra("DEST_PATH_VIDEO");
        String file = intent.getStringExtra("FILE_VIDEO");
        String Uri = intent.getStringExtra("URI_VIDEO");
        String filename = intent.getStringExtra("FILENAME_VIDEO");

        File destpat2 = new File(destpath);
        File file1 = new File(file);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(mpariticularvideo);
        Uri uri1 = android.net.Uri.parse(Uri);
        mpariticularvideo.setMediaController(mediaController);
        mpariticularvideo.setVideoURI(uri1);
        mpariticularvideo.requestFocus();
        mpariticularvideo.start();

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    org.apache.commons.io.FileUtils.copyFileToDirectory(file1, destpat2);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                MediaScannerConnection.scanFile(getApplicationContext(), new String[]{destpath + filename}, new String[]{"*/*"}, new MediaScannerConnection.MediaScannerConnectionClient() {
                    @Override
                    public void onMediaScannerConnected() {

                    }

                    @Override
                    public void onScanCompleted(String path, android.net.Uri uri) {

                    }
                });
                Dialog dialog = new Dialog(Video.this);
                dialog.setContentView(R.layout.custom_dialog);
                dialog.show();
                Button button = dialog.findViewById(R.id.okbutton);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

            }
        });
    }
}


