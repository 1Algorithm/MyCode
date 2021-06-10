package week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Singleserver implements Runnable{
	private Socket socket;
	private int clientNo;
	
	public Singleserver(Socket socket, int clientNo) {
			super();
			this.socket = socket;
			this.clientNo = clientNo;
		}
	public void run()
	{
		try{
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
			do{
				double length = Double.parseDouble(br.readLine());
				System.out.println("���������յ��ı߳�����Ϊ��"+length);
				double result = length*length;
				pw.println(result);
				pw.flush();
			}while(br.readLine().equalsIgnoreCase("y"));
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			System.out.println("��ͻ���"+clientNo+"ͨ�Ž���");
			try{
				socket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
