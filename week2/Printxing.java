package week2;

import java.util.Scanner;

public class Printxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Enter a integer n:");
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int m=1;m<=n-i;m++)
				System.out.print(" ");    //��ӡ�ո�
			for(int j=1;j<=i;j++)
				System.out.print("* ");    //��ӡ����
			System.out.println();    //ÿ��ӡһ�к�ͻ���
		}

	}

}
