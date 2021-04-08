package week6;

public class SalesPerson extends Employee {
	private float yearlySales;

	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesPerson(String id, String name, String department, float baseSalary,float yearlySales) {
		super(id, name, department, baseSalary);
		this.yearlySales = yearlySales;
		// TODO Auto-generated constructor stub
	}
	
	public float getYearlySales() {
		return yearlySales;
	}

	public void setYearlySales(float yearlySales) {	
		this.yearlySales = yearlySales;
	}
	

	public void updateSalary(){
		super.setBaseSalary(super.getBaseSalary()+(0.1f*this.yearlySales));
	}
	
	public String toString(){
		String msg;
		msg = super.toString()+" yearlySales:"+this.yearlySales;
		return msg;
	}
	

}
