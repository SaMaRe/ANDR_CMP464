package com.example.originalhomework4;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class  DescriptionActivity  extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.description_lyt);
		String title = getIntent().getStringExtra("title");
		String description = getIntent().getStringExtra("description");
		TextView  tv = (TextView) findViewById(R.id.title);
		tv.setText(title);
		WebView wv = (WebView) findViewById(R.id.description);
		wv.loadData(description, "text/html", null);

	}
}
