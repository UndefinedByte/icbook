package com.regionzero.event.icbook;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class lesson_0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_0);

        TextView tv = (TextView) findViewById(R.id.l0_t0);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/minecraft_rus.ttf");
        tv.setTypeface(face);

        TextView tv1 = (TextView) findViewById(R.id.txt_in_title);
        Typeface face0 = Typeface.createFromAsset(getAssets(), "fonts/minecraft_rus.ttf");
        tv1.setTypeface(face0);
    }
}
