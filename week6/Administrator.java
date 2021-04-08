package week6;

public class Administrator extends Employee{
	private float bonus;

	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrator(String id, String name, String department, float baseSalary,float bonus) {
		super(id, name, department, baseSalary);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public void updateSalary(){
		super.setBaseSalary(super.getBaseSalary()+this.bonus);
	}
	
	public String toString(){
		String msg;
		msg = super.toString()+" bonus:"+this.bonus;
		return msg;
	}
	


}
