package week16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlImg {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String picpath = "https://www.wtu.edu.cn/images/20210303_2021cjkx2.jpg";
		URL url = new URL(picpath);
		
		InputStream is = url.openStream();
		
		OutputStream os = new FileOutputStream(new File("d:/img/1.jpg"));
		byte[] buf = new byte[1024];
		int len;
		while((len = is.read(buf))!=-1)
			os.write(buf,0,len);
		
		os.close();
		is.close();
	}

}
