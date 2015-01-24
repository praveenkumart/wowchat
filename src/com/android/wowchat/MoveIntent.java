package com.android.wowchat;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;

public class MoveIntent extends  ActionBarActivity{ 

	public void MoveIntents() {
		startActivity(new Intent(this,Register.class));
		
	}
	
}
