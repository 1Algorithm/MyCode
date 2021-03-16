package test;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int choose = menu();
		while(choose!=5){
			switch(choose){
			case 1:createAccount();break;
			case 2:dispose();break;
			case 3:withDraw();break;
			case 4:balance();break;
			default :System.out.println("您输入无效，重新选择!");break;
			}
			choose = menu();
		}
		System.out.println("程序退出，欢迎再次使用!");

	}
	//菜单的显示，返回用户的输入选择
	public static int menu(){
		int choice = 0;
		System.out.println("===========WTU BANK===========");
		System.out.println("1.Create Account");
		System.out.println("2.Dispose");
		System.out.println("3.WithDraw");
		System.out.println("4.Balance");
		System.out.println("5.Exit");
		System.out.print("Please Enter Your Choice(1~5):");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}
	public static void createAccount(){
		System.out.println("您选择开户");
	}
	public static void dispose(){
		System.out.println("您选择存款");
	}

	public static void withDraw(){
		System.out.println("您选择取款");
	}
	public static void balance(){
		System.out.println("您选择查询余额");
	}

	


}
