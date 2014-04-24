package sonyi;

import sonyi.activity_04.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends Activity {
    private TextView myTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		myTextView = (TextView)findViewById(R.id.SecondActivityTextView);
		myTextView.setText(R.string.SecondActivityTextViewOne);
		
		System.out.println("SecondActivity---->onCreate");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(0,1,1,R.string.Exit);
		menu.add(0,2,2,R.string.about);
		return super.onCreateOptionsMenu(menu);
	}




	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId() == 1){
			finish();
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		System.out.println("SecondActivity---->onStart");
		super.onStart();
	}


	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		System.out.println("SecondActivity---->onResume");
		super.onResume();
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		System.out.println("SecondActivity---->onPause");
		super.onPause();
	}


	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		System.out.println("SecondActivity---->onStop");
		super.onStop();
	}


	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		System.out.println("SecondActivity---->onDestroy");
		super.onDestroy();
	}


	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		System.out.println("SecondActivity---->onRestart");
		super.onRestart();
	}
	
	

}
