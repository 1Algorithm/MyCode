package test;

import java.util.Scanner;

public class ProjectDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("��������Ŀ���ƣ�");
		String projectName = scan.next();
		System.out.print("��������ĿԤ�㣺");
		float budget = scan.nextFloat();
		
		System.out.print("������Ա��1������");
		String emp1Name = scan.next();
		System.out.print("������Ա��1���ţ�");
		String emp1Department = scan.next();
		System.out.print("������Ա��1��н��");
		float emp1baseSalary = scan.nextFloat();
		
		
		System.out.print("������Ա��2������");
		String emp2Name = scan.next();
		System.out.print("������Ա��2���ţ�");
		String emp2Department = scan.next();
		System.out.print("������Ա��2��н��");
		float emp2baseSalary = scan.nextFloat();
		
		Employee emp1 = new Employee(emp1Name,emp1Department,emp1baseSalary);
		Employee emp2 = new Employee(emp2Name,emp2Department,emp2baseSalary);
		
		Project project = new Project(projectName,budget,emp1,emp2);

		
		String information = project.ToString();
		System.out.println("�ù���ϸ����ϢΪ:"+"\n"+information);
		
		project.updateBudget();
		System.out.println("�µ�Ԥ��Ϊ��"+project.getBudget());
		

	}

}
