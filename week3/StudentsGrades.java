package test;

import java.util.Scanner;

public class StudentsGrades {
	
	public static void main(String[] args) {
	    double score[]=null;
	    score = new double[5];  	 //使用new为数组分配大小，指定存储空间
		// TODO Auto-generated method stub
		int choose = menu();
		while(choose!=1&&choose<6)
		{
			System.out.println("please enter the score first and then execute the function");
			choose = menu();
		}
		double average,maxNum,minNum;
		while (choose != 6) {
			switch (choose) {
			case 1:getAllGrades(score);
				break;
			case 2:average = getAverage(score);
				System.out.println("平均分="+average);
				break;
			case 3:maxNum = getHighestGrade(score);
			    System.out.println("最大值="+maxNum);
				break;
			case 4:minNum = getLowestGrade(score);			
			    System.out.println("最小值="+minNum);
				break;
			case 5:
				outputGrades(score);
				break;
			default:
				System.out.println("您输入无效，重新选择!");
				break;
			}
			choose = menu();
		}
		System.out.println("程序退出，欢迎再次使用!");

	}

	// 菜单的显示，返回用户的输入选择
	public static int menu() {
		int choice = 0;
		System.out.println("===========STUDENTS MANAGEMENT===========");
		System.out.println("1.Enter Student Results");
		System.out.println("2.Class Average");
		System.out.println("3.Highest Grade");
		System.out.println("4.Lowest Grade");
		System.out.println("5.Output the Grades in order");
		System.out.println("6.Exit");
		System.out.print("Please Enter Your Choice(1~6):");
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
	public static void outputGrades(double[] score)
	{
		double newscore[];
		newscore = new double[5];
		for(int m=0;m<score.length;m++)
		{
			newscore[m] = score[m];
		}
		for(int i=0;i<newscore.length-1;i++)
		{
			for(int j=0;j<newscore.length-1-i;j++)
			{
				if(newscore[j]>newscore[j+1])
				{
					double temp = newscore[j];
					newscore[j] = newscore[j+1];
					newscore[j+1] = temp;
				}
			}
		}
		for(double s:newscore)
			System.out.print(s+"  ");
		System.out.println();
	}

}
