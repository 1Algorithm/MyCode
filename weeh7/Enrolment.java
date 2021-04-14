package subjectEnrolmentSystem;

import week7.STudent;

public class Enrolment {
	private Subject sub;
	private Student[] list;
	private int count;
	
	public Enrolment(){
		count = 0;
	}

	public Enrolment(Subject sub, Student[] list, int count) {
		super();
		this.sub = sub;
		this.list = list;
		this.count = count;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.list = new Student[sub.getMaxNum()];
		this.sub = sub;
	}
	
	public void addSTu(Student stu){
		if(stu == null){
			System.out.println("未收到正确学生信息，无法录入");
			return ;
		}
		if(list.length<=count){
			return ;
		}
		list[count++] = stu;	
	}
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int indexOf(String id){
		int i =0;
		for(;i<count&&list[i]!=null;i++){
			if(list[i].getId().equals(id)){
				return i;
			}
		}
		return -1;
	}
	
	public boolean removeStu(String id){
		int index = this.indexOf(id);
		if(index == -1){
			return false;
		}
		list[index] = null;
		count--;
		if(count == 0){
			return true;
		}
		for(int i=index;i<count;i++){
			list[i] = list[i+1];
		}
		return true;
	}
	
	public String toString(){
		String info="";
		for(int i=0;i<count;i++){
			info = info + list[i].toString()+",所选课程"+this.sub.getSubjectName()+"\n";
		}
		return info;
	}

}
