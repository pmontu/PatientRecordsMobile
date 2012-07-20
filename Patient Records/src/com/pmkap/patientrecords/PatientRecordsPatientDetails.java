package com.pmkap.patientrecords;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PatientRecordsPatientDetails extends Activity {

	private Button btnDetailsCancel;
	private Button btnDetailsSave;
	private ImageButton imgbtnDetailsAddVisit;
	private ImageButton imgbtnDetailsHistory;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.patientdetails);
	    btnDetailsCancel = (Button)findViewById(R.id.btnDetailsCancel);
	    btnDetailsSave = (Button)findViewById(R.id.btnDetailsSave);
	    imgbtnDetailsAddVisit = (ImageButton)findViewById(R.id.imgbtnDetailsAddVisit);
	    imgbtnDetailsHistory = (ImageButton)findViewById(R.id.imgbtnDetailsHistory);
	    
	    btnDetailsCancel.setVisibility(View.GONE);
	    btnDetailsSave.setVisibility(View.GONE);
	    
	    imgbtnDetailsAddVisit.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent myIntent = new Intent(PatientRecordsPatientDetails.this,PatientRecordsVisit.class);
		        //myIntent.putExtra("Name","Manoj");
		        PatientRecordsPatientDetails.this.startActivity(myIntent);
		        //PatientRecordsPatientDetails.this.finish();
			}
		});
	    
	    imgbtnDetailsHistory.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent myIntent = new Intent(PatientRecordsPatientDetails.this,PatientRecordsHistory.class);
		        //myIntent.putExtra("Name","Manoj");
		        PatientRecordsPatientDetails.this.startActivity(myIntent);
		        //PatientRecordsPatientDetails.this.finish();
			}
		});
	    
	}

}
