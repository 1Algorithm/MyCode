package week1;
import java.util.Scanner;
public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float totalMoney;    //��Ǯ��
		int oneDnumbers,twoDnumbers,fiftyCnumbers,twentyCnumbers;  
		int tenCnumbers,fiveCnumbers;
		float leftMoney;    //ÿ�μ����ʣ�µ�Ǯ��
		
		System.out.print("���еĽ��Ϊ��");
		Scanner scan = new Scanner(System.in);
		totalMoney = scan.nextFloat();
		
		twoDnumbers = (int)(totalMoney/2);
		leftMoney = totalMoney-2*twoDnumbers;
		oneDnumbers = (int)(leftMoney/1);
		leftMoney = leftMoney-1*oneDnumbers;
		fiftyCnumbers = (int)(leftMoney/0.5);
		leftMoney = (float) (leftMoney-0.5*fiftyCnumbers);
		twentyCnumbers = (int)(leftMoney/0.2);
		leftMoney = (float) (leftMoney-0.2*twentyCnumbers);
		tenCnumbers = (int)(leftMoney/0.1);
		leftMoney = (float) (leftMoney-0.1*tenCnumbers);
		fiveCnumbers = (int)(leftMoney/0.05);
		
		System.out.println("��Ҫ"+twoDnumbers+"������Ԫ��Ӳ��");
		System.out.println("��Ҫ"+oneDnumbers+"��һ��Ԫ��Ӳ��");
		System.out.println("��Ҫ"+fiftyCnumbers+"����ʮ���ֵ�Ӳ��");
		System.out.println("��Ҫ"+twentyCnumbers+"����ʮ���ֵ�Ӳ��");
		System.out.println("��Ҫ"+tenCnumbers+"��ʮ���ֵ�Ӳ��");
		System.out.println("��Ҫ"+fiftyCnumbers+"�������ֵ�Ӳ��");
	}

}
