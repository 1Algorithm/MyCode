package week2;

public class P57_6 {
	public static void main(String[] args) {
		int sum=0;    //���
		int flag=1;    //����λ
		for(int i=13;i<=1003;i=i+10)
		{
			sum = sum+flag*i;
			flag = flag*(-1);
		}
		System.out.print("The sum of 13-23+33-43+53-......+993-1003 is "+sum);
	}

}
