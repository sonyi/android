package sonyi;

import sonyi.progressbartest.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarTest extends Activity{
	private ProgressBar firstBar;
	private ProgressBar secondBar;
	private Button myButton;
	private int i = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		firstBar = (ProgressBar)findViewById(R.id.firstBar);
		secondBar = (ProgressBar)findViewById(R.id.secondBar);
		myButton = (Button)findViewById(R.id.myButton);
		myButton.setOnClickListener(new ButtonListener());
		
	}
	
	class ButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(i == 0){
				firstBar.setVisibility(View.VISIBLE);
				secondBar.setVisibility(View.VISIBLE);
			
			}
			else if(i < firstBar.getMax()){
				firstBar.setProgress(i);
				firstBar.setSecondaryProgress(i + 10);
				secondBar.setProgress(i);
			
			}
			else{
				firstBar.setVisibility(View.GONE);
				secondBar.setVisibility(View.GONE);	
				
			}	
			i += 10;
		}	
	}
}
