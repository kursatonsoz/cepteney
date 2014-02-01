package com.example.neymetod;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class neyzen extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
		        setContentView(R.layout.neyzenn);

		        Button niyy = (Button) findViewById(R.id.niybut);
		        niyy.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.NIYAZI"));
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        Button azii = (Button) findViewById(R.id.azibut);
		        azii.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.AKAA"));
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		       
		        Button ahh = (Button) findViewById(R.id.ahbut);
		        ahh.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.AHMETT"));
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		    		
		        
		    }
	
	
}
