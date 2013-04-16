package br.com.rubythree.employees;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button addButton = (Button) findViewById(R.id.add_button);
		Button showButton = (Button) findViewById(R.id.show_button);
		
		addButton.setOnClickListener(new OnClickListener () {
			
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, AddActivity.class);
				startActivity(intent);
			}
		});
		
		showButton.setOnClickListener(new OnClickListener () {
			
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, ShowActivity.class);
				startActivity(intent);
			}
		});
	}


}
