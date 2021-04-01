package test;

public class Project {
	private String projectName;
	private float budget;
	private Employee emp1;
	private Employee emp2;
	
	public Project(String projectName, float budget, Employee emp1, Employee emp2) {
		super();
		this.projectName = projectName;
		this.budget = budget;
		this.emp1 = emp1;
		this.emp2 = emp2;
	}
	public Project() {
		super();
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public float getBudget() {
		return budget;
	}
	public void setBudget(float budget) {
		this.budget = budget;
	}
	public void updateBudget(){
		this.budget = this.budget*(1.2f);
		//this.setBudget(this.getBudget()*(1.2f));
	}
	public String ToString(){
		String info;
		info = "projectName:"+this.getProjectName()+"\n";
	    info +=	"budget:"+this.getBudget()+"\n" ;
	    info += "emp1: \n"+this.emp1.toString()+"\n";
	    info += "emp2: \n"+this.emp2.toString()+"\n";
		return info;
	}
	
	

}
