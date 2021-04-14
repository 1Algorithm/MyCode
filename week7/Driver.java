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
				System.out.println("�γ��Ѿ��������Ƿ�Ҫ����ԭ���γ̣�y/n��:");
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
		System.out.println("��ӭ�´�ʹ�ã�");

	}
	public static int menu(){
		System.out.println("========ѧ��ѡ��ϵͳ========");
		System.out.println("1.�����γ�");
		System.out.println("2.ѡ��");
		System.out.println("3.��ѡ");
		System.out.println("4.��ӡ����");
		System.out.println("5.�˳�");
		System.out.print("���������ѡ��(1-5):");
		int choice = scan.nextInt();
		
		while(choice > 5){
			System.out.println("���������������������");
			choice = scan.nextInt();
		}
		
		while(choice!=1&&enrol.getSub() == null){
			System.out.print("���ȴ����γ�(����1)!");
			choice = scan.nextInt();
		}
		return choice;
	}
	
	public static void createSubject(){
		String subjectID;
		String subjectName;
		int maxNum;
		System.out.print("����γ̱��:");
		subjectID = scan.next();
		System.out.print("����γ�����:");
		subjectName = scan.next();
		System.out.print("�����������:");
		maxNum = scan.nextInt();
		sub = new Subject(subjectID,subjectName,maxNum);
		enrol.setSub(sub);
		System.out.println("�����γ̳ɹ���");
		System.out.println("�γ���ϢΪ��");
		System.out.println(enrol.getSub().toString());
		System.out.println();
	}
	
	public static void chooseSubject(){
		String studentID;
		String studentName;
		if(enrol.getCount()>=enrol.getSub().getMaxNum()) {
			System.out.println("�ÿγ��Ѵﵽ����������޷��ٱ�ѡ");
			return;
		}
		System.out.print("������Ҫѡ�ε�ѧ��ѧ��:");
		studentID = scan.next();
		System.out.print("������Ҫѡ�ε�ѧ������:");
		studentName = scan.next();
		Student stu = new Student(studentID,studentName);
		enrol.addSTu(stu);
		System.out.println("ѡ�γɹ���");
		System.out.println("Ŀǰѡ��������£�");
		System.out.println("ѡ��������"+enrol.getCount());
		System.out.println(enrol.getSub().toString());
		System.out.println(enrol.toString());
	}
	
	public static void leaveSubject(){
		String id;
		System.out.print("Ҫ�˿ε�ѧ��ѧ��Ϊ:");
		id = scan.next();
		if(enrol.removeStu(id)==false){
			System.out.println("ѧ��Ϊ"+id+"��ѧ����û��ѡ�Σ�");
			return;
		}
		else{
			System.out.println("ѧ��Ϊ"+id+"��ѧ�����˿γɹ���");
		}
		System.out.println("�µ�ѡ����Ϣ���£�");
		System.out.println("ѡ��������"+enrol.getCount());
		System.out.println(enrol.getSub().toString());
		System.out.println(enrol.toString());
	}
	
	public static void printInfo(){
		System.out.println(enrol.toString());
	}

}
