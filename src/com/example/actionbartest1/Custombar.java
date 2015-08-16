package com.example.actionbartest1;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
public class Custombar extends ActionBarActivity{
	ActionBarActivity mContext;
	ActionBar mActionBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);
		mContext=this; //点击菜单里才能用到 
		mActionBar=getSupportActionBar();
		mActionBar.setTitle("sec");
		mActionBar.setDisplayHomeAsUpEnabled(true);
		Utils.getOverflowMenu(this);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuItem fav=menu.add("fav").setIcon(R.drawable.ic_action_bad).setOnMenuItemClickListener(new OnMenuItemClickListener() {
			
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				// TODO Auto-generated method stub
				Toast.makeText(mContext,"click "+item.getTitle(), Toast.LENGTH_SHORT).show();
				return true;
			}
		});
		fav.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM|MenuItem.SHOW_AS_ACTION_WITH_TEXT);
		//MenuCompat.setShowAsAction(add,MenuItem.SHOW_AS_ACTION_IF_ROOM);
		
		MenuItem setting = menu.add("setting").setIcon(R.drawable.ic_launcher).setOnMenuItemClickListener(new OnMenuItemClickListener() {
			
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				// TODO Auto-generated method stub
				//处理逻辑
				return true;
			}
		});
		setting.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
		return super.onCreateOptionsMenu(menu);
	}

}
