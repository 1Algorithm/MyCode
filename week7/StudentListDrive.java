package week7;

public class StudentListDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList List = new StudentList(4);
		
		List.addStu(new STudent("1001","����"));
		List.addStu(new STudent("1002","����"));
		List.addStu(new STudent("1003","����"));
		List.addStu(new STudent("1004","����"));
		List.addStu(new STudent("1005","����"));
		List.addStu(new STudent("1005","����"));
		List.addStu(null);
		
		System.out.print(List.toString());
		List.removeStu(3);
		System.out.print(List.toString());
		List.removeStu(7);
		
		System.out.println(List.indexOf("1003"));
		System.out.println(List.indexOf("1013"));
		
		System.out.println(List.getStu(1).toString());
		
		System.out.println("��Ԫ�ظ���Ϊ:"+List.size());
		System.out.print(List.toString());
		
		
		
		

	}

}
