package com.vutuanchien.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by MY PC on 15/03/2016.
 */
public class GridViewAdapter extends BaseAdapter {
    private Context context;
    // Keep all Images in array
    public Integer[] flowers = {
            R.drawable.h1, R.drawable.h2, R.drawable.h3, R.drawable.h4,
            R.drawable.h5, R.drawable.h6, R.drawable.h7, R.drawable.h8,
            R.drawable.h9, R.drawable.h10, R.drawable.h11, R.drawable.h12,
            R.drawable.h1, R.drawable.h2, R.drawable.h3, R.drawable.h4,
            R.drawable.h5, R.drawable.h6, R.drawable.h7, R.drawable.h8,
            R.drawable.h9, R.drawable.h10, R.drawable.h11, R.drawable.h12,};

    public GridViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return flowers.length;
    }

    @Override
    public Object getItem(int position) {
        return flowers[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 350));
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(flowers[position]);
        return imageView;
    }
}
