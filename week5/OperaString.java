package test;

import java.util.Scanner;

public class OperaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String date,year,month,day;
		int pos1,pos2;
		
		System.out.print("����һ������:");
		date = scan.next();
		
		pos1 = date.indexOf("-");    //�ҵ���һ����-�����ֵ�λ��
		pos2 = date.indexOf("-", pos1+1);  //�ҵ��ڶ�����-�����ֵ�λ��
		year = date.substring(0,pos1);
		month = date.substring((pos1+1),pos2);
		day = date.substring(pos2+1);
		
		System.out.println("Year:"+year);
		System.out.println("Month:"+month);
		System.out.println("day:"+day);

	}

}
