package com.pmkap.patientrecords;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientRecordsSearchActivity extends Activity {

	private Button btnSearchResultsActivity;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.search);
	    
	    /* SEARCH RESULTS */
	    btnSearchResultsActivity = (Button)findViewById(R.id.btnSearchResultsActivity);
	    btnSearchResultsActivity.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				Intent myIntent = new Intent(PatientRecordsSearchActivity.this,PatientRecordsSearchResultsActivity.class);
				PatientRecordsSearchActivity.this.startActivity(myIntent);
				//PatientRecordsSearchActivity.this.finish();	
			}
		});
	}

}
