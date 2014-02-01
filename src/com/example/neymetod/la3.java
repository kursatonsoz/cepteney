package com.example.neymetod;

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

public class la3 extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
		        setContentView(R.layout.la3);
		       
		        VideoView videoview = (VideoView) findViewById(R.id.videoView1);

		        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.la3);

		        videoview.setVideoURI(uri);
		        videoview.start();
		        
		    } 
}
