package sonyi;

import sonyi.activity_02.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ActivityThree extends Activity{
	private TextView myTextView = null;
	private Button myButton1ThreeActivity = null;
	private Button myButton2ThreeActivity = null;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.three_activity);
		
		myTextView = (TextView)findViewById(R.id.myTextViewThreeActivity);
		myButton1ThreeActivity = (Button)findViewById(R.id.myButton1ThreeActivity);
		myButton2ThreeActivity = (Button)findViewById(R.id.myButton2ThreeActivity);
		
		Intent intent = getIntent();
		String s = intent.getStringExtra("ActivityMainToActivityThree");
		
		
		myTextView.setText("three Activity");
		myButton1ThreeActivity.setText("button1");
		myButton2ThreeActivity.setText(s);
	}

}
