package com.example.startbtn;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.*;
import android.content.*;
import android.os.Bundle;

public class ThirdActivity extends ActionBarActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
    }
        public void showAlertDialog(View v){
        	
        	AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        	
        	alertDialog.setTitle("You Have Found Two Weapons");
        	
        	alertDialog.setMessage("Which one shall you choose");
        	
        	alertDialog.setPositiveButton("Stick", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Toast.makeText(getApplicationContext(), "You should've took the hammer", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(ThirdActivity.this, FifthActivity.class);
					startActivity(intent);
				
				}
			});
			
			alertDialog.setNegativeButton("Hammer", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Toast.makeText(getApplicationContext(), "You Chose A Hammer", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
					startActivity(intent);
				}
			});
			
				alertDialog.show();
        }
};
        
        