package com.example.startbtn;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.*;
import android.content.Intent;
import android.os.Bundle;




public class SecondActivity extends ActionBarActivity {

	Button btn;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        btn = (Button)findViewById(R.id.btnEnd);
        btn.setOnClickListener(new View.OnClickListener() {
        	
        	public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (SecondActivity.this,MainActivity.class);
				startActivity(intent);
        };
    });

}};
