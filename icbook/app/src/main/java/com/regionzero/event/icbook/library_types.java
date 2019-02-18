package com.regionzero.event.icbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class library_types extends AppCompatActivity {

    ScrollView myScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_types);

        myScroll = (ScrollView) findViewById(R.id.myview);

        TextView tv = (TextView) findViewById(R.id.txt_lib_types_title);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/minecraft_rus.ttf");
        tv.setTypeface(face);
    }

    public  void onClickHeader(View view) {
        myScroll.scrollTo(0, 0);
    }

    public  void onClickType0(View view){
        Intent intent = new Intent(this, library_types0.class);
        startActivity(intent);
    }

    public  void onClickType1(View view){
        Intent intent = new Intent(this, library_types1.class);
        startActivity(intent);
    }

    public  void onClickType2(View view){
        Intent intent = new Intent(this, library_types2.class);
        startActivity(intent);
    }

    public  void onClickType3(View view) {
        Intent intent = new Intent(this, library_types3.class);
        startActivity(intent);
    }

    public  void onClickType4(View view){
        Intent intent = new Intent(this, library_types4.class);
        startActivity(intent);
    }

    public  void onClickType5(View view) {
        Intent intent = new Intent(this, library_types5.class);
        startActivity(intent);
    }
}
