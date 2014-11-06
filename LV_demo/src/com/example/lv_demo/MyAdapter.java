package com.example.lv_demo;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<Model> {
	private final List<Model> list;
	private final Activity context;
	String name;
	
	public MyAdapter(Activity context, List<Model> list ) {
		super(context, R.layout.row, list);
		this.list = list;
		this.context = context;
	}
	
	static class ViewHolder {
	protected ImageView mpropic;
	protected TextView mtitle;
	protected TextView mtime;
	protected TextView mdescrip;
}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		ViewHolder viewholder;
		if(convertView == null)
		{
			LayoutInflater inflator = context.getLayoutInflater();
			convertView = inflator.inflate(R.layout.row, null);
			viewholder = new ViewHolder();
			viewholder.mpropic = (ImageView) convertView.findViewById(R.id.propic);
			viewholder.mtitle = (TextView) convertView.findViewById(R.id.tit);
			viewholder.mtime = (TextView) convertView.findViewById(R.id.time);
			viewholder.mdescrip = (TextView) convertView.findViewById(R.id.descrip);
			
			convertView.setTag(viewholder);
			convertView.setTag(R.id.propic, viewholder.mpropic);
			convertView.setTag(R.id.tit, viewholder.mtitle);
			convertView.setTag(R.id.time, viewholder.mtime);
			convertView.setTag(R.id.descrip, viewholder.mdescrip);
		}
		
		else {
			viewholder = (ViewHolder) convertView.getTag();
		}
		
		
//		viewholder.mpropic.setText(list.get(position).getProfilePic());
		viewholder.mpropic.setImageResource(R.drawable.fishing11);
		viewholder.mtitle.setText(list.get(position).getTitle());
		viewholder.mtime.setText(list.get(position).getTitle());
		viewholder.mdescrip.setText(list.get(position).getDescription());
		return convertView;
	}
		
	
}
