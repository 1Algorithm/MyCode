package test;

public class Subject {
	private String subjectID;
	private String subjecName;
	
	public Subject() {
		super();
	}
	public Subject(String subjectID, String subjecName) {
		super();
		this.subjectID = subjectID;
		this.subjecName = subjecName;
	}
	
	public String getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}
	public String getSubjecName() {
		return subjecName;
	}
	public void setSubjecName(String subjecName) {
		this.subjecName = subjecName;
	}
	
	public String toString(){
		return "�γ̴��룺"+this.subjectID+"\t"+"�γ����ƣ�"+this.subjecName;
		//return "subjectID:"+this.subjectID+"   subjectName:"+this.subjecName;
	}

	

}
