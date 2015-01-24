package com.android.wowchat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
	}

	public void register(View v)
	{
		EditText uname,pass,cpass,fname,lname,email,number;
		String username,passwrd,cpasswrd,fsname,lnname,mail,contact;
		uname=(EditText)findViewById(R.id.reg_name);
		username= uname.getText().toString();
		pass=(EditText)findViewById(R.id.reg_password);
		passwrd= pass.getText().toString();	
		cpass=(EditText)findViewById(R.id.reg_cpassword);
		cpasswrd= cpass.getText().toString();	 
		fname=(EditText)findViewById(R.id.reg_fname);
		fsname= fname.getText().toString();
		lname=(EditText)findViewById(R.id.reg_lname);
		lnname= lname.getText().toString();
		email=(EditText)findViewById(R.id.reg_email);
		mail= email.getText().toString();
		number=(EditText)findViewById(R.id.reg_contact);
		contact= number.getText().toString();
		if (username.equals("")|| passwrd.equals("")||cpasswrd.equals("")||fsname.equals("")||lnname.equals("")||mail.equals("")||contact.equals("")) {
			Toast.makeText(getApplicationContext(), "Some mandatory fields are missing", Toast.LENGTH_SHORT).show();
		}
		else if(passwrd.equals(cpasswrd)) {
			Toast.makeText(getApplicationContext(), "Registered Succesfully", Toast.LENGTH_SHORT).show();

		}
		else{
			Toast.makeText(getApplicationContext(), "Confirm password and password doesn't match", Toast.LENGTH_SHORT).show();
		}


	}
}
