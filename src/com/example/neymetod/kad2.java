package com.example.neymetod;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class kad2 extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
		        setContentView(R.layout.kad2x);
		       
		        Button neybtn = (Button) findViewById(R.id.re2dugme);
		        neybtn.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.RE22"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        Button neybt1n = (Button) findViewById(R.id.do2dugme);
		        neybt1n.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.DO22"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        Button neybtn1 = (Button) findViewById(R.id.dodi2dugme);
		        neybtn1.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.DODI22"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        Button neybtn23 = (Button) findViewById(R.id.si2dugme);
		        neybtn23.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.SI22"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        
		        Button neybtna = (Button) findViewById(R.id.sibe2dugme);
		        neybtna.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.SIBE22"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        Button nqeybtn = (Button) findViewById(R.id.la2dugme);
		        nqeybtn.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.LA22"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        Button neybtn6 = (Button) findViewById(R.id.sol2dugme);
		        neybtn6.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.SOL22"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        
		        
		        
		    } 
}
