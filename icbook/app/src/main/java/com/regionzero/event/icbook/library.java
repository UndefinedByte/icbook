package com.regionzero.event.icbook;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class library extends AppCompatActivity {

    ScrollView myScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        myScroll = (ScrollView) findViewById(R.id.myview);

        TextView tv = (TextView) findViewById(R.id.txt_lib_title);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/minecraft_rus.ttf");
        tv.setTypeface(face);
    }

    public  void onlib0Click(View view){
        Intent intent = new Intent(this, library_id.class);
        startActivity(intent);
    }

    public  void onTypesClick(View view){
        Intent intent = new Intent(this, library_types.class);
        startActivity(intent);
    }

    public  void onDumpClick(View view){
        Intent intent = new Intent(this, dump.class);
        startActivity(intent);
    }

    public  void onCallbacksClick(View view){
        Intent intent = new Intent(this, library_callbacks.class);
        startActivity(intent);
    }
    /*
    public  void onClickNamesTex(View view){
        WifiManager wifi =(WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        if(!wifi.isWifiEnabled()){
            Intent intent = new Intent(this, no_wifi.class);
            startActivity(intent);
        } else {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://zhuoweizhang.net/mcpetexturenames/"));
            startActivity(browserIntent);
        }
    }*/

    public  void onClickNamesTex(View view){
        Intent intent = new Intent(this, library_texnames.class);
        startActivity(intent);
    }

    public  void onChatColorClick(View view){
        Intent intent = new Intent(this, library_chatcolor.class);
        startActivity(intent);
    }

    public  void onRendersClick(View view){
        Intent intent = new Intent(this, library_renders.class);
        startActivity(intent);
    }

    public  void onClickHeader(View view) {
        myScroll.scrollTo(0, 0);
    }
}
