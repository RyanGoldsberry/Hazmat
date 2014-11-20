package com.example.startbtn;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.*;
import android.content.*;
import android.os.Bundle;

public class FourthActivity extends ActionBarActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);
    }
        public void showAlertDialog(View v){
        	
        	AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        	
        	alertDialog.setTitle("What the Hell is That?!?");
        	
        	alertDialog.setMessage("YOU HAVE ENCOUNTERED AN UNDEAD!");
        	
        	alertDialog.setPositiveButton("USE WEAPON!", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Toast.makeText(getApplicationContext(), "You Killed it!!! Thanks for Playing!", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(FourthActivity.this, MainActivity.class);
					startActivity(intent);
					
				}
			});
			
			alertDialog.setNegativeButton("RUN!!!", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Toast.makeText(getApplicationContext(), "UNDEAD CHASED YOU DOWN", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(FourthActivity.this, FifthActivity.class);
					startActivity(intent);
				}
			});
			
				alertDialog.show();
        }
};
        
        