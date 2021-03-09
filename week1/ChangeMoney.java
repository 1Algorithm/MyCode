package week1;
import java.util.Scanner;
public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float totalMoney;    //总钱数
		int oneDnumbers,twoDnumbers,fiftyCnumbers,twentyCnumbers;  
		int tenCnumbers,fiveCnumbers;
		float leftMoney;    //每次计算后剩下的钱数
		
		System.out.print("现有的金额为：");
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
		
		System.out.println("需要"+twoDnumbers+"个两美元的硬币");
		System.out.println("需要"+oneDnumbers+"个一美元的硬币");
		System.out.println("需要"+fiftyCnumbers+"个五十美分的硬币");
		System.out.println("需要"+twentyCnumbers+"个二十美分的硬币");
		System.out.println("需要"+tenCnumbers+"个十美分的硬币");
		System.out.println("需要"+fiftyCnumbers+"个五美分的硬币");
	}

}
