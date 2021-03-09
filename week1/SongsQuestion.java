package week1;
import java.util.Scanner;
public class SongsQuestion {
	public static void main(String[] args) {
		String songName;
		float songPrice;
		float MANAGERCOMMISSIONRATES = 0.12f, INTERNETCOMMISSIONRATES = 0.03f;
		int numbers;
		float totalRevenue, managerRevenue, internetRevenue;
	    
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入歌曲的名字：");
		songName = scan.next();
		System.out.print("请输入歌曲的价格：");
		songPrice = scan.nextFloat();
		System.out.print("请输入歌曲被下载的数量：");
		numbers = scan.nextInt();
		
		totalRevenue = songPrice * numbers;
		managerRevenue = totalRevenue * MANAGERCOMMISSIONRATES;
		internetRevenue = totalRevenue * INTERNETCOMMISSIONRATES;
		
		System.out.println("总利润:" + totalRevenue);
		System.out.println("经理利润:" + managerRevenue);
		System.out.println("网站利润:" + internetRevenue);

	}

}
