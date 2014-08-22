package com.example.firstproject;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstProject extends Activity{
	Button Add,Subtract;
	TextView show;
	int counter=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_project);
		
	Add = (Button)findViewById(R.id.btnAdd);
	Subtract = (Button)findViewById(R.id.btnSubtract);
	show = (TextView)findViewById(R.id.tvShow);
	show.setText(String.valueOf(counter));
	
	Add.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			counter++;
			show.setText(String.valueOf(counter));
			
		}
	});
	Subtract.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			counter--;
			show.setText(String.valueOf(counter));
		}
	});

	}
	
	
	
	
	
}
