package sonyi.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import android.os.Environment;

public class FileUtils {
	private String SDPATH;
	
	public String getSDPATH(){
		return SDPATH;
	}
	//得到当前外部存储设备的目录
	public FileUtils() {
		SDPATH = Environment.getExternalStorageDirectory() + "/";
	}
	
	//在SD卡上创建文件
	public File creatSDFile(String fileName) throws IOException{
		File file = new File(SDPATH + fileName);
		file.createNewFile();
		return file;
	}
	
	//在SD卡上创建目录
	public File creatSDDir(String dirName){
		File dir = new File(SDPATH + dirName);
		dir.mkdir();
		return dir;
	}

	//判断SD卡上的文件夹是否存在
	
	public boolean isFileExist(String fileName){
		File file = new File(SDPATH + fileName);
		return file.exists();
	}
	
	//将一个InputStreanm里面的数据写入到SD卡中
	
	public File write2SDFromInput(InputStream input, String path, String fileName){
		File file = null;
		OutputStream output = null;
		try{
			creatSDDir(path);
			file = creatSDFile(path + fileName);
			output = new FileOutputStream(file);
			byte buffer[] = new byte[4 * 1024];
			while((input.read(buffer)) != -1){
				output.write(buffer);
			}
			//清空缓存
			output.flush();
			System.out.println("存储数据ok");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("存储数据出错");
		}
		finally{
			try{
				output.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return file;
		
	}
}
