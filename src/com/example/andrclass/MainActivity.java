package com.example.andrclass;

import utils.FileImageAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * This first shows a large  list of images 
 * Illustrate different methods of downloading and storing images
 * @author josh
 *
 */
public class MainActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView) findViewById(R.id.imagelist);
        		int imageCount = 100;
        		//because imageCount is large, ByteImageAdapter crashes because it
        		//is memory inefficient
        		//Lv.setAdapter(new ByteImageAdapter(this, imageCount))
        		//we use file image adapter to manage the images files
        lv.setAdapter(new FileImageAdapter(this, imageCount));
    }
}


