package com.example.startbtn;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.*;
import android.content.*;
import android.os.Bundle;

public class SecondActivity extends ActionBarActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }
    
    
    
        public void showAlertDialog(View v){
        	
        	AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        	
        	alertDialog.setTitle("What Do You Want To Do?");
        	
        	alertDialog.setMessage("Choose Wisely");
        	
        	alertDialog.setPositiveButton("Continue Forward", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Toast.makeText(getApplicationContext(), "You've Continued forward", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
					startActivity(intent);
					
				}
					
				
			});
			
			alertDialog.setNegativeButton("Lay Back Down", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Toast.makeText(getApplicationContext(), "You have been devoured in your sleep!!!", Toast.LENGTH_SHORT).show();
					
				}
			});
			
				alertDialog.show();
        }
        
        

};
