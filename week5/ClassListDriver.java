package test;

import java.util.Scanner;

public class ClassListDriver {
	public static ClassList list = null;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose = menu();
		while (choose != 3) {
			switch (choose) {
			case 1:
				createList();
				break;
			case 2:
				printList();
				break;
			default:
				System.out.println("输入无效，请重新输入");
			}
		choose = menu();
	}System.out.println("欢迎下次使用");

	}

	public static int menu() {
		int choose = 0;
		System.out.println("1.Create Attendance List");
		System.out.println("2.Print Attendance List");
		System.out.println("3.Exit");
		System.out.print("Enter your choice:");
		choose = scan.nextInt();
		if (list != null && choose == 1) {
			char choice;
			System.out.print("已经存在一个课程，是否要将其覆盖?(y/n)");
			choice = scan.next().charAt(0);
			if (choice == 'n')
				return 3;
		}
		return choose;
	}

	public static void createList() {
		int semester, year;
		String subjectID, subjectName;
		Subject subj;
		Student s1, s2;
		String student1ID, student1Name;
		String student2ID, student2Name;
		System.out.print("请输入学年：");
		year = scan.nextInt();
		System.out.print("请输入学期：");
		semester = scan.nextInt();
		scan.nextLine();
		System.out.print("请输入课程代码：");
		subjectID = scan.nextLine();
		System.out.print("请输入课程名称：");
		subjectName = scan.nextLine();
		subj = new Subject(subjectID, subjectName);
		System.out.print("请输入学生1学号：");
		student1ID = scan.nextLine();
		System.out.print("请输入学生1姓名：");
		student1Name = scan.nextLine();
		s1 = new Student(student1ID, student1Name);
		System.out.print("请输入学生2学号：");
		student2ID = scan.nextLine();
		System.out.print("请输入学生2姓名：");
		student2Name = scan.nextLine();
		s2 = new Student(student2ID, student2Name);
		list = new ClassList(semester, year, subj, s1, s2);
	}

	public static void printList() {
		if (list == null) {
			System.out.println("请先创建课程");
			return;
		}
		System.out.println(list.toString());
	}

}
