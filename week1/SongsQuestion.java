package week1;
import java.util.Scanner;
public class SongsQuestion {
	public static void main(String[] args) {
		String songName;
		float songPrice;
		float MANAGERCOMMISSIONRATES = 0.12f, INTERNETCOMMISSIONRATES = 0.03f;
		int numbers;
		float totalRevenue, managerRevenue, internetRevenue;
	    
		Scanner scan = new Scanner(System.in);
		System.out.print("��������������֣�");
		songName = scan.next();
		System.out.print("����������ļ۸�");
		songPrice = scan.nextFloat();
		System.out.print("��������������ص�������");
		numbers = scan.nextInt();
		
		totalRevenue = songPrice * numbers;
		managerRevenue = totalRevenue * MANAGERCOMMISSIONRATES;
		internetRevenue = totalRevenue * INTERNETCOMMISSIONRATES;
		
		System.out.println("������:" + totalRevenue);
		System.out.println("��������:" + managerRevenue);
		System.out.println("��վ����:" + internetRevenue);

	}

}
