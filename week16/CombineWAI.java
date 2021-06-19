package week16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CombineWAI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String webpath = "https://www.wtu.edu.cn/";
		URL url = new URL(webpath);
		
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		String aLine = "";
		StringBuffer sb = new StringBuffer();
		
		while((aLine = br.readLine())!=null)
			sb.append(aLine+"\n");
		String info = sb.toString();  //得到网页中的所有信息
		
		List<String> srcList = new ArrayList<String>();    //用来保存图片的列表
		
		String regex = "<(img)(.*?)(>|></img>|/>)";   //搜索图片
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher mat = pattern.matcher(info);
		boolean haspic = mat.find();
		while(haspic)
		{
			String group = mat.group(2);
			Pattern p = Pattern.compile("(src)=(\"|\')(.*?)(\"|\')",Pattern.CASE_INSENSITIVE);
			Matcher mat2 = p.matcher(group);
			if(mat2.find())
				srcList.add(mat2.group(3));   //把图片的地址存到列表里
			haspic = mat.find();
		}
		
		for(int i=0;i<srcList.size();i++)
		{
			String pic = srcList.get(i);
			//System.out.println(pic);
			String picpath = webpath+pic;   //还原图片默认地址
			//System.out.println(picpath);
			
			URL url2 = new URL(picpath);
			InputStream is2 = url2.openStream();
			OutputStream os = new FileOutputStream(new File("d:/img/"+String.valueOf(i)+".jpg"));
			byte[] buf = new byte[1024];
			int len;
			while((len = is2.read(buf))!=-1)
				os.write(buf,0,len);
			os.close();
			is2.close();
		}
		
		String regex2 = "<title>(.*?)</title>";
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher mat2 = pattern2.matcher(info);
		if(mat2.find())
			System.out.println("web title:"+mat2.group(1));
		
		File file = new File("d:/html/wtu.html");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(info);
		fw.close();
		is.close();
		System.out.println("All down");
	}

}
