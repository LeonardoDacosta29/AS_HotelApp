package com.leonardodacosta202102275.as_hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);
        String imageUrl = "https://akcdn.detik.net.id/visual/2019/07/31/8313b635-85a5-42a6-91ab-6d6cc9aa544f_169.jpeg?w=650";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}