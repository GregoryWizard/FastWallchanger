package com.gregorywizard.fastwallchanger;

import android.app.Activity;
import android.app.WallpaperManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.IOException;

/**
 * Created by gregory on 12/23/15.
 */
public class MainActivity extends AppCompatActivity {
    WallpaperManager wallpaperManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(BitmapFactory.decodeFile("/storage/sdcard0/Download/Z2xxjDm.png"));
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("BAD_IMAGE","No image path");
        }
    }
}
