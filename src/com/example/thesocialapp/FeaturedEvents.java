package com.example.thesocialapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;

public class FeaturedEvents extends Fragment  {
		public View onCreateView(LayoutInflater inflater, ViewGroup container, 
				Bundle savedInstanceState){
			View view = inflater.inflate(R.layout.activity_featured_events, container, false);
			
			ImageButton imagebuttonfeatured = (ImageButton) view.findViewById(R.id.imagebuttonFeatured);
	        imagebuttonfeatured.setOnClickListener(
	        		new OnClickListener() {
	        		public void onClick(View v){
	        			LayoutInflater layoutInflater = (LayoutInflater)getActivity().getLayoutInflater();
	        			View view = layoutInflater.inflate(R.layout.event_popup, null);
	        			final PopupWindow popupWindow = new PopupWindow(view, 750, 1200);
	        			popupWindow.showAsDropDown(view, 10, 10);

	        			Button dismiss = (Button)view.findViewById(R.id.button1);
	        			dismiss.setOnClickListener(
	        					new View.OnClickListener() {
	        						public void onClick(View v) {
	        							popupWindow.dismiss();
	        						}
	        		});
	        		}
	        		}
	        		);
			return view;
		}

		public class FeaturedEvents1 extends ActionBarActivity {
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_featured_events);
		}

		//@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.featured_events, menu);
			return true;
		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			// Handle action bar item clicks here. The action bar will
			// automatically handle clicks on the Home/Up button, so long
			// as you specify a parent activity in AndroidManifest.xml.
			int id = item.getItemId();
			if (id == R.id.action_settings) {
				return true;
			}
			return super.onOptionsItemSelected(item);
		}
	}
}