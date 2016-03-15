package com.vutuanchien.android_chap11_spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MY PC on 14/03/2016.
 */
public class CustomAdapter extends BaseAdapter {

    Context context;
    int[] flags;
    String[] countryName;
    LayoutInflater inflater;

    public CustomAdapter(Context context, int[] flags,  String[] countryName) {
        this.context = context;
        this.flags = flags;
        this.countryName = countryName;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = inflater.inflate(R.layout.custom_spinner_items,null);
        ImageView icon = (ImageView) view.findViewById(R.id.igCountryFlag);
        TextView tvCountryName = (TextView) view.findViewById(R.id.tvCountryName);
        icon.setImageResource(flags[position]);
        tvCountryName.setText(countryName[position]);

        return view;
    }
}
