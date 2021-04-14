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
			System.out.println("���ӵ�ѧ����ϢΪ�գ��޷�����");
			return false;
		}
		if(list.length<=count){
			System.out.println("��ѧ�������������޷�����");
			return false;
		}
		list[count++] = stu;
		//System.out.println("��ӳɹ�");
		return true;		
	}
	
	public boolean removeStu(int index){
		if(index >= count||index <=-1){
			System.out.println("�޷��ҵ���Ӧѧ�����޷�ɾ��");
			return false;
		}
		list[index] = null;
		count--;
		if(count == 0){
			System.out.println("ɾ���ɹ�");
			return true;
		}
		for(int i=index;i<count;i++){
			list[i] = list[i+1];
		}
		System.out.println("ɾ���ɹ�");
		return true;
	}
	
	public int indexOf(String id){
		int i =0;
		for(;i<count&&list[i]!=null;i++){
			if(list[i].getId().equals(id)){
				System.out.print("�ҵ���ѧ�Ŷ�Ӧ��ѧ��,�±�Ϊ:");
				return i;
			}

		}
		System.out.print("û�ҵ���ѧ�Ŷ�Ӧ��ѧ��");
		return -1;
	}
	
	public STudent getStu(int index){
		if(index<=-1||index>=count){
			System.out.println("���±�û�ж�Ӧ��ѧ��");
			return null;
		}
		System.out.print("�ҵ����±��Ӧ��ѧ��,��ϢΪ:");
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
