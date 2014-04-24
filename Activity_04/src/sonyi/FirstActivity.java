package sonyi;

import sonyi.activity_04.*;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_activity);
		
		TextView myTextView = (TextView)findViewById(R.id.myTextViewOne);
		Button myButton = (Button)findViewById(R.id.myButtonOne);
		myTextView.setText(R.string.FirstActivityTextViewOne);
		myButton.setText(R.string.FirstActivityButtonOne);
		myButton.setOnClickListener(new MyButtonlistener());
		
		System.out.println("FitstActivity---->onCreate");
		
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
	
	




	class MyButtonlistener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(FirstActivity.this, SecondActivity.class);
			FirstActivity.this.startActivity(intent);
		}
		
	}


	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		System.out.println("FitstActivity---->onStart");
		super.onStart();
	}


	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		System.out.println("FitstActivity---->onResume");
		super.onResume();
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		System.out.println("FitstActivity---->onPause");
		super.onPause();
	}


	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		System.out.println("FitstActivity---->onStop");
		super.onStop();
	}


	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		System.out.println("FitstActivity---->onDestroy");
		super.onDestroy();
	}


	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		System.out.println("FitstActivity---->onRestart");
		super.onRestart();
	}
	
	
	

}
