package week9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import week9.vo.Product;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������������Ϣ���Դ�Ϊ��Ʒ���ƣ���Ʒ���ۣ������������Զ��ŷָ�");
		String aLine = scan.nextLine();
		String info = "";
		int seq = 0;
		int salesNum=0;     //���۱���      
		int salesVol=0;       //��������
		float allmoney=0;         //���۽��
		while(!(aLine.equals("0000"))){
		salesNum+=1;
		String arr[] = aLine.split(",|��");
		String name = arr[0];
		float price = Float.parseFloat(arr[1]);
		int number = Integer.parseInt(arr[2]);
		salesVol+=number;
		float totalMoney = price*number;
		allmoney+=totalMoney;
		String sno = generateSno(String.valueOf(seq));
		seq++;
		Product product = new Product(sno,name,price,number,totalMoney);
		 info += product.toString()+"\n";
		 
		  aLine = scan.nextLine();
		}
		
		System.out.println("��ˮ��\t\t��Ʒ����\t\t����\t\t��Ʒ����\t\t�ܼ�");
		System.out.println(info);
		System.out.println("�ܼƣ�\t���۱���"+salesNum+ ",�������� "+salesVol+",���۽�� "+allmoney );
		
		
	}
	public static String generateSno(String beforeNo){
		String sno = "";
		
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String prefic = df.format(new Date());
		
		String newNo = String.valueOf(Integer.parseInt(beforeNo)+1);
		String zero = "";
		int zeroCount = 4-newNo.length();
		for(int i =0;i<zeroCount;i++){
			zero = "0"+zero;
		}
		sno = prefic+zero+newNo;
		return sno;
	}

}
