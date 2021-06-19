package week16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Urlprogram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("https://www.wtu.edu.cn/");
		
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		String aLine = "";
		StringBuffer sb = new StringBuffer();
		
		while((aLine = br.readLine())!=null)
			sb.append(aLine+"\n");
		String info = sb.toString();
		
		String regex = "<title>(.*?)</title>";
		Pattern pattern = Pattern.compile(regex);
		Matcher mat = pattern.matcher(info);
		if(mat.find())
			System.out.println("web title:"+mat.group(1));
		
//		System.out.println(info);
		
		File file = new File("d:/html/wtu.html");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(info);
		
		fw.close();
		is.close();
		
		
	}

}
