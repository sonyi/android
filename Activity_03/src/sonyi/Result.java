package sonyi;

import sonyi.activity_03.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends Activity{
	private TextView resultView;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rusult);
		resultView = (TextView)findViewById(R.id.myTextView);
		
		Intent intent = getIntent();
		String factorOneStr = intent.getStringExtra("one");
		String factorTwoStr = intent.getStringExtra("two");
		
		int factorOneInt = Integer.parseInt(factorOneStr);
		int factorTwoInt = Integer.parseInt(factorTwoStr);
		int result = factorOneInt * factorTwoInt;
		
		resultView.setText(result + "");
		
		
	}

}
