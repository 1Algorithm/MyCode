package test;

public class Student {
	private String studentID;
	private String studentName;
	public Student(String studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}
	public Student() {
		super();
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return this.studentID+"\t"+this.studentName;
		//return "StudentID:"+this.studentID+"  studentName:"+this.studentName;
	}
	

}
