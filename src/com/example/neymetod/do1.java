package com.example.neymetod;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.VideoView;


public class do1 extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
		        setContentView(R.layout.do1);
		        VideoView videoview = (VideoView) findViewById(R.id.videoView1);

		        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.do1vid);

		        videoview.setVideoURI(uri);
		        videoview.start();

		        
		        
		    } 
}
