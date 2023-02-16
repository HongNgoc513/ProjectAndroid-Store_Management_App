package com.example.duan1_pro1121_nhom2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.duan1_pro1121_nhom2.LoginAccount.DangNhap;
import com.example.duan1_pro1121_nhom2.R;

public class HelloWorld extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_word);
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.sound_);
        mediaPlayer.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), DangNhap.class));
            }
        },3500);
    }


}