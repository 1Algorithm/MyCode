package test;

import java.util.Scanner;

public class StudentsGrades {
	
	public static void main(String[] args) {
	    double score[]=null;
	    score = new double[5];  	 //ʹ��newΪ��������С��ָ���洢�ռ�
		// TODO Auto-generated method stub
		int choose = menu();
		while(choose!=1)
		{
			System.out.println("please enter the score first and then execute the function");
			choose = menu();
		}
		double average,maxNum,minNum;
		while (choose != 5) {
			switch (choose) {
			case 1:getAllGrades(score);
				break;
			case 2:average = getAverage(score);
				System.out.println("ƽ����="+average);
				break;
			case 3:maxNum = getHighestGrade(score);
			    System.out.println("���ֵ="+maxNum);
				break;
			case 4:minNum = getLowestGrade(score);			
			    System.out.println("��Сֵ="+minNum);
				break;
			default:
				System.out.println("��������Ч������ѡ��!");
				break;
			}
			choose = menu();
		}
		System.out.println("�����˳�����ӭ�ٴ�ʹ��!");

	}

	// �˵�����ʾ�������û�������ѡ��
	public static int menu() {
		int choice = 0;
		System.out.println("===========STUDENTS MANAGEMENT===========");
		System.out.println("1.Enter Student Results");
		System.out.println("2.Class Average");
		System.out.println("3.Highest Grade");
		System.out.println("4.Lowest Grade");
		System.out.println("5.Exit");
		System.out.print("Please Enter Your Choice(1~5):");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}
	
	public static void getAllGrades(double[] score) 
	{
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<score.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" students' grades:");
			score[i] = scan.nextDouble();
			while(score[i]<0||score[i]>100)
			{
				System.out.print("This grade is incorrect,please for the "+(i+1)+" student enter a new one:");
				score[i] = scan.nextDouble();
			}
		}
			
	}
	public static double getAverage(double[] score) {
		double average=0;
		double sum=0;
		for(int i=0;i<score.length;i++)
		{
			sum=sum+score[i];
		}
		average = sum/(score.length);
		return average;
	}

	public static double getHighestGrade(double[] score) {
		double maxNum=score[0];
		for(int i=1;i<score.length;i++)
		{
			if(maxNum<score[i])
				maxNum = score[i];
		}
		return maxNum;
	}

	public static double getLowestGrade(double[] score) {
		double minNum=score[0];
		for(int i=1;i<score.length;i++)
		{
			if(minNum>score[i])
				minNum = score[i];
		}
		return minNum;
	}

}
