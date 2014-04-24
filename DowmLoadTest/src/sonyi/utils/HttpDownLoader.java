package sonyi.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpDownLoader {
	private URL url = null;
	
	//����URL�����ļ���ǰ��������ļ����е��������ı��������ķ���ֵ�����ļ����е�����
	/**
	 * 1.����һ��URL����
	 * 2.ͨ��URL���󣬴���һ��HttpURLConnection����
	 * 3.�õ�InputStream
	 * 4.��InputStream���ж�ȡ����
	 * 
	 * @param urlStr
	 * @return
	 */
	
	public String download(String urlStr){
		StringBuffer sb = new StringBuffer();
		String line = null;
		BufferedReader buffer = null;
		try{
			//����һ��URL����
			url = new URL(urlStr);
			//����һ��Http����
			HttpsURLConnection urlConn = (HttpsURLConnection) url.openConnection();
			//ʹ��IO����ȡ����
			buffer = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
			while((line = buffer.readLine()) != null){
				sb.append(line);
			}
			System.out.println("�ı��ĵ��洢ok");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("�ı��ĵ��洢����");
		}
		finally{
			try{
				buffer.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	//�ú�������ֵΪ���͡�-1�����������ļ�����0�����������ļ��ɹ���1�������ļ��Ѿ�����
	
	public int downFile(String urlStr, String path, String fileName){
		InputStream inputStream = null;
		try{
			FileUtils fileUtils = new FileUtils();
			if(fileUtils.isFileExist(path +fileName)){
				return 1;
			}
			else{
				inputStream = getInputStreamFromUrl(urlStr);
				File resultFile = fileUtils.write2SDFromInput(inputStream, path, fileName);
				if(resultFile == null){
					return -1;
				}
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
			return -2;
		}
		finally{
			try{
				inputStream.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	//����URL�õ�������
	public InputStream getInputStreamFromUrl(String urlStr) throws MalformedURLException,IOException{
		url = new URL(urlStr);
		HttpURLConnection urlConn = (HttpsURLConnection) url.openConnection();
		InputStream inputStream = urlConn.getInputStream();
		return inputStream;
	}

}
