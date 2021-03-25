package test;

public class EmployeeDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("lily",1022,"人事",4000);
		Employee emp2 = new Employee("james",1023,"销售",5000);
		
		//emp1.setBaseSalary(100);
		
		float oldSalary = emp1.getBaseSalary();
		System.out.println("员工1工资为:"+oldSalary);
		emp1.updateSalary();
		float newSalary = emp1.getBaseSalary();
		System.out.println("员工1新工资为:"+newSalary);
		emp1.displayEmployee();
		//emp1.setName("张百");

	}

}
