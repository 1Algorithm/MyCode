package week11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AboutRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		//1.装水箱
		//File f = new File("d:\\JAVA\\info.txt");
		File f = new File("./info.txt");
		//2.装水管
		FileReader fr = new FileReader(f);
		//3.装水龙头
		BufferedReader bf = new BufferedReader(fr);
		//4.打开水龙头
		String aLine = "";
		while((aLine = bf.readLine())!=null){
			System.out.println(aLine);
		}
		bf.close();
		fr.close();
		}catch(Exception e){
			e.printStackTrace();
		}


	}

}
