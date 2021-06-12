package com.example.gridviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class CustomGrid1 extends BaseAdapter {
    private Context mContext;
    private final String[] web1;
    private final int[] Imageid1;

    public CustomGrid1(Context c,String[] web,int[] Imageid ) {
        mContext = c;
        this.Imageid1 = Imageid;
        this.web1 = web;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return web1.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid2, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(web1[position]);
            imageView.setImageResource(Imageid1[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}