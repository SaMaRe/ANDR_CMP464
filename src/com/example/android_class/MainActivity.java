package com.example.android_class;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * This first activity just shows a static list view that does
 * nothing when the items are clicked
 * @author josh
 *
 */
public class MainActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //the list view to be populated with items
        ListView lv = (ListView) findViewById(R.id.staticlv);
        //our array of items
        String[] planets = getResources().getStringArray(R.array.planets_array);
        //adapter to be added to the list view which contains array of items
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        		this,
        		android.R.layout.simple_list_item_1,
        		planets
        );
        //set the adapter
        lv.setAdapter(adapter);
    }
    
    public void toListEvents(View view){
    	Intent intent = new Intent(this,ListOfEvents.class);
    	startActivity(intent);
    }
    public void toSampleList(View view){
    	Intent intent = new Intent(this,AnotherSampleList.class);
    	startActivity(intent);
    }
}
