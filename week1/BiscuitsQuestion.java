package week1;

import java.util.Scanner;

public class BiscuitsQuestion {
	public static void main(String[] args) {
		int biscuitsNumbers;
		int boxNumbers, containerNumbers;
		int leftBoxes, leftBiscuits;

		Scanner scan = new Scanner(System.in);
		System.out.print("�ܹ����ɵ�����Ϊ��");
		biscuitsNumbers = scan.nextInt();

		boxNumbers = biscuitsNumbers / 24;
		leftBiscuits = biscuitsNumbers % 24;
		containerNumbers = boxNumbers / 75;
		leftBoxes = boxNumbers % 75;

		System.out.println("��Ҫ�ĺ�����ĿΪ��" + boxNumbers);
		System.out.println("ʣ�µı�����ĿΪ��" + leftBiscuits);
		System.out.println("��Ҫ��������ĿΪ��" + containerNumbers);
		System.out.println("ʣ�µĺ�����ĿΪ��" + leftBoxes);

	}
}
