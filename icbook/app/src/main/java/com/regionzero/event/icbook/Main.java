package com.regionzero.event.icbook;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;

import java.io.File;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.txt_main_title);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/minecraft_rus.ttf");
        tv.setTypeface(face);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setTitle("Выйти?")
                    .setMessage("Вы действительно хотите выйти?")
                    .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                            return;
                        }
                    })
                    .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            return;
                        }
                    })
                    .show();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    public  void onClickLess(View view) {
        Intent intent = new Intent(this, lessons.class);
        startActivity(intent);
    }

    public  void onClickLib(View view){
        Intent intent = new Intent(this, library.class);
        startActivity(intent);
    }

    public  void onClickCE(View view){
        Toast toast = Toast.makeText(this, "Доступно с версии 0.3",Toast.LENGTH_SHORT);
        toast.show();
    }

    public  void onClickSet(View view){
        Toast toast = Toast.makeText(this, "Доступно с версии 0.2",Toast.LENGTH_SHORT);
        toast.show();
    }

    public  void onClickAuth(View view){
        Intent intent = new Intent(this, main_auth.class);
        startActivity(intent);
    }

    public  void onClickRC(View view){
        Toast toast = Toast.makeText(this, "Доступно с версии 0.4",Toast.LENGTH_SHORT);
        toast.show();

        /*Intent intent = getPackageManager().getLaunchIntentForPackage("com.regionzero.event.icrender");
        if (intent != null) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(this, "Установите ICRender!",Toast.LENGTH_SHORT);
            toast.show();
        }*/
    }

    public  void onClickVer(View view){
        Toast toast = Toast.makeText(this, "Версия учебника - 0.1",Toast.LENGTH_SHORT);
        toast.show();
    }
}
