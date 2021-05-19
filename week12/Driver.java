package week12;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] argv){
		Dao dao = new Dao();
		ArrayList<Student> stuList = new ArrayList<Student>();
		ArrayList<Course> courseList = new ArrayList<Course>();
		
		//stuList = dao.inputStuInfo();              //ֱ�ӴӼ������봴������
		//courseList = dao.inputCourseInfo();
		
		/*for(Student s:stuList)
			System.out.println(s.toString());*/
		
		/*for(Course c:courseList)
			System.out.println(c.toString());*/
		
		stuList = dao.ReadStuFromXLS();            //��xls������ ��������
		courseList = dao.ReadCourseFromXLS();
		
		/*stuList = dao.ReadStuInfoFromFile();            //���ļ����� ��������
		courseList= dao.ReadCourseInfoFromFile();*/
		
		
		ArrayList<Student> NstuList = dao.processByStu(stuList,courseList);
		ArrayList<Result> ReList = dao.processByCourse(courseList);
		
		dao.writeStuToFile(NstuList);           //д���ļ���
		dao.writeResultToFile(ReList);
		
		dao.WriteStudentToXLS(NstuList);           //д�������
		dao.WriteResultToXLS(ReList);
		
		dao.display(NstuList, ReList);            //������ʾ
		
		
	}

}
