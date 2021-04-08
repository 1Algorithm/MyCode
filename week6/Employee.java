package week6;

public class Employee {
	private String id;
	private String department;
	private String name;
	private float baseSalary;

	public Employee() {
		super();
	}
	public Employee(String id,String name, String department, float baseSalary) {
		super();
		this.id = id;
		this.department = department;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
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
	
	public void updateSalary() {
		//this.baseSalary = this.baseSalary*(1.035f);
		this.setBaseSalary(this.getBaseSalary()*1.0725f);
	}
	
	public String toString()
	{
		String msg;
		msg = "id:"+this.id+ " name:"+this.name+"  department:"+this.department+"  baseSalary:"+this.baseSalary;
		return msg;
	}

}
