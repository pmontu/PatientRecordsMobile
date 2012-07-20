package com.pmkap.patientrecords;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PatientRecordsHomeActivity extends Activity {
	
	private ImageButton btnRegisterActivity;
	private ImageButton btnSearchActivity;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        
        /* REGISTER ACTIVITY */
        btnRegisterActivity = (ImageButton)findViewById(R.id.btnRegisterActivity);
        btnRegisterActivity.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {				
				Intent myIntent = new Intent(PatientRecordsHomeActivity.this,PatientRecordsRegisterActivity.class);
				PatientRecordsHomeActivity.this.startActivity(myIntent);
			}
		});
        
        /* SEARCH ACTIVITY */
        btnSearchActivity = (ImageButton)findViewById(R.id.btnSearchActivity);
        btnSearchActivity.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent myIntent = new Intent(PatientRecordsHomeActivity.this,PatientRecordsSearchActivity.class);
				PatientRecordsHomeActivity.this.startActivity(myIntent);				
			}
		});
        
    }
}