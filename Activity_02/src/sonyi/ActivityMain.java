package sonyi;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import sonyi.activity_02.*;


public class ActivityMain extends Activity {
	
	private Button button1 =null;
	private Button button2 = null;
	private TextView myTextView = null;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		button1 = (Button)findViewById(R.id.myButton1);
		button2 = (Button)findViewById(R.id.myButton2);
		myTextView = (TextView)findViewById(R.id.myTextView);
		
		button1.setText("第一个Button");
		button2.setText("第二个Button");
		myTextView.setText("My love develoment.");
		
		
		//匿名内部类
		button1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent();
				intent.setClass(ActivityMain.this,ActivityTwo.class);
				ActivityMain.this.startActivity(intent);
			}		
		});
		button2.setOnClickListener(new myButtonListener2());
	}
		

	//内部类
	class myButtonListener2 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(ActivityMain.this, ActivityThree.class);
			intent.putExtra("ActivityMainToActivityThree", "Intent的值传递");
			ActivityMain.this.startActivity(intent);
			
		}
	}
	
}
