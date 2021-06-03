package iot.week14.ui;

import java.util.ArrayList;

import iot.week14.dao.StudentDao;
import iot.week14.vo.Student;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao dao = new StudentDao();
		Student stu = dao.get("1001");
		if(stu == null){
			System.out.println("Not Found");
		}
		else{
			System.out.println(stu.toString());
		}
		
		ArrayList<Student> list = dao.query("name", "����","n");
		if(list.size()==0){
			System.out.println("Not Found");
		}
		else
		{
			for(Student student:list){
				System.out.println(student.toString());
			}
		}
		
		System.out.println("------------------------");
		
		/*ArrayList<Student> list2 = dao.readStuFromKeyboard();
		int count = dao.insert(list2);
		if(count == 0){
			System.out.println("δ��������");
		}
		else
		{
			System.out.println("����"+count+"������");
		}*/
		
		/*int count = dao.delete("1006");
		if(count==0){
			System.out.println("Not Found");
		}else
		{
			System.out.println("ɾ��"+count+"������");
		}*/
		int i = dao.update();
		
		dao.displayAllInfo();
	}

}
