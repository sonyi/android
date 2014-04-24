package sonyi;

import sonyi.activity_06.*;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThirdActivity extends Activity{
	private Button myButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
		myButton = (Button)findViewById(R.id.ThirdActivityButtonOne);
		myButton.setOnClickListener(new OnClickButtonListener());
		
	}
	
	class OnClickButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Uri uri = Uri.parse("smsto://0800000123");
			Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
			intent.putExtra("some_body", "the SMS text");
			startActivity(intent);
			
		}
		
	}
	

}
