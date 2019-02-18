package com.regionzero.event.icbook;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class library_texnames0 extends AppCompatActivity {

    ScrollView myScroll;

    private Drawable smallResource;

    private ImageView resourceImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_texnames0);

        myScroll = (ScrollView) findViewById(R.id.myview);

        TextView tv = (TextView) findViewById(R.id.txt_lib_texn_title);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/minecraft_rus.ttf");
        tv.setTypeface(face);

        resourceImageView = (ImageView) findViewById(R.id.texb);
        smallResource = getResources().getDrawable(R.drawable.anvil_base);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);

        resourceImageView = (ImageView) findViewById(R.id.texb0);
        smallResource = getResources().getDrawable(R.drawable.anvil_top_damaged_0);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);

        resourceImageView = (ImageView) findViewById(R.id.texb1);
        smallResource = getResources().getDrawable(R.drawable.anvil_top_damaged_1);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);

        resourceImageView = (ImageView) findViewById(R.id.texb2);
        smallResource = getResources().getDrawable(R.drawable.anvil_top_damaged_2);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);

        resourceImageView = (ImageView) findViewById(R.id.texb3);
        smallResource = getResources().getDrawable(R.drawable.beacon);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);

        resourceImageView = (ImageView) findViewById(R.id.texb4);
        smallResource = getResources().getDrawable(R.drawable.bed_feet_end);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);

        resourceImageView = (ImageView) findViewById(R.id.texb5);
        smallResource = getResources().getDrawable(R.drawable.bed_feet_side);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);

        resourceImageView = (ImageView) findViewById(R.id.texb6);
        smallResource = getResources().getDrawable(R.drawable.bed_feet_top);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);

        resourceImageView = (ImageView) findViewById(R.id.texb7);
        smallResource = getResources().getDrawable(R.drawable.bed_head_end);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);

        resourceImageView = (ImageView) findViewById(R.id.texb8);
        smallResource = getResources().getDrawable(R.drawable.bed_head_side);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);

        resourceImageView = (ImageView) findViewById(R.id.texb9);
        smallResource = getResources().getDrawable(R.drawable.bed_head_top);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);

        resourceImageView = (ImageView) findViewById(R.id.texb10);
        smallResource = getResources().getDrawable(R.drawable.bedrock);
        smallResource.setFilterBitmap(false);
        resourceImageView.setImageDrawable(smallResource);
    }

    public  void onClickHeader(View view) {
        myScroll.scrollTo(0, 0);
    }
}
