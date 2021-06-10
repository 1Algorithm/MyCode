package week15;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerplus {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
			int port = 7001;
			int clientNo = 1;
			ServerSocket serverSocket = new ServerSocket(port);
			try{
				while(true){
					Socket socket = serverSocket.accept();
					Singleserver singleServer = new Singleserver(socket,clientNo);
					Thread thread = new Thread(singleServer);
					thread.start();
					clientNo++;
				}
			}finally{
				serverSocket.close();
			}
	}

}
