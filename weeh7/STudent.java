package week7;

public class STudent {
	private String id;
	private String name;
	
	public STudent(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		String info;
		info = "Student:"+"\t"+this.id+"\t"+this.name;
		return info;
	}
	

}
