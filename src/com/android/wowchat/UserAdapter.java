package com.android.wowchat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class UserAdapter extends ArrayAdapter<UserModel>  {

	
	UserModel[] usersList;
	Context myContext;

	public UserAdapter(Context context, UserModel[] usersList) {
		super(context, R.layout.activity_chat_list, usersList);
		this.usersList=usersList;
		this.myContext=context;
	}

	// It gets a View that displays in the drop down popup the data at the specified position
	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) {
		return getCustomView(position, convertView, parent);
	}

	// It gets a View that displays the data at the specified position
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return getCustomView(position, convertView, parent);
	}


	private View getCustomView(final int position, View convertView, ViewGroup parent) {
		if(convertView == null){
			LayoutInflater mLayoutInflater = LayoutInflater.from(myContext);
			convertView = mLayoutInflater.inflate(R.layout.activity_chat_list, parent, false);
		}

		TextView nameTextView = (TextView) convertView.findViewById(R.id.chat_name);
		TextView messageTextView = (TextView) convertView.findViewById(R.id.chat_message);
		//		ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageView_photo);

		nameTextView.setText(usersList[position].getName());
		messageTextView.setText(usersList[position].getEmail());

		convertView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
					Toast.makeText(getContext(), "Clicked "+(position+1), Toast.LENGTH_SHORT).show(); 
			}
		});
		return convertView;
	}
}
