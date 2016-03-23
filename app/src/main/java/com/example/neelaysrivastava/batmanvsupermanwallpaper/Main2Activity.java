package com.example.neelaysrivastava.batmanvsupermanwallpaper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        GridView gridView =(GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new MyAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("items",position);
                startActivity(intent);
            }
        });

    }
    private class MyAdapter extends BaseAdapter
    {
        private List<Item> items = new ArrayList<Item>();
        private LayoutInflater inflater;

        public MyAdapter(Context context)
        {
            inflater = LayoutInflater.from(context);

            items.add(new Item("Image 1", R.drawable.imge1));
            items.add(new Item("Image 2", R.drawable.imge2));
            items.add(new Item("Image 3", R.drawable.imge3));
            items.add(new Item("Image 4", R.drawable.imge4));
            items.add(new Item("Image 5", R.drawable.imge5));
            items.add(new Item("Image 6", R.drawable.imge6));
            items.add(new Item("Image 7", R.drawable.imge7));
            items.add(new Item("Image 8", R.drawable.imge8));
            items.add(new Item("Image 9", R.drawable.imge9));
            items.add(new Item("Image 10", R.drawable.imge10));
            items.add(new Item("Image 11", R.drawable.imge11));
            items.add(new Item("Image 12", R.drawable.imge12));
            items.add(new Item("Image 13", R.drawable.imge13));
            items.add(new Item("Image 14", R.drawable.imge14));
            items.add(new Item("Image 15", R.drawable.imge15));
            items.add(new Item("Image 16", R.drawable.imge16));
            items.add(new Item("Image 17", R.drawable.imge17));
            items.add(new Item("Image 18", R.drawable.imge18));
            items.add(new Item("Image 19", R.drawable.imge19));
            items.add(new Item("Image 20", R.drawable.imge20));
            items.add(new Item("Image 21", R.drawable.imge21));
            items.add(new Item("Image 22", R.drawable.imge22));
            items.add(new Item("Image 23", R.drawable.imge23));
            items.add(new Item("Image 24", R.drawable.imge24));
            items.add(new Item("Image 25", R.drawable.imge25));
            items.add(new Item("Image 26", R.drawable.imge26));
            items.add(new Item("Image 27", R.drawable.imge27));
            items.add(new Item("Image 28", R.drawable.imge28));
            items.add(new Item("Image 29", R.drawable.imge29));
            items.add(new Item("Image 30", R.drawable.imge30));
            items.add(new Item("Image 31", R.drawable.imge31));
            items.add(new Item("Image 32", R.drawable.imge32));
            items.add(new Item("Image 33", R.drawable.imge33));
            items.add(new Item("Image 34", R.drawable.imge34));
            items.add(new Item("Image 35", R.drawable.imge35));
            items.add(new Item("Image 36", R.drawable.imge36));
            items.add(new Item("Image 37", R.drawable.imge37));
            items.add(new Item("Image 38", R.drawable.imge38));
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i)
        {
            return items.get(i);
        }
        public long getItemId(int i)
        {
            return items.get(i).drawableId;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            View v = view;
            ImageView picture;
            TextView name;

            if(v == null)
            {
                v = inflater.inflate(R.layout.gridview_item, viewGroup, false);
                v.setTag(R.id.picture, v.findViewById(R.id.picture));
                v.setTag(R.id.text, v.findViewById(R.id.text));
            }

            picture = (ImageView)v.getTag(R.id.picture);
            name = (TextView)v.getTag(R.id.text);

            Item item = (Item)getItem(i);

            picture.setImageResource(item.drawableId);
            name.setText(item.name);
            return v;
        }

        private class Item
        {
            final String name;
            final int drawableId;

            Item(String name, int drawableId)
            {
                this.name = name;
                this.drawableId = drawableId;
            }
        }
    }

}















