package week10;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validate val = new Validate();
		Scanner scan = new Scanner(System.in);
		System.out.print("������һ���û�����");
		String s = scan.nextLine();
		while(!val.isusername(s)) {
			System.out.println("��ʽ����,����������");
			s = scan.nextLine();
		}
		System.out.println("������ȷ");
		
		System.out.print("������һ�����룺");
		s = scan.nextLine();
		while(!val.ispassword(s)) {
			System.out.println("��ʽ����,����������");
			s = scan.nextLine();
		}
		System.out.println("������ȷ");
		
		System.out.print("������һ���ֻ����룺");
		s = scan.nextLine();
		while(!val.isshouphoneNum(s)) {
			System.out.println("��ʽ����,����������");
			s = scan.nextLine();
		}
		System.out.println("������ȷ");
		
		System.out.print("������һ���绰���룺");
		s = scan.nextLine();
		while(!val.isguphoneNum(s)) {
			System.out.println("��ʽ����,����������");
			s = scan.nextLine();
		}
		System.out.println("������ȷ");
		
		System.out.print("������һ��QQ���룺");
		s = scan.nextLine();
		while(!val.isQQNumber(s)) {
			System.out.println("��ʽ����,����������");
			s = scan.nextLine();
		}
		System.out.println("������ȷ");
		
		System.out.print("������һ�����֤�ţ�");
		s = scan.nextLine();
		while(!val.isID(s)) {
			System.out.println("��ʽ����,����������");
			s = scan.nextLine();
		}
		System.out.println("������ȷ");
		
		System.out.print("������һ���������룺");
		s = scan.nextLine();
		while(!val.ispostCode(s)) {
			System.out.println("��ʽ����,����������");
			s = scan.nextLine();
		}
		System.out.println("������ȷ");
		
		System.out.print("������һ�������ַ��");
		s = scan.nextLine();
		while(!val.isEmail(s)) {
			System.out.println("��ʽ����,����������");
			s = scan.nextLine();
		}
		System.out.println("������ȷ");
		
		System.out.print("������һ�������ַ��");
		s = scan.nextLine();
		while(!val.isWebsit(s)) {
			System.out.println("��ʽ����,����������");
			s = scan.nextLine();
		}
		System.out.println("������ȷ");
		
		System.out.print("������һ���������ڣ�");
		s = scan.nextLine();
		while(!val.isbirthday(s)) {
			System.out.println("��ʽ����,����������");
			s = scan.nextLine();
		}
		System.out.println("������ȷ");
		
		System.out.print("������һ����������");
		s = scan.nextLine();
		while(!val.ischineseName(s)) {
			System.out.println("��ʽ����,����������");
			s = scan.nextLine();
		}
		System.out.println("������ȷ");

		
	}
}
