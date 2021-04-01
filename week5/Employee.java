package test;

public class Employee {
	private String department;
	private String name;
	private float baseSalary;
	public String getDepartment() {
		return department;
	}
	public Employee() {
		super();
	}
	public Employee(String name, String department, float baseSalary) {
		super();
		this.department = department;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	public void updateSalary(float baseSalary) {
		this.baseSalary = this.baseSalary*(1.035f);
	}
	public String toString()
	{
		return "name:"+this.name+"  department:"+this.department+"  baseSalary:"+this.baseSalary;
	}

}
