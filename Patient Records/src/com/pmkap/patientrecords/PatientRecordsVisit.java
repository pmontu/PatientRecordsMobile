package com.pmkap.patientrecords;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientRecordsVisit extends Activity {

	private Button btnVisitCancel;
	private Button btnVisitSave;
	private Button btnVisitFinish;
	private Button btnVisitAddAnother;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.visit);

	    btnVisitCancel = (Button)findViewById(R.id.btnVisitCancel);
	    btnVisitSave = (Button)findViewById(R.id.btnVisitSave);
	    btnVisitFinish = (Button)findViewById(R.id.btnVisitFinish);
	    btnVisitAddAnother = (Button)findViewById(R.id.btnVisitAddAnother);
	    
	    btnVisitFinish.setVisibility(View.GONE);
	    btnVisitAddAnother.setVisibility(View.GONE);
	}

}
