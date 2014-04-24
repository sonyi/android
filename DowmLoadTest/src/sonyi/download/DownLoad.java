package sonyi.download;

import sonyi.dowmload.*;
import sonyi.utils.HttpDownLoader;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DownLoad extends Activity{
	private Button downloadTextButton;
	private Button downloadMP3Button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		downloadTextButton = (Button)findViewById(R.id.firstButton);
		downloadMP3Button = (Button)findViewById(R.id.secondButton);
		downloadTextButton.setOnClickListener(new DownloadTextListener());
		downloadMP3Button.setOnClickListener(new DownloadMP3Listener());
		
	}
	
	class DownloadTextListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			HttpDownLoader httpDownloader = new HttpDownLoader();
			String lrc = httpDownloader.download("http://music.baidu.com/data2/lrc/107201561/%E6%97%B6%E9%97%B4%E9%83%BD%E5%8E%BB%E5%93%AA%E5%84%BF%E4%BA%86.lrc");
			System.out.println(lrc);
			System.out.println("----------TextListener-----------");
			
		}
		
	}
	
	class DownloadMP3Listener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			HttpDownLoader httpDownloader = new HttpDownLoader();
			int result = httpDownloader.downFile("http://music.baidu.com/data2/lrc/107201561/%E6%97%B6%E9%97%B4%E9%83%BD%E5%8E%BB%E5%93%AA%E5%84%BF%E4%BA%86.lrc", "voa/", "a1.mp3");
			System.out.println(result);
			System.out.println("----------MP3Listener-----------");
		}
		
	}
	
}
