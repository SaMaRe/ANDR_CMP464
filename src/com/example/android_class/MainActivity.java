package com.example.android_class;

import utils.Downloader;
import utils.Either;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

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
        (new Thread(new Runnable(){
			@Override
			public void run() {
				final Either<StringBuffer> optbuf = Downloader.downloadText("http://cis228.herokuapp.com/assets/objectives.txt");
				if(optbuf.isSuccess()){
					MainActivity.this.runOnUiThread(new Runnable(){
						@Override
						public void run() {
							TextView tv = (TextView) findViewById(R.id.mytxt);
							tv.setText(optbuf.getObject().toString());
						}
					});
				}else{
					try {
						throw optbuf.getError();
					} catch (Throwable e) {
						e.printStackTrace();
					}
				}
			}
        })).start();
    }
    
}
