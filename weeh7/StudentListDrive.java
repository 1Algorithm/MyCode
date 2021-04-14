package week7;

public class StudentListDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList List = new StudentList(4);
		
		List.addStu(new STudent("1001","张三"));
		List.addStu(new STudent("1002","李四"));
		List.addStu(new STudent("1003","王五"));
		List.addStu(new STudent("1004","赵六"));
		List.addStu(new STudent("1005","孙七"));
		List.addStu(new STudent("1005","刘八"));
		List.addStu(null);
		
		System.out.print(List.toString());
		List.removeStu(3);
		System.out.print(List.toString());
		List.removeStu(7);
		
		System.out.println(List.indexOf("1003"));
		System.out.println(List.indexOf("1013"));
		
		System.out.println(List.getStu(1).toString());
		
		System.out.println("总元素个数为:"+List.size());
		System.out.print(List.toString());
		
		
		
		

	}

}
