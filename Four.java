import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		float length,width;
		String color;
		int frameType,crownNumbers=0,crownOrnot ;
		float framePrice;
		float perimeter,area;
		float costs;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��Ƭ�ĳ���Ϊ(inch):");
		length = scan.nextFloat();
		System.out.print("��Ƭ�Ŀ��Ϊ(inch):");
		width = scan.nextFloat();
		System.out.print("���������ͨ��(1)���Ǿ�����(2):");
		frameType = scan.nextInt();
		if(frameType==1)
			framePrice = 0.15f;
		else
			framePrice = 0.25f;
		System.out.print("�����Ϳ��ʲô��ɫ:");
		color = scan.next();
		System.out.print("�Ƿ�ѡ�����ʹ�װ��(1--YES;2--NO):");
		crownOrnot = scan.nextInt();
		if(crownOrnot == 1)
		{
			System.out.print("Ƕ�뼸���ʹڣ�");
			crownNumbers = scan.nextInt();
		}
		else 
		{
			crownNumbers=0;
		}
		
		perimeter = length*2+width*2;
		area = length*width;
		costs = (float) (0.1*perimeter+framePrice*perimeter+(0.02+0.07)*area+0.35*crownNumbers);
		
		System.out.print("�ܹ��Ľ��Ϊ:"+costs);
		
	}

}
