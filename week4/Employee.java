package test;

public class Employee {
	private String name;
	private int employeeId;
	private String department;
	private float baseSalary;
	
	public Employee(){
		
	}
	
	public Employee(String name,int employeeId,String department,float baseSalary){
		this.name= name;
		this.employeeId = employeeId;
		this.department = department;
		this.baseSalary = baseSalary;
		
	}
	
	public float getBaseSalary(){
		return this.baseSalary;
	}
	
	public void setBaseSalary(float baseSalary){
		 this.baseSalary = baseSalary;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void updateSalary(){
		this.baseSalary = this.baseSalary * 1.035f;
		
	}
	public void displayEmployee(){
		String info = "";
		info = "id:"+this.employeeId+"   name:"+this.name+"   department:"+this.department+"   baseSalary:"+this.baseSalary;
		System.out.println(info);
	}

}
