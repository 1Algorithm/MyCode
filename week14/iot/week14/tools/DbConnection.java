package iot.week14.tools;

import java.sql.Connection;
import java.sql.DriverManager;

//�����װ�����ļ��� ���ӵĽ��� �����ͷ� ���ر�
public class DbConnection {
	private Connection con;
	//���ĵ������Ӷ���
	public DbConnection(){
		String className = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/wtu?useUnicode=true&characterEncoding=utf-8";
		String userName= "root";
		String password= "990428";
		try{
			Class.forName(className);
			con = DriverManager.getConnection(url,userName,password);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public Connection getcon(){
		return con;
	}
	
	public void close(){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}