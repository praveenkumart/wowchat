package com.android.wowchat;

import com.android.wowchat.UserModel;

import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;
import android.os.Bundle;

public class ChatList extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chatlist);

		ListView myListView = (ListView) findViewById(R.id.chatlists_list);
		
		
		UserAdapter myUserAdapter=new UserAdapter(getApplicationContext(), createDummyUserModels());
		
		
		myListView.setAdapter(myUserAdapter);
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu items for use in the action bar
			    MenuInflater inflater = getMenuInflater();
			    inflater.inflate(R.menu.chat_list, menu);
			    return super.onCreateOptionsMenu(menu);
	}

	public UserModel[] createDummyUserModels(){

		String[] names={"anand","senthil","vipin","praveen","kiran","anoop","vipin","praveen","kiran","anoop"};
		String[] emails={"anandab@gmail.com","senthiljs@gmail.com","vipinkamara@gmail.com","praveen@gmail.com","kiran@gmail.com", "anoop@gmail.com","vipinkamara@gmail.com","praveen@gmail.com","kiran@gmail.com", "anoop@gmail.com"};
		UserModel[] userlist=new UserModel[names.length];
		for (int i = 0; i < emails.length; i++) {
			userlist[i]=new UserModel(names[i],emails[i]);
		}
		return userlist;
	}
}
