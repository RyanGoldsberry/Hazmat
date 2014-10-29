package com.example.startbtn;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.*;
import android.content.Intent;
import android.os.Bundle;





public class SecondActivity extends ActionBarActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }
        public void showAlertDialog(View v){
        	
        	AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        	
        	alertDialog.setTitle("Confirm Delete...");
        	
        	alertDialog.setMessage("Are you sure you want to delete this?");
        	
        	alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Toast.makeText(getApplicationContext(), "You have pressed Yes", Toast.LENGTH_SHORT).show();
				}
			});
			
			alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Toast.makeText(getApplicationContext(), "You have pressed No", Toast.LENGTH_SHORT).show();
					
				}
			});
			
				alertDialog.show();
        }

};
