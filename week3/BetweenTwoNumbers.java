package test;

import java.util.Scanner;

public class BetweenTwoNumbers {
	public static int firstNum, secondNum;

	public static void main(String[] args) {
		int choose = menu();
		while (choose != 1&&choose <6) {
			System.out.println("please enter the integer first and then execute the function");
			choose = menu();
		}
		while (choose != 6) {
			switch (choose) {
			case 1:
				inputIntegers();
				break;
			case 2:
				outputOddNumbers(firstNum, secondNum);
				break;
			case 3:
				SumofEvennumbers(firstNum, secondNum);
				break;
			case 4:
				Squaresbetween1to10();
				break;
			case 5:
				thesumofthesquaresofalltheoddnumbers(firstNum,secondNum);
				break;
			default:
				System.out.println("您输入无效，重新选择!");
				break;
			}
			choose = menu();
		}
		System.out.println("程序退出，欢迎再次使用!");
	}

	public static int menu() {
		int choice = 0;
		System.out.println("==================BETWEEN TWO NUMBERS==================");
		System.out.println("1.Input two integers");
		System.out.println("2.Output the odd numbers");
		System.out.println("3.Output the sum of all the even numbers between firstNum and secondNum");
		System.out.println("4.Output all the numbers and their squares between 1 and 10");
		System.out.println("5.Output the sum of the squares of all the odd numbers between firstNum and secondNum.");
		System.out.println("6.Exit");
		System.out.print("Please Enter Your Choice(1~6):");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static void inputIntegers() {
		System.out.print("Input Two Integers(firstNum must be less than secondNum):");
		Scanner scan = new Scanner(System.in);
		firstNum = scan.nextInt();
		secondNum = scan.nextInt();
		while(firstNum>secondNum)
		{
			System.out.println("Incorrect input!");
			System.out.print("Input Two New Integers(firstNum must be less than secondNum):");
			firstNum = scan.nextInt();
			secondNum = scan.nextInt();
		}
		System.out.println("Input success!");
	}

	public static void outputOddNumbers(int firstNum, int secondNum) {
		System.out.print("Out put OddNumbers:");
		for (int i = firstNum; i <= secondNum; i++) {
			if ((i % 2) != 0) {
				System.out.print(i + "   ");
			}
		}
		System.out.println();

	}

	public static void SumofEvennumbers(int firstNum, int secondNum) {
		double sum = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			if ((i % 2) == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The odd numbers between firstNum and secondNum is " + sum);
	}

	public static void Squaresbetween1to10() {
		System.out.println("Squares between 1to10:");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Num: "+i+"  Squares: "+i * i);
		}
		System.out.println();
	}

	public static void thesumofthesquaresofalltheoddnumbers(int firstNum, int secondNum) {
		double sum=0;
		for (int i = firstNum; i <= secondNum; i++) {
			if(i%2!=0)
			{
				sum=sum+i*i;
			}
		}
		System.out.println("The squares of all the odd numbers between firstNum and secondNum is: "+sum);
	}
}
