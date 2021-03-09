package week1;

import java.util.Scanner;

public class BiscuitsQuestion {
	public static void main(String[] args) {
		int biscuitsNumbers;
		int boxNumbers, containerNumbers;
		int leftBoxes, leftBiscuits;

		Scanner scan = new Scanner(System.in);
		System.out.print("总共饼干的数量为：");
		biscuitsNumbers = scan.nextInt();

		boxNumbers = biscuitsNumbers / 24;
		leftBiscuits = biscuitsNumbers % 24;
		containerNumbers = boxNumbers / 75;
		leftBoxes = boxNumbers % 75;

		System.out.println("需要的盒子数目为：" + boxNumbers);
		System.out.println("剩下的饼干数目为：" + leftBiscuits);
		System.out.println("需要的箱子数目为：" + containerNumbers);
		System.out.println("剩下的盒子数目为：" + leftBoxes);

	}
}
