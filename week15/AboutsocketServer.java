package week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class AboutsocketServer {
	public static void main(String[] args)throws IOException{
		int port = 7000;
		ServerSocket serverSocket = new ServerSocket(port);
		Socket socket = serverSocket.accept();
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
		do{
			/*double length = Double.parseDouble(br.readLine());
			System.out.println("服务器端收到的边长数据为："+length);
			double result = length*length;*/
			//pw.println(result);
			String get = br.readLine();
			System.out.println(get);
			String write = scan.next();
			pw.println(write);
			
			pw.flush();
		}while(br.readLine().equalsIgnoreCase("y"));
		System.out.println("服务器程序结束！");
		socket.close();
		serverSocket.close();
	}

}
