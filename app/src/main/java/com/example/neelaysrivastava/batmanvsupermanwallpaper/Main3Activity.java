package com.example.neelaysrivastava.batmanvsupermanwallpaper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;


public class Main3Activity extends Activity {
    ViewPager viewPager;
    CustomeSwipeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        adapter=new CustomeSwipeAdapter(this);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(getIntent().getIntExtra("items",0));

    }
    public void back(View v){
        startActivity(new Intent(Main3Activity.this, Main2Activity.class));
    }

}
