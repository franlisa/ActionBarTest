package com.example.actionbartest1;

import android.support.v7.app.ActionBarActivity;

import java.lang.reflect.Field;
import java.math.MathContext;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	android.support.v7.app.ActionBar mActionbar;
	ActionBarActivity mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext=this;
		Utils.getOverflowMenu(this);
		//用getActionbar总是会提示null
		mActionbar = getSupportActionBar();
		mActionbar.setTitle("bar");
//		mActionbar.setDisplayHomeAsUpEnabled(true);//用这个设置，往回的箭头跟title都在
//		mActionbar.setDisplayOptions(ActionBar.DISPLAY_HOME_AS_UP);//设置了这个 title就会不在
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		switch (id) {
		case R.id.action_next:
			Intent intent = new Intent(MainActivity.this,Custombar.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			this.startActivity(intent);
			break;

		default:
			Toast.makeText(this, "click "+item.getTitle(), Toast.LENGTH_SHORT).show();
		}
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
