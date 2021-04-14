package subjectEnrolmentSystem;

public class Subject {
	private String subjectID;
	private String subjectName;
	private int maxNum;
	
	
	public Subject() {
		super();
	}

	public Subject(String subjectID, String subjectName, int maxNum) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.maxNum = maxNum;
	}
	
	
	public int getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}

	public String getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	
	public String toString(){
		String msg;
		msg = "�γ̱��:"+subjectID+",";
		msg += "�γ�����:"+this.subjectName+",";
		msg += "�������:"+this.maxNum;
		return msg;
	}


}
