package subjectEnrolmentSystem;

import java.util.Scanner;

public class Driver {
	public static Enrolment enrol = new Enrolment();
	public static Subject sub = null;
	public static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = menu();
		while(choice!=5){
			if(choice==1&&enrol.getSub()!=null){
				System.out.println("课程已经创建，是否要覆盖原来课程（y/n）:");
				String decision = scan.next();
				if(decision.equals("n")){
					choice = menu();
				}
			}
			switch(choice){
			case 1:createSubject();break;
			case 2:chooseSubject();break;
			case 3:leaveSubject();break;
			case 4:printInfo();break;
				default:break;
			}
			choice = menu();
		}
		System.out.println("欢迎下次使用！");

	}
	public static int menu(){
		System.out.println("========学生选课系统========");
		System.out.println("1.创建课程");
		System.out.println("2.选课");
		System.out.println("3.退选");
		System.out.println("4.打印名单");
		System.out.println("5.退出");
		System.out.print("请输入你的选择(1-5):");
		int choice = scan.nextInt();
		
		while(choice > 5){
			System.out.println("你的输入有误，请重新输入");
			choice = scan.nextInt();
		}
		
		while(choice!=1&&enrol.getSub() == null){
			System.out.print("请先创建课程(输入1)!");
			choice = scan.nextInt();
		}
		return choice;
	}
	
	public static void createSubject(){
		String subjectID;
		String subjectName;
		int maxNum;
		System.out.print("输入课程编号:");
		subjectID = scan.next();
		System.out.print("输入课程名称:");
		subjectName = scan.next();
		System.out.print("输入最大人数:");
		maxNum = scan.nextInt();
		sub = new Subject(subjectID,subjectName,maxNum);
		enrol.setSub(sub);
		System.out.println("创建课程成功！");
		System.out.println("课程信息为：");
		System.out.println(enrol.getSub().toString());
		System.out.println();
	}
	
	public static void chooseSubject(){
		String studentID;
		String studentName;
		if(enrol.getCount()>=enrol.getSub().getMaxNum()) {
			System.out.println("该课程已达到最大人数，无法再被选");
			return;
		}
		System.out.print("请输入要选课的学生学号:");
		studentID = scan.next();
		System.out.print("请输入要选课的学生姓名:");
		studentName = scan.next();
		Student stu = new Student(studentID,studentName);
		enrol.addSTu(stu);
		System.out.println("选课成功！");
		System.out.println("目前选课情况如下：");
		System.out.println("选课人数："+enrol.getCount());
		System.out.println(enrol.getSub().toString());
		System.out.println(enrol.toString());
	}
	
	public static void leaveSubject(){
		String id;
		System.out.print("要退课的学生学号为:");
		id = scan.next();
		if(enrol.removeStu(id)==false){
			System.out.println("学号为"+id+"的学生并没有选课！");
			return;
		}
		else{
			System.out.println("学号为"+id+"的学生并退课成功！");
		}
		System.out.println("新的选课信息如下：");
		System.out.println("选课人数："+enrol.getCount());
		System.out.println(enrol.getSub().toString());
		System.out.println(enrol.toString());
	}
	
	public static void printInfo(){
		System.out.println(enrol.toString());
	}

}
