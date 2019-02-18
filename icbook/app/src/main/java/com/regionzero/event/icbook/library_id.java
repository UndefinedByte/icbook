package com.regionzero.event.icbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class library_id extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_id);

        TextView tv = (TextView) findViewById(R.id.txt_lib_id_title);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/minecraft_rus.ttf");
        tv.setTypeface(face);
    }

    public  void onid0Click(View view){
        Intent intent = new Intent(this, library_id0.class);
        startActivity(intent);
    }

    public  void onid1Click(View view){
        Intent intent = new Intent(this, library_id1.class);
        startActivity(intent);
    }
}
