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
			default :System.out.println("��������Ч������ѡ��!");break;
			}
			choose = menu();
		}
		System.out.println("�����˳�����ӭ�ٴ�ʹ��!");

	}
	//�˵�����ʾ�������û�������ѡ��
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
		System.out.println("��ѡ�񿪻�");
	}
	public static void dispose(){
		System.out.println("��ѡ����");
	}

	public static void withDraw(){
		System.out.println("��ѡ��ȡ��");
	}
	public static void balance(){
		System.out.println("��ѡ���ѯ���");
	}

	


}
