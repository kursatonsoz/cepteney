package com.example.neymetod;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

@SuppressLint("ParserError")
public class ekran2 extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
		        setContentView(R.layout.ana);
		  
		        Button neybtn = (Button) findViewById(R.id.neydugme);
		        neybtn.setOnClickListener(new OnClickListener()
		        {

					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.NEYVE"));
						
						
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        Button neyy = (Button) findViewById(R.id.neyzendugme);
		        neyy.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.NEY"));
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		      
		      
		        
		        Button notta = (Button) findViewById(R.id.notadugme);
		        notta.setOnClickListener(new OnClickListener()
		        {

					
					public void onClick(View arg0) 
					{
						startActivity(new Intent("com.example.neymetod.NOTAA"));
						// TODO Auto-generated method stub
						
					}
		        	
		        });
		        
		        
		        
		    } 
}
