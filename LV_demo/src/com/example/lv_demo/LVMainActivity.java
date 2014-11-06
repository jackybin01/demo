package com.example.lv_demo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class LVMainActivity extends Activity implements OnItemClickListener{

	ListView listview;
	ArrayAdapter<Model> adapter; 
	List<Model> list = new ArrayList<Model>();
	
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_lvmain);
		
		listview = (ListView) findViewById(R.id.mainlv);
		adapter = new MyAdapter(this,getModel());
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(this);
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		TextView title = (TextView) v.getTag(R.id.tit);
		TextView time = (TextView) v.getTag(R.id.time);
		TextView des = (TextView) v.getTag(R.id.descrip);
		Toast.makeText(v.getContext(), title.getText(), Toast.LENGTH_SHORT).show();
			}
	
	private List<Model> getModel() {
		list.add(new Model("title 1", "time 1", "abc123"));
		list.add(new Model("title 2", "time 2", "123abc"));
		list.add(new Model("title 3", "time 3", "321cba"));
		list.add(new Model("title 4", "time 4", "cba321"));
		return list;
	}

}