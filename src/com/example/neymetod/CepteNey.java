package com.example.neymetod;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class CepteNey extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sp2);
    
    Thread iplik = new Thread()
    {
    	@Override
		public void run()
    	{
    		try{
    			sleep(5000);
    			startActivity(new Intent("com.example.neymetod.EKRANIKI"));
    		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		finally{
    			finish();
    		}
    	}
    };

    iplik.start();
   
    
    }
}
