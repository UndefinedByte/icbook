package com.regionzero.event.icbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class main_auth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_auth);

        TextView tv = (TextView) findViewById(R.id.txt_auth_title);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/minecraft_rus.ttf");
        tv.setTypeface(face);
    }

    public  void onClickRZ(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/region_zero"));
        startActivity(browserIntent);
    }

    public  void onClickMP(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/mineprogramming"));
        startActivity(browserIntent);
    }

    public  void onClickEM(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/id226017453"));
        startActivity(browserIntent);
    }

    public  void onClickRD(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/id289660278"));
        startActivity(browserIntent);
    }

    public  void onClickMS(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/id370759218"));
        startActivity(browserIntent);
    }

    public  void onClickZH(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/id212997187"));
        startActivity(browserIntent);
    }

    public  void onClickSS(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/id441646205"));
    }

    public  void onClickDM(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/id331953744"));
        startActivity(browserIntent);
    }

    public  void onClickNM(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/id197029391"));
        startActivity(browserIntent);
    }

    public  void onClickVP(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/id323534591"));
        startActivity(browserIntent);
    }
}
