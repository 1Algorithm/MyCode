package iot.week14.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import iot.week14.tools.DbConnection;
import iot.week14.vo.Student;

public class StudentDao {
	//���ؼ��ֽ��в�ѯ
	static Scanner scan = new Scanner(System.in);
	public static Student get(String id){
		Student stu = null;
		DbConnection db = new DbConnection();
		Connection con = db.getcon();
		String sql = "select * from t_student where id = ?";
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				stu = new Student(rs.getString("id"),rs.getString("name"),
						rs.getString("birth"),rs.getString("gender"),
						rs.getFloat("score"));
			}
		}catch(Exception e){
			e.printStackTrace();
			db.close();
		}
		return stu;
	}
	
	//�õ�����ѧ������Ϣ
	public void displayAllInfo(){
		DbConnection db = new DbConnection();
		Connection con = db.getcon();
		String sql = "select * from t_student";
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				Student stu = new Student(rs.getString("id"),rs.getString("name"),
						rs.getString("birth"),rs.getString("gender"),
						rs.getFloat("score"));
				System.out.println(stu.toString());
				
			}
		}catch(Exception e){
			e.printStackTrace();
			db.close();
		}
	}
	
	
	//����ָ�����ֶν��в�ѯ ��Ž���ڼ�����
	public ArrayList<Student> query(String fieldName,String value,String flux){
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		Student stu = null;
		DbConnection db = new DbConnection();
		Connection con = db.getcon();		
		String sql = "";
		String condition = "";
		if(flux.equals("y")){
			sql =  "select * from t_student where " + fieldName +" like ?";
			condition = "%"+value+"%";
		}
		else{
			sql = "select * from t_student where " + fieldName +"=?";
			condition = value;
		}
		
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, condition);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				stu = new Student(rs.getString("id"),rs.getString("name"),
						rs.getString("birth"),rs.getString("gender"),
						rs.getFloat("score"));
				stuList.add(stu);
				
			}
		}catch(Exception e){
			e.printStackTrace();
			db.close();
		}
			
		return stuList;
	}
	//�������������ɸ�ѧ�����ݣ�����ڼ�����
	public ArrayList<Student> readStuFromKeyboard(){
		ArrayList<Student> stuList = new ArrayList<Student>();
		int count;
		String info;
		System.out.println("����ѧ����Ϣ-----��ʽ��'1001,С��,2001-05-18,��,89.2'�����ԡ�end��Ϊ������ʶ:");
		info = scan.nextLine();
		while(!info.equals("end")){
			String s[] = info.split(",|��");
			if(get(s[0]) != null){
				System.out.println("���ݿ����Ѿ����ڸ�ѧ�ţ����������룡");
			}
			else{
			Student stu = new Student(s[0],s[1],s[2],s[3],Float.parseFloat(s[4]));
			stuList.add(stu);
			}
			info = scan.nextLine();
		}
		
		return stuList;
	}
	//��ѧ��������뵽���ݿ��� ���سɹ������¼������
	public int insert(ArrayList<Student> list){
		int iRet = 0;
		DbConnection db = new DbConnection();
		Connection con = db.getcon();
		String sql = "insert into t_student(id,name,birth,gender,score)"
				+ "values(?,?,?,?,?)";
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			for(int i=0;i<list.size();i++){
				Student stu = list.get(i);
				pst.setString(1, stu.getId());
				pst.setString(2, stu.getName());
				pst.setString(3, stu.getBirth());
				pst.setString(4, stu.getGender());
				pst.setFloat(5,stu.getScore());
				iRet += pst.executeUpdate();
			}	

		}catch(Exception e){
			e.printStackTrace();
			db.close();
		}
		return iRet;
	}
	//ɾ��ָ���ؼ��ֵļ�¼ ���سɹ�ɾ����¼������
	public int delete(String id){
		int iRet = 0;
		
		DbConnection db = new DbConnection();
		Connection con = db.getcon();
		String sql = "delete from t_student where id = ?";
		try{
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			iRet = pst.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
			db.close();
		}
		return iRet;
	}
	
	public Student updateFromKeyboard(){
		System.out.print("������Ҫ�޸�ѧ����ѧ�ţ�");
		String id = scan.nextLine();
		Student stu  = get(id);
		if(stu==null){
			System.out.println("���ݿ����޸�ѧ����Ӧ��ѧ��!");
		}
		else{
			System.out.println("ԭidΪ��"+stu.getId()+",�µ�id��Ϊ:(���޸�ֱ�Ӱ��س�)");
			String nid = scan.nextLine();
			stu.setId(nid);
			System.out.println("ԭ����Ϊ��"+stu.getName()+",�µ�����Ϊ:(���޸�ֱ�Ӱ��س�)");
			String nName = scan.nextLine();
			stu.setName(nName);
			System.out.println("ԭ����Ϊ��"+stu.getBirth()+",�µ�����Ϊ:(���޸�ֱ�Ӱ��س�)");
			String nbirth = scan.nextLine();
			stu.setBirth(nbirth);
			System.out.println("ԭ�Ա�Ϊ��"+stu.getGender()+",�µ��Ա�Ϊ:(���޸�ֱ�Ӱ��س�)");
			String ngender = scan.nextLine();
			stu.setGender(ngender);
			System.out.println("ԭ����Ϊ��"+stu.getScore()+",�µķ���Ϊ:(���޸�����-1)");
			Float nscore = scan.nextFloat();
			stu.setScore(nscore);
		}
		return stu;
	}
	
	public int update(){
		int iRet = 0;
		Student stu = updateFromKeyboard();
		System.out.println(stu.toString());
		DbConnection db = new DbConnection();
		Connection con = db.getcon();
		StringBuffer sql = new StringBuffer("update t_student set ");
		
		if(!stu.getId().equals("")) {
			sql.append("id = '"+stu.getId()+"'");
		}
		if(!stu.getName().equals("")) {
			sql.append("name = '"+stu.getName()+"'");
		}
		if(!stu.getBirth().equals("")) {
			sql.append("bitrh = '"+stu.getBirth()+"'");
		}
		if(!stu.getGender().equals("")) {
			sql.append("gender = '"+stu.getGender()+"'");
		}
		if(!(stu.getScore()==-1f)) {
			sql.append("score = '"+stu.getScore()+"'");
		}
		
		String Nsql = sql.toString();
		
		try {
			PreparedStatement pst = con.prepareStatement(Nsql);
			iRet = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return iRet;
	}
	
}
