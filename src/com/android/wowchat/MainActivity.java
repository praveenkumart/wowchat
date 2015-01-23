package com.android.wowchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	String uname,upass;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		
	}

	public void login(View v)
{
//		EditText name =(EditText) findViewById(R.id.main_name);
//		EditText password=(EditText) findViewById(R.id.main_password);
//			
//		uname=name.getText().toString();
//		upass=password.getText().toString();
//		Toast.makeText(getApplicationContext(), "Signinclicked and values are "+uname+","+upass, Toast.LENGTH_SHORT).show();
		startActivity(new Intent(this,ChatList.class));
		
	}

}
