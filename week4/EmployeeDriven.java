package test;

public class EmployeeDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("lily",1022,"����",4000);
		Employee emp2 = new Employee("james",1023,"����",5000);
		
		//emp1.setBaseSalary(100);
		
		float oldSalary = emp1.getBaseSalary();
		System.out.println("Ա��1����Ϊ:"+oldSalary);
		emp1.updateSalary();
		float newSalary = emp1.getBaseSalary();
		System.out.println("Ա��1�¹���Ϊ:"+newSalary);
		emp1.displayEmployee();
		//emp1.setName("�Ű�");

	}

}
