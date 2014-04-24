package sonyi;

import sonyi.activity_02.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends Activity{
	
	private TextView myTextView = null;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two_activity);
		
		myTextView = (TextView)findViewById(R.id.myTextViewTwo);
		myTextView.setText(R.string.myIntroduce);
	}

}
