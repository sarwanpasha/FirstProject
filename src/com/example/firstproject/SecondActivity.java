package com.example.firstproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends ActionBarActivity {
Button Submit;
TextView tvusername,tvpassward;
EditText etusername,etpassward;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_second);
	
	Submit=(Button)findViewById(R.id.btnSubmit);
	tvusername=(TextView)findViewById(R.id.tvUsername);
	tvpassward=(TextView)findViewById(R.id.tvPassward);
	etusername=(EditText)findViewById(R.id.etUsername);
	etpassward=(EditText)findViewById(R.id.etPassward);
	
	Submit.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String username,passward;
			username=etusername.getText().toString();
			passward=etpassward.getText().toString();
			
			
			if((username.equals("sarwan"))&&(passward.equals("123456"))){
				Toast.makeText(getApplicationContext(),"Welcome Pasha",Toast.LENGTH_SHORT).show();
				startActivity(new Intent(SecondActivity.this,FirstProject.class));
			}
			else{
				Toast.makeText(getApplicationContext(),"Invalid Username and passward",Toast.LENGTH_SHORT).show();

			}
//			tvusername.setText(username);
//			tvpassward.setText(passward);
			
			
		}
	});

	
	
	}
}
