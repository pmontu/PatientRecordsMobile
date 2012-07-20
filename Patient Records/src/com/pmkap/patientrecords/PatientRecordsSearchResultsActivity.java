package com.pmkap.patientrecords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class PatientRecordsSearchResultsActivity extends Activity {

	private ListView lvSearchResults;
	private SimpleAdapter adapter;
	private ArrayList<Map<String,String>> list = new ArrayList<Map<String,String>>();
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.searchresults);
	    
	    /* RESULTS */
	    String[] from = {"name", "age", "gender"};
	    int[] to = {R.id.txtSearchResults_Name, R.id.txtSearchResults_Age, R.id.txtSearchResults_Gender};
	    adapter = new SimpleAdapter(this, list, R.layout.row_patient, from, to);
	    lvSearchResults = (ListView)findViewById(R.id.lvSearchResults);
	    lvSearchResults.setAdapter(adapter);
	    HashMap<String,String> item = new HashMap<String,String>();
	    item.put("name", "Manoj");
	    item.put("age", "25");
	    item.put("gender", "M");
	    list.add(item);
	    item = new HashMap<String,String>();
	    item.put("name", "Ajay");
	    item.put("age", "25");
	    item.put("gender", "M");
	    list.add(item);	    
	    adapter.notifyDataSetChanged();
	    
	    lvSearchResults.setOnItemClickListener(new OnItemClickListener(){		
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent myIntent = new Intent(PatientRecordsSearchResultsActivity.this,PatientRecordsPatientDetails.class);
		        //myIntent.putExtra("Name","Manoj");
				PatientRecordsSearchResultsActivity.this.startActivity(myIntent);
		        //PatientRecordsSearchResultsActivity.this.finish();				
			}			
		});
	    
	}

}
