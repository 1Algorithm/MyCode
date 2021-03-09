package week2;

import java.util.Scanner;

public class DaffodilsNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		System.out.print("Give a positive integer n (3~7):");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		System.out.println("Out put the samples:");
		for(int number = (int) (Math.pow(10, n-1));number<(int)(Math.pow(10, n)-1);number++)
		{
			int sum=0,item1=number;
			while(item1!=0)
			{
				int item2 = item1%10;
				sum = sum+(int)(Math.pow(item2, n));
				item1=item1/10;
			}
			if(sum == number)
				System.out.println(number);
		}

	}
}
