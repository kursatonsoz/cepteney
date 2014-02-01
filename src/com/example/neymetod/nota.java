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

public class nota extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) 
		{
		
			super.onCreate(savedInstanceState);
		        setContentView(R.layout.notax);
		       
		        Button neybtn = (Button) findViewById(R.id.kad1dug);
		        neybtn.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.KAD11"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        Button neybtn2 = (Button) findViewById(R.id.kad2dug);
		        neybtn2.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.KAD22"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        Button neybtn3 = (Button) findViewById(R.id.kad3dug);
		        neybtn3.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.KAD33"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		       
		        
		        
		    }
	
	
}
