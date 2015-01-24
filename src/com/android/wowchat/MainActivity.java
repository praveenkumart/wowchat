package com.android.wowchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	String uname,upass;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.main_newuser).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {


				Toast.makeText(getApplicationContext(), "New user registration", Toast.LENGTH_SHORT).show();
//				startActivity(new Intent(this,ChatList.class));

			}
		});


	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu items for use in the action bar
		//	    MenuInflater inflater = getMenuInflater();
		//	    inflater.inflate(R.menu.main, menu);
		//	    return super.onCreateOptionsMenu(menu);
		return false;
	}

	public void login(View v)
	{
		EditText name =(EditText) findViewById(R.id.main_name);
		EditText password=(EditText) findViewById(R.id.main_password);

		uname=name.getText().toString();
		upass=password.getText().toString();
		//				Toast.makeText(getApplicationContext(), "Signinclicked and values are "+uname+","+upass, Toast.LENGTH_SHORT).show();
		if(uname.equals("")||upass.equals(""))
		{
			Toast.makeText(getApplicationContext(), "You cannot leave the username or password field blank", Toast.LENGTH_SHORT).show();
		}
		else if (uname.equals("pvk")||upass.equals("123")) {
			startActivity(new Intent(this,ChatList.class));
			//			Toast.makeText(getApplicationContext(), "Signinclicked and values are "+uname+","+upass, Toast.LENGTH_SHORT).show();

		}
		else {
			Toast.makeText(getApplicationContext(), "You haven't registered on wowchat ,Please Register and Enjoy WOW", Toast.LENGTH_SHORT).show();
			startActivity(new Intent(this,Register.class));


		}
	}
}
