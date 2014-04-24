package sonyi;

import sonyi.activity_03.R;
import android.app.Activity;
import android.content.Intent;
import android.os.*;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;



/**
 * @author Administrator
 *
 */
public class Activity03 extends Activity{
	private EditText factorOne;
	private TextView sysbol;
	private EditText factorTwo;
	private Button calculate;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		factorOne = (EditText)findViewById(R.id.factorOne);
		factorTwo = (EditText)findViewById(R.id.factorTwo);
		sysbol = (TextView)findViewById(R.id.symbol);
		calculate = (Button)findViewById(R.id.calculate);
		
		sysbol.setText(R.string.sysbol);
		calculate.setText(R.string.calculate);
		
		calculate.setOnClickListener(new CalculateListener());
		
	}
	class CalculateListener implements OnClickListener{
		public void onClick(View v){
			String factorOneStr = factorOne.getText().toString();
			String factorTwoStr = factorTwo.getText().toString();
					
			Intent intent = new Intent();
			intent.putExtra("one", factorOneStr);
			intent.putExtra("two", factorTwoStr);
			intent.setClass(Activity03.this, Result.class);
			Activity03.this.startActivity(intent);
			
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(0, 1, 1, R.string.exit);
		menu.add(0, 2, 2, R.string.about );
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
	

}
