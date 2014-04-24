package sonyi;

import java.util.ArrayList;
import java.util.HashMap;

import sonyi.listactivitytest.*;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ListText extends ListActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		HashMap<String, String> map1 = new HashMap<String,String>();
		HashMap<String, String> map2 = new HashMap<String,String>();
		HashMap<String, String> map3 = new HashMap<String,String>();
		HashMap<String, String> map4 = new HashMap<String,String>();
		HashMap<String, String> map5 = new HashMap<String,String>();
		HashMap<String, String> map6 = new HashMap<String,String>();
		HashMap<String, String> map7 = new HashMap<String,String>();
		HashMap<String, String> map8 = new HashMap<String,String>();
		HashMap<String, String> map9 = new HashMap<String,String>();
		HashMap<String, String> map10 = new HashMap<String,String>();
		HashMap<String, String> map11 = new HashMap<String,String>();
		
		map1.put("user_name", "zhangsan");
		map1.put("user_ip", "192.168.0.1");
		map2.put("user_name", "lisi");
		map2.put("user_ip", "192.168.0.2");
		map3.put("user_name", "wangwu");
		map3.put("user_ip", "192.168.0.3");
		map4.put("user_name", "zhangsan");
		map4.put("user_ip", "192.168.0.1");
		map5.put("user_name", "lisi");
		map5.put("user_ip", "192.168.0.2");
		map6.put("user_name", "wangwu");
		map6.put("user_ip", "192.168.0.3");
		map7.put("user_name", "zhangsan");
		map7.put("user_ip", "192.168.0.1");
		map8.put("user_name", "lisi");
		map8.put("user_ip", "192.168.0.2");
		map9.put("user_name", "wangwu");
		map9.put("user_ip", "192.168.0.3");
		map10.put("user_name", "lisi");
		map10.put("user_ip", "192.168.0.2");
		map11.put("user_name", "wangwu");
		map11.put("user_ip", "192.168.0.3");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		list.add(map6);
		list.add(map7);
		list.add(map8);
		list.add(map9);
		list.add(map10);
		list.add(map11);
		
		SimpleAdapter listAdapter = new SimpleAdapter(this, list, R.layout.user, new String[]{"user_name","user_ip"}, new int[]{R.id.user_name,R.id.user_id});
		setListAdapter(listAdapter);
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		System.out.println("id--------------" + id);
		System.out.println("position--------------" + position);
	}
	
	
	

}
