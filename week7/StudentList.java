package week7;

public class StudentList {
	private STudent[] list;
	private int count;
	
	public  StudentList(){
		
	}
	
	public  StudentList(int maxsize){
		list = new STudent[maxsize];
		count = 0;
	}
	
	public boolean addStu(STudent stu){
		if(stu == null){
			System.out.println("增加的学生信息为空，无法增加");
			return false;
		}
		if(list.length<=count){
			System.out.println("该学生集合已满，无法增加");
			return false;
		}
		list[count++] = stu;
		//System.out.println("添加成功");
		return true;		
	}
	
	public boolean removeStu(int index){
		if(index >= count||index <=-1){
			System.out.println("无法找到对应学生，无法删除");
			return false;
		}
		list[index] = null;
		count--;
		if(count == 0){
			System.out.println("删除成功");
			return true;
		}
		for(int i=index;i<count;i++){
			list[i] = list[i+1];
		}
		System.out.println("删除成功");
		return true;
	}
	
	public int indexOf(String id){
		int i =0;
		for(;i<count&&list[i]!=null;i++){
			if(list[i].getId().equals(id)){
				System.out.print("找到该学号对应的学生,下标为:");
				return i;
			}

		}
		System.out.print("没找到该学号对应的学生");
		return -1;
	}
	
	public STudent getStu(int index){
		if(index<=-1||index>=count){
			System.out.println("该下标没有对应的学生");
			return null;
		}
		System.out.print("找到该下标对应的学生,信息为:");
		return list[index];
	}
	
	public int size(){
		return count;
	}
	
	public String toString(){
		String info="";
		for(int i=0;i<count&&list[i]!=null;i++){
			info = info + list[i].toString()+"\n";
		}
		return info;
	}
	

}
