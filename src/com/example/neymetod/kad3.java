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

public class kad3 extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
		        setContentView(R.layout.kad3x);
		       
		        Button neybtn = (Button) findViewById(R.id.la3dugme);
		        neybtn.setOnClickListener(new OnClickListener()
		        {

					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.LA33"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        Button neybt1n = (Button) findViewById(R.id.sol3dugme);
		        neybt1n.setOnClickListener(new OnClickListener()
		        {

				
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.SOL33"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        Button neybtn1 = (Button) findViewById(R.id.fa3dugme);
		        neybtn1.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.FA33"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        Button neybtn23 = (Button) findViewById(R.id.fadi3dugme);
		        neybtn23.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.FADI33"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        
		        Button neybtna = (Button) findViewById(R.id.mi3dugme);
		        neybtna.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.MI33"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        Button nqeybtn = (Button) findViewById(R.id.re3dugme);
		        nqeybtn.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.RE33"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        
		        
		        
		    } 
}
