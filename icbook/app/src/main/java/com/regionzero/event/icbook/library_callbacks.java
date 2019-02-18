package com.regionzero.event.icbook;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class library_callbacks extends AppCompatActivity {

    ScrollView myScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_callbacks);

        myScroll = (ScrollView) findViewById(R.id.myview);

        TextView tv = (TextView) findViewById(R.id.txt_lib_call_title);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/minecraft_rus.ttf");
        tv.setTypeface(face);
    }


    public  void onClickHeader(View view) {
        myScroll.scrollTo(0, 0);
    }
}
