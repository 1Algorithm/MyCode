package test2;

public class StudentDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("张三","17671012782","1904240626");
		Student stu2 = new Student("张四","17671012783","1904240624");
		stu1.displayStudent();
		stu2.displayStudent();
		stu1.setName("王五");
		System.out.println(stu1.getName());
		System.out.println(stu1.getPhoneNumbers());
		System.out.println(stu1.getStudentNumbers());
		stu1.displayStudent();

	}

}
