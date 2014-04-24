package sonyi;

import sonyi.activity_06.*;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity{
	private Button myButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		myButton = (Button)findViewById(R.id.SecondActivityButtonOne);
		myButton.setOnClickListener(new OnClickButtonListener());
		
		
	}
	
	class OnClickButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(SecondActivity.this, ThirdActivity.class);
			SecondActivity.this.startActivity(intent);
			finish();
			
		}
		
	}
	

}
