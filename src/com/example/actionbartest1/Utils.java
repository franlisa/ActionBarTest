package com.example.actionbartest1;

import java.lang.reflect.Field;

import android.content.Context;
import android.view.ViewConfiguration;

public  class Utils {
	//解决有实体菜单键不显示三个点
	   public static void getOverflowMenu(Context mContext)
	   {
		   try {
			   ViewConfiguration config = ViewConfiguration.get(mContext);
			   Field menuKey = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
			   if(null != menuKey){
				   menuKey.setAccessible(true);
				   menuKey.setBoolean(config, false);
			   }
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	   }

}
