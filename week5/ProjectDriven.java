package test;

import java.util.Scanner;

public class ProjectDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入项目名称：");
		String projectName = scan.next();
		System.out.print("请输入项目预算：");
		float budget = scan.nextFloat();
		
		System.out.print("请输入员工1姓名：");
		String emp1Name = scan.next();
		System.out.print("请输入员工1部门：");
		String emp1Department = scan.next();
		System.out.print("请输入员工1底薪：");
		float emp1baseSalary = scan.nextFloat();
		
		
		System.out.print("请输入员工2姓名：");
		String emp2Name = scan.next();
		System.out.print("请输入员工2部门：");
		String emp2Department = scan.next();
		System.out.print("请输入员工2底薪：");
		float emp2baseSalary = scan.nextFloat();
		
		Employee emp1 = new Employee(emp1Name,emp1Department,emp1baseSalary);
		Employee emp2 = new Employee(emp2Name,emp2Department,emp2baseSalary);
		
		Project project = new Project(projectName,budget,emp1,emp2);

		
		String information = project.ToString();
		System.out.println("该工程细节信息为:"+"\n"+information);
		
		project.updateBudget();
		System.out.println("新的预算为："+project.getBudget());
		

	}

}
