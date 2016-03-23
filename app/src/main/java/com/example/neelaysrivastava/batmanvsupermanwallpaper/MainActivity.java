package com.example.neelaysrivastava.batmanvsupermanwallpaper;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends Activity {
    MediaPlayer oursong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread time =new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent start =new Intent("com.example.neelaysrivastava.batmanvsupermanwallpaper.MAIN2ACTIVITY");
                    startActivity(start);
                }
            }
        };
        time.start();

    }


}
