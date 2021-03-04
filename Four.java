import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		float length,width;
		String color;
		int frameType,crownNumbers=0,crownOrnot ;
		float framePrice;
		float perimeter,area;
		float costs;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("照片的长度为(inch):");
		length = scan.nextFloat();
		System.out.print("照片的宽度为(inch):");
		width = scan.nextFloat();
		System.out.print("相框是用普通框(1)还是精美框(2):");
		frameType = scan.nextInt();
		if(frameType==1)
			framePrice = 0.15f;
		else
			framePrice = 0.25f;
		System.out.print("给框架涂成什么颜色:");
		color = scan.next();
		System.out.print("是否选择加入皇冠装饰(1--YES;2--NO):");
		crownOrnot = scan.nextInt();
		if(crownOrnot == 1)
		{
			System.out.print("嵌入几个皇冠：");
			crownNumbers = scan.nextInt();
		}
		else 
		{
			crownNumbers=0;
		}
		
		perimeter = length*2+width*2;
		area = length*width;
		costs = (float) (0.1*perimeter+framePrice*perimeter+(0.02+0.07)*area+0.35*crownNumbers);
		
		System.out.print("总共的金额为:"+costs);
		
	}

}
