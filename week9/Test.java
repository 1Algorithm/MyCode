package week9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Date date = new Date();
		System.out.println(date);
		
		Calendar cal = new GregorianCalendar();
		System.out.println(cal.get(Calendar.YEAR));
		
		System.out.println(cal.get(Calendar.MONTH)+1);  //�´�0��ʼ
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		StringBuffer weekStr = new StringBuffer("����");
		switch(week-1){
		case 0:weekStr = weekStr.append("��");break;
		default:weekStr = weekStr.append(week-1);break;
		}
		System.out.println(weekStr);  //1:Sunday
		
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));*/
		
		/*Date date = new Date();
		System.out.println(date);
		//String part = "yyyy��MM��dd��HHʱmm��ss��SSS����";
		String part = "yyyy-MM-dd-HH-mm-ss-SSS";
		SimpleDateFormat df = new SimpleDateFormat(part);
		System.out.println(df.format(date));*/
		
		/*String a = "0001";
		int b = Integer.parseInt(a);
		System.out.println(b);*/
		
		String info;
		int salesNum=0;     //���۱���      
		int salesVol=0;       //��������
		float totalMoney=0;         //���۽��
		
		Date date = new Date();
		String part = "yyyyMMdd";
		SimpleDateFormat df = new SimpleDateFormat(part);
		String waterNumBefore = df.format(date);   //��ˮ��ǰ�������
		String tailWaternum = "0998";    //�ַ��͵���ˮ��β��
		int tailWaterNum = Integer.parseInt(tailWaternum);   //���ε���ˮ��β��
		
		String allinfo = "��ˮ��\t\t��Ʒ����\t\t��Ʒ����\t\t����\t\t�ܼ�"+"\n";
		System.out.println("�������������:");
		Scanner scan = new Scanner(System.in);
		info = scan.nextLine();
		while(!(info.equals("0000"))){
			salesNum+=1;    //����+1
			String array[] =  info.split(",|��");    //����,|���ָ���
			String name = array[0];
			String num = array[1];
			String price = array[2];
			
			int Num = Integer.parseInt(num);     //�õ���Ʒ����
			salesVol+=Num;
			float Price = Float.parseFloat(price);
			float money = Num*Price;
			String mon = Float.toString(money);
			totalMoney+=money;
			
			String allWaterNum = waterNumBefore+tailWaternum;
			allinfo = allinfo + allWaterNum +"\t"+ name +"\t\t"+ num 
					+ "\t\t"+price+"\t\t" + mon+"\n" ;
			tailWaterNum+=1;
			if(tailWaterNum<10){
				tailWaternum = "000"+tailWaterNum;
			}
			if(tailWaterNum>=10&&tailWaterNum<100){
				tailWaternum = "00"+tailWaterNum;
			}
			if(tailWaterNum>=100&&tailWaterNum<1000){
				tailWaternum = "0"+tailWaterNum;
			}
			if(tailWaterNum>=1000&&tailWaterNum<10000){
				tailWaternum = Integer.toString(tailWaterNum);
			}
			info = scan.nextLine();
		}
		allinfo = allinfo+"\n�ܼƣ�  ���۱���  "+salesNum+",��������  "+salesVol+",���۽��  "+totalMoney;
		System.out.println(allinfo);

	}

}
