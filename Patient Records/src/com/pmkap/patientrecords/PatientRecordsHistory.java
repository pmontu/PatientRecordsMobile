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

public class PatientRecordsHistory extends Activity {
	
	private ListView lvHistory;
	private SimpleAdapter adapter;
	private ArrayList<Map<String,String>> list = new ArrayList<Map<String,String>>();

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    setContentView(R.layout.history);
	    
	    String[] from = {"SN", "Condition", "Diagnosis","Treatment"};
	    int[] to = {R.id.tvRowHistorySN, R.id.tvRowHistoryCondition, R.id.tvRowHistoryDiagnosis, R.id.tvRowHistoryTreatment};
	    adapter = new SimpleAdapter(this, list, R.layout.row_history, from, to);
	    lvHistory = (ListView)findViewById(R.id.lvHistory);
	    lvHistory.setAdapter(adapter);
	    
	    HashMap<String,String> item = new HashMap<String,String>();
	    item.put("SN", "1");
	    item.put("Condition", "alfa");
	    item.put("Diagnosis", "Apple");
	    item.put("Treatment", "A");
	    list.add(item);
	    item = new HashMap<String,String>();
	    item.put("SN", "2");
	    item.put("Condition", "beta");
	    item.put("Diagnosis", "Grapes");
	    item.put("Treatment", "B");
	    list.add(item);	    
	    adapter.notifyDataSetChanged();
	    
	    /*lvHistory.setOnItemClickListener(new OnItemClickListener(){		
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent myIntent = new Intent(PatientRecordsSearchResultsActivity.this,PatientRecordsPatientDetails.class);
		        //myIntent.putExtra("Name","Manoj");
				PatientRecordsSearchResultsActivity.this.startActivity(myIntent);
		        //PatientRecordsSearchResultsActivity.this.finish();				
			}			
		});*/
	}

}
