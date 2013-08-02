package com.example.contendores;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView txtColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ly_tablet_layout);
        
        txtColor=(TextView) findViewById(R.id.txt_nombre_color);
    }
    
    public void setRojo(View v){
    	txtColor.setText("Rojo");
    }
    public void setVerde(View v){
    	txtColor.setText("Verde");
    }
    public void setVioleta(View v){
    	txtColor.setText("Violeta");
    }


   
    
}
