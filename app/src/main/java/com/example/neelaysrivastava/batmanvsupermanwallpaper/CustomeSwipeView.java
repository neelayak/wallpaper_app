package com.example.neelaysrivastava.batmanvsupermanwallpaper;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.IOException;


 class CustomeSwipeAdapter extends PagerAdapter {
    private Context ctx;
    private int[] imgID ={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,
            R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10,R.drawable.img11,R.drawable.img12,R.drawable.img13,
            R.drawable.img14,R.drawable.img15,R.drawable.img16,R.drawable.img16,R.drawable.img17,R.drawable.img18,R.drawable.img19,
            R.drawable.img20,R.drawable.img21,R.drawable.img22,R.drawable.img23,R.drawable.img24,R.drawable.img25,R.drawable.img26,
            R.drawable.img27,R.drawable.img28,R.drawable.img29,R.drawable.img30,R.drawable.img31,R.drawable.img32,R.drawable.img33,
            R.drawable.img34,R.drawable.img35,R.drawable.img36,R.drawable.img37,R.drawable.img38
    };
    private LayoutInflater layoutInflater;
    public CustomeSwipeAdapter(Context ctx) {
        this.ctx=ctx;
    }

    @Override
    public int getCount() {
        return imgID.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }
    Bitmap goal;
    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        layoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view =layoutInflater.inflate(R.layout.extra,container,false);
        ImageView imageView =(ImageView)item_view.findViewById(R.id.imageView);
        Button button=(Button)item_view.findViewById(R.id.button);
        imageView.setImageResource(imgID[position]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BitmapFactory.decodeResource(Resources.getSystem(), imgID[position]);
                WallpaperManager wallpaperManager =
                        WallpaperManager.getInstance(ctx.getApplicationContext());
                try {
                    int height = wallpaperManager.getDesiredMinimumHeight();
                    int width = wallpaperManager.getDesiredMinimumWidth();
                    Bitmap bm =
                            BitmapFactory.decodeResource(v.getContext().getResources(), imgID[position]);
                    goal = Bitmap.createScaledBitmap(bm, width, height, true);
                    v.getContext().getResources().getDrawable(imgID[position]);
                    wallpaperManager.setBitmap(goal);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        container.addView(item_view);
        return item_view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
