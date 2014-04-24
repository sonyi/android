package sonyi;

import sonyi.activity_07.*;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class RadioGroupActivity extends Activity{
	private RadioGroup genderGroup = null;
	private RadioButton femaleButton = null;
	private RadioButton maleButton = null;
	private CheckBox runBox = null;
	private CheckBox swimBox = null;
	private CheckBox readBox = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radiolayout);
		genderGroup = (RadioGroup)findViewById(R.id.genderGroup);
		femaleButton = (RadioButton)findViewById(R.id.femalButton);
		maleButton = (RadioButton)findViewById(R.id.maleButton);
		runBox = (CheckBox)findViewById(R.id.runBox);
		swimBox = (CheckBox)findViewById(R.id.swimBox);
		readBox = (CheckBox)findViewById(R.id.readBox);
		
		genderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(femaleButton.getId() == checkedId){
					System.out.println("female");
					Toast.makeText(RadioGroupActivity.this, "female", Toast.LENGTH_SHORT).show();
				}
				else if(maleButton.getId() == checkedId){
					System.out.println("male");
					Toast.makeText(RadioGroupActivity.this, "male", Toast.LENGTH_SHORT).show();
				}
			}
		});
		swimBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				if(arg1){
					System.out.println("swim is checked");
					Toast.makeText(RadioGroupActivity.this, "swim is checked", Toast.LENGTH_SHORT).show();
				}
				else {
					System.out.println("swim is unchecked");
					Toast.makeText(RadioGroupActivity.this, "swim is unchecked", Toast.LENGTH_SHORT).show();
				}
				
			}
		}); 
		
		runBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				if(arg1){
					System.out.println("run is checked");
					Toast.makeText(RadioGroupActivity.this, "run is checked", Toast.LENGTH_SHORT).show();
				}
				else {
					System.out.println("run is unchecked");
					Toast.makeText(RadioGroupActivity.this, "run is unchecked", Toast.LENGTH_SHORT).show();
				}
				
			}
		}); 
		
		readBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				if(arg1){
					System.out.println("read is checked");
					Toast.makeText(RadioGroupActivity.this, "read is checked", Toast.LENGTH_SHORT).show();
				}
				else {
					System.out.println("read is unchecked");
					Toast.makeText(RadioGroupActivity.this, "read is unchecked", Toast.LENGTH_SHORT).show();
				}
				
			}
		}); 
	}
}
