package com.vutuanchien.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShowingImage extends AppCompatActivity {

    ImageView showImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing_image);
        // get pos by getintent data
        int positon = getIntent().getExtras().getInt("pos");
        GridViewAdapter adapter = new GridViewAdapter(this);
        showImage = (ImageView) findViewById(R.id.showImage);
        showImage.setImageResource(adapter.flowers[positon]);
    }

    //Set onclick for btnBack to return Mainactivity
    public void backMainactivity(View view) {
        finish();
    }
}
