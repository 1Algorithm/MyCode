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
				System.out.print(" ");    //打印空格
			for(int j=1;j<=i;j++)
				System.out.print("* ");    //打印星星
			System.out.println();    //每打印一行后就换行
		}

	}

}
