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

public class kad1 extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
		        setContentView(R.layout.kad1x);
		       
		        Button neybtn = (Button) findViewById(R.id.fadugme);
		        neybtn.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.FA11"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        Button neybt1n = (Button) findViewById(R.id.midugme);
		        neybt1n.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.MI11"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        Button neybtn1 = (Button) findViewById(R.id.fadidugme);
		        neybtn1.setOnClickListener(new OnClickListener()
		        {

					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.FADI11"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        Button neybtn23 = (Button) findViewById(R.id.redugme);
		        neybtn23.setOnClickListener(new OnClickListener()
		        {

					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.RE11"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        
		        Button neybtna = (Button) findViewById(R.id.dodugme);
		        neybtna.setOnClickListener(new OnClickListener()
		        {

					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.DO11"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        Button nqeybtn = (Button) findViewById(R.id.dodidugme);
		        nqeybtn.setOnClickListener(new OnClickListener()
		        {

					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.DODI11"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        Button neybtn6 = (Button) findViewById(R.id.sidugme);
		        neybtn6.setOnClickListener(new OnClickListener()
		        {

					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.SI11"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        
		        Button neybtn5 = (Button) findViewById(R.id.sibedugme);
		        neybtn5.setOnClickListener(new OnClickListener()
		        {

					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.SIBE11"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        Button ney1btn = (Button) findViewById(R.id.ladugme);
		        ney1btn.setOnClickListener(new OnClickListener()
		        {

					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.LA11"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        Button neyb2tn = (Button) findViewById(R.id.soldugme);
		        neyb2tn.setOnClickListener(new OnClickListener()
		        {

					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.SOL11"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        
		    } 
}
