package com.vutuanchien.gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.gridView);
        // Instance of ImageAdapter Class
        GridViewAdapter adapter = new GridViewAdapter(this);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Sending image pos to FullScreenActivity
                Intent intent = new Intent(MainActivity.this, ShowingImage.class);
                intent.putExtra("pos", position);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Position: " + (position + 1), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
