package com.androidtutorialpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;
 
public class MainActivity extends Activity{
 
    // Array of strings storing Players names
    String[] name = new String[] {
      
    		 "Rahul Dravid",
    	        "Sachin Tendulkar",
    	      "Virender sehwag",
    	     "Yuvraj singh",
    	        "Zaheer khan"
      
    };
 
    // Array of integers points to images stored in /res/drawable/
    int[] image = new int[]{
       
        R.drawable.rahuldravid,
        R.drawable.sachintendulkar,
        R.drawable.virendersehwag,
        R.drawable.yuvrajsingh,
        R.drawable.zaheerkhan,
       
    };
 
   
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
 
        // Each row in the list stores name, image
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
 
        for(int i=0;i<5;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("name", "" + name[i]);
         
            hm.put("image", Integer.toString(image[i]) );
            aList.add(hm);
        }
 
        // Keys used in Hashmap
        String[] from = { "image","name" };
 
        // Ids of views in listview_layout
        int[] to = { R.id.imageView1,R.id.textView1};
 
        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listrow, from, to);
 
        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView ) findViewById(R.id.listView1);
 
        // Setting the adapter to the listView
        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new OnItemClickListener() {

    			@Override
    			public void onItemClick(AdapterView<?> parent, View view,
    					int position, long id){
    				// TODO Auto-generated method stub
    			
    				
    				
    				if(position==0)
    				{
    					 Intent i = new Intent(getApplicationContext(), Newpage1.class);
    	                  		               
    		              startActivity(i);
    				}
    				if(position==1)
    				{
    					 Intent i = new Intent(getApplicationContext(), Newpage2.class);
    	                  		               
    		              startActivity(i);
    				}
    				if(position==2)
    				{
    					 Intent i = new Intent(getApplicationContext(), Newpage3.class);
    	                     		               
    		              startActivity(i);
    				}
    				if(position==3)
    				{
    					 Intent i = new Intent(getApplicationContext(), Newpage4.class);
    	                 
    		               
    		              startActivity(i);
    				}
    				if(position==4)
    				{
    					 Intent i = new Intent(getApplicationContext(),Newpage5.class);
    	                 
    		               
    		              startActivity(i);
    				}
    			
    				
    			
    				
    			}
        });
    }



	


}