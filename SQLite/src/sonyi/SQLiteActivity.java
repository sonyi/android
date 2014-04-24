package sonyi;

import sonyi.db.DatabaseHelper;
import sonyi.sqlite.*;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SQLiteActivity extends Activity{
	private Button createButton;
	private Button updateDatabaseButton;
	private Button insertButton;
	private Button updateButton;
	private Button queryButton;
	private Button deleteButton;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		createButton = (Button)findViewById(R.id.firstButton);
		updateDatabaseButton = (Button)findViewById(R.id.secondButton);
		insertButton = (Button)findViewById(R.id.thirdButton);
		updateButton = (Button)findViewById(R.id.foutButton);
		queryButton = (Button)findViewById(R.id.fiveButton);
		deleteButton = (Button)findViewById(R.id.sixButton);
		
		createButton.setOnClickListener(new CreateListener());
		updateDatabaseButton.setOnClickListener(new UpdateListener());
		insertButton.setOnClickListener(new InsertListener());
		updateButton.setOnClickListener(new UpdateRecordListener());
		queryButton.setOnClickListener(new QueryListener());
		deleteButton.setOnClickListener(new DeleteListener());
		
		
	}
	
	class CreateListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			DatabaseHelper dbHelper = new DatabaseHelper(SQLiteActivity.this, "sonyiSQLite");
			dbHelper.getReadableDatabase();	
			
			System.out.println("Listener---------createListener");
		}	
	}
	
	class UpdateListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			DatabaseHelper dbHelper = new DatabaseHelper(SQLiteActivity.this, "sonyiSQLite",2);
			dbHelper.getReadableDatabase();
			System.out.println("Listener---------updateListener");
			
		}
		
	}
	
	class InsertListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			ContentValues values = new ContentValues();
			values.put("id", 1);
			values.put("name", "zhangsan");
			values.put("age", 12);
			
			DatabaseHelper dbHelper = new DatabaseHelper(SQLiteActivity.this, "sonyiSQLite");
			SQLiteDatabase db = dbHelper.getWritableDatabase();
			db.insert("user", null, values);
			System.out.println("Listener---------insertListener");
			
		}
		
	}
	
	class UpdateRecordListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			DatabaseHelper dbHelper = new DatabaseHelper(SQLiteActivity.this, "sonyiSQLite");
			SQLiteDatabase db = dbHelper.getWritableDatabase();
			ContentValues values = new ContentValues();
			values.put("name", "zhangsanfeng");
			db.update("user", values, "id=?", new String[]{"1"});
			System.out.println("Listener---------updateRecordListener");
		}
		
	}
	
	class QueryListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub		
			DatabaseHelper dbHelper = new DatabaseHelper(SQLiteActivity.this, "sonyiSQLite");
			SQLiteDatabase db = dbHelper.getReadableDatabase();
			Cursor cursor = db.query("user", new String[]{"id","name","age"}, "name=?", new String[]{"zhangsanfeng"},null, null, null);
			while(cursor.moveToNext()){
				int id = cursor.getInt(cursor.getColumnIndex("id"));
				String name = cursor.getString(cursor.getColumnIndex("name"));
				int age = cursor.getInt(cursor.getColumnIndex("age"));
				System.out.println("query----->" + id + "  " + name + "  " + age);
			}
			System.out.println("Listener---------queryListener");
		}
		
		
	}
	class DeleteListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			DatabaseHelper dbHelper = new DatabaseHelper(SQLiteActivity.this, "sonyiSQLite");
			SQLiteDatabase db = dbHelper.getWritableDatabase();
			db.delete("user", "name =?", new String[]{"zhangsanfeng"});
			System.out.println("listener--------->deleteListener");
		}
	}
}
