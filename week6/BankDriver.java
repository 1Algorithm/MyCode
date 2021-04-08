package week6;

import java.util.Scanner;

public class BankDriver {
	public static Customer customer = null;
	public static CheckingAccount checkingaccount = null;
	public static SavingAccount savingaccount = null;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = menu();
		if(choice == 8)
		{
			return;
		}
		while(choice!=8) {
			switch(choice) {
			case 1:submenuDrive();break;
			case 2:SaveMoney();break;
			case 3:WithDraw();break;
			case 4:Consume();break;
			case 5:Repay();break;
			case 6:Settle();break;
			case 7:Balance();break;
			case 0:ShowInfo();break;
			}
			choice = menu();
		}

		
		
	}
	public static int menu(){
		int choice ;
		System.out.println("===============��ӭʹ������ϵͳ===============");
		System.out.println("1.����create     2.���save    3.ȡ��withdraw");
		System.out.println("4.����comsume    5.����repay   6.���н���settle");
		System.out.println("7.��ѯ���balance 8.�˳�exit    0.��Ϣ��ʾshowinfo ");
		System.out.println("==========================================");
		System.out.print("������Ĳ���ѡ��:");
		choice = scan.nextInt();
		if(choice == 8) {
			System.out.println("��ӭ�´�ʹ�ã�");
			return choice;
		}
		while(choice!=1&&customer==null)
		{
			System.out.println("������ɿ���������");
			System.out.print("�����������ѡ��:");
			choice = scan.nextInt();
		}
		while(choice>8) {
			System.out.print("������Ч���������������ѡ��");
			choice = scan.nextInt();
		}
		if(customer == null)
			customer = new Customer();
		return choice;
	}
	
	public static int submenu(){
		int choice;
		System.out.println("��ѡ�񿪿�����");
		System.out.println("1.���ÿ� checkingAccount");
		System.out.println("2.�洢�� savingAccount");
		System.out.println("3.���� exit");
		System.out.print("�������ѡ��");
		choice = scan.nextInt();
		while(choice!=3&&choice!=1&&choice!=2) {
			System.out.print("������Ч���������������ѡ��");
			choice = scan.nextInt();
		}
		return choice;
		
	}
	public static void submenuDrive(){
		int choice = submenu();
		if(choice == 3&&(checkingaccount == null)&&(savingaccount == null)) {
			System.out.println("û����ȷ��ɿ������������������");
			choice = submenu();
		}
		if(choice == 3&&((checkingaccount == null)||(savingaccount == null)))
			return;
	while(choice!=3) {
		switch(choice) {
		case 1:setCheckingAccount();break;
		case 2:setSavingAccount();break;
		}
		choice = submenu();
	}
	}
	public  static void setCheckingAccount(){
		String ssn,name,accountNum;
		double serviceNum;
		System.out.print("�������֤��(���֮ǰ��������ʹ��ͬһ�����֤��)��");
		ssn = scan.next();
		System.out.print("��������(���֮ǰ��������ʹ��ͬһ������)��");
		name = scan.next();
		System.out.print("���뿨�ţ�");
		accountNum = scan.next();
		System.out.print("�������ѣ�");
		serviceNum = scan.nextDouble();
		checkingaccount = new CheckingAccount(accountNum,0,serviceNum);
		customer.setSsn(ssn);
		customer.setName(name);
		customer.setCheckingAccount(checkingaccount);
		System.out.println("�������ÿ�����Ϣ���£�");
		System.out.print(checkingaccount.toString());
		System.out.println("�������ÿ��ɹ�");
		System.out.println();
	}
	
	public  static void setSavingAccount(){
		String ssn,name,accountNum;
		double interestRate;
		System.out.print("�������֤��(���֮ǰ��������ʹ��ͬһ�����֤��)��");
		ssn = scan.next();
		System.out.print("��������(���֮ǰ��������ʹ��ͬһ������)��");
		name = scan.next();
		System.out.print("���뿨�ţ�");
		accountNum = scan.next();
		System.out.print("�������ʣ�");
		interestRate = scan.nextDouble();
		savingaccount = new SavingAccount(accountNum,0,interestRate);
		customer.setSsn(ssn);
		customer.setName(name);
		customer.setSavingAccount(savingaccount);
		System.out.println("���Ĵ����Ϣ���£�");
		System.out.print(savingaccount.toString());
		System.out.println("��������ɹ�");
		System.out.println();
	}
	
	public static void SaveMoney() {
		System.out.print("������Ľ�");
		double money = scan.nextDouble();
		System.out.print("�Ǵ������ÿ��л��Ǵ���л������ſ����棺(c--���ÿ� s--���  b--����)");
		String choice = scan.next();
		if(choice.equals("c")) {
			if(checkingaccount == null) {
				System.out.println("�Բ�����δ��ͨ���ÿ����޷���Ϊ���������˵�");
				return;
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()+money);
			checkingaccount.setBalance(checkingaccount.getBalance()+money);
			customer.setCheckingAccount(checkingaccount);
		}
		else if(choice.equals("s")) {
			if(savingaccount == null) {
				System.out.println("�Բ�����δ��ͨ������޷���Ϊ���������˵�");
				return;
			}
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()+money);
			savingaccount.setBalance(savingaccount.getBalance()+money);
			customer.setSavingAccount(savingaccount);
		}
		else if(choice.equals("b")) {
			if(checkingaccount == null||savingaccount == null) {
				System.out.println("�Բ�����δ���ſ�����ͨ���޷�ͬʱΪ���ſ���Ϊ���������˵�");
				return;
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()+money);
			checkingaccount.setBalance(checkingaccount.getBalance()+money);
			customer.setCheckingAccount(checkingaccount);
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()+money);
			savingaccount.setBalance(savingaccount.getBalance()+money);
			customer.setSavingAccount(savingaccount);
		}
		System.out.println("���ɹ�!");
		System.out.println();
	}
	
	public static void Consume() {
		System.out.print("�������ѵĽ�");
		double money = scan.nextDouble();
		System.out.print("��ʹ�����ÿ����ѻ��Ǵ�����ѣ�(c--���ÿ� s--���)");
		String choice = scan.next();
		if(choice.equals("c")) {
			if(checkingaccount == null) {
				System.out.println("�Բ�����δ��ͨ���ÿ����޷����ѣ�Ϊ���������˵�");
				return;
			}
			if(checkingaccount.getBalance()<money) {
				System.out.println("�Բ���������ÿ���û����ô�����޷����ѣ�");
				return;
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()-money);
			checkingaccount.setBalance(checkingaccount.getBalance()-money);
			customer.setCheckingAccount(checkingaccount);
		}
		else if(choice.equals("s")) {
			if(savingaccount == null) {
				System.out.println("�Բ�����δ��ͨ������޷����ѣ�Ϊ���������˵�");
				return;
			}
			if(savingaccount.getBalance()<money) {
				System.out.println("�Բ�����Ĵ����û����ô�����޷����ѣ�");
				return;
			}
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()-money);
			savingaccount.setBalance(savingaccount.getBalance()-money);
			customer.setSavingAccount(savingaccount);
		}
		System.out.println("���ѳɹ�!\n");
	}
	
	public static void WithDraw() {
		System.out.print("����ȡ��Ľ�");
		double money = scan.nextDouble();
		System.out.print("�Ǵ����ÿ���ȡ���Ǵ����ȡ�������ſ���ȡ��(c--���ÿ� s--���  b--��ȡ)");
		String choice = scan.next();
		if(choice.equals("c")) {
			if(checkingaccount == null) {
				System.out.println("�Բ�����δ��ͨ���ÿ����޷�ȡ�Ϊ���������˵�");
				return;
			}
			while(checkingaccount.getBalance()<money) {
				System.out.println("�Բ���������ÿ���û����ô�����޷�ȡ�");
				System.out.print("����������ȡ���");
				money = scan.nextDouble();
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()-money);
			checkingaccount.setBalance(checkingaccount.getBalance()-money);
			customer.setCheckingAccount(checkingaccount);
		}
		else if(choice.equals("s")) {
			if(savingaccount == null) {
				System.out.println("�Բ�����δ��ͨ������޷�ȡ�Ϊ���������˵�");
				return;
			}
			while(savingaccount.getBalance()<money) {
				System.out.println("�Բ�����Ĵ����û����ô�����޷�ȡ�");
				System.out.print("����������ȡ���");
				money = scan.nextDouble();
			}
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()-money);
			savingaccount.setBalance(savingaccount.getBalance()-money);
			customer.setSavingAccount(savingaccount);
		}
		else if(choice.equals("b")) {
			if(checkingaccount == null||savingaccount == null) {
				System.out.println("�Բ�����δ���ſ�����ͨ���޷�ͬʱ�����ſ���ȡ�Ϊ���������˵�");
				return;
			}
			while(checkingaccount.getBalance()<money||savingaccount.getBalance()<money) {
				System.out.println("�Բ���������ÿ����ߴ����û����ô�����޷�ȡ�");
				System.out.print("����������ȡ���");
				money = scan.nextDouble();
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()-money);
			checkingaccount.setBalance(checkingaccount.getBalance()-money);
			customer.setCheckingAccount(checkingaccount);
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()-money);
			savingaccount.setBalance(savingaccount.getBalance()-money);
			customer.setSavingAccount(savingaccount);
		}
		System.out.println("ȡ��ɹ�!\n");
	}
	public static void Repay() {
		System.out.print("���뻹��Ľ�");
		double money = scan.nextDouble();
		System.out.print("��ʹ�����ÿ�����Ǵ�����(c--���ÿ� s--���)");
		String choice = scan.next();
		if(choice.equals("c")) {
			if(checkingaccount == null) {
				System.out.println("�Բ�����δ�����ÿ����޷����Ϊ���������˵�");
				return;
			}
			if(checkingaccount.getBalance()<money) {
				System.out.println("�Բ���������ÿ���û����ô�����޷�������");
				return;
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()-money);
			checkingaccount.setBalance(checkingaccount.getBalance()-money);
			customer.setCheckingAccount(checkingaccount);
		}
		else if(choice.equals("s")) {
			if(savingaccount == null) {
				System.out.println("�Բ�����δ��������޷����Ϊ���������˵�");
				return;
			}
			if(savingaccount.getBalance()<money) {
				System.out.println("�Բ�����Ĵ����û����ô�����޷�������");
				return;
			}
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()-money);
			savingaccount.setBalance(savingaccount.getBalance()-money);
			customer.setSavingAccount(savingaccount);
		}
		System.out.println("����ɹ�!\n");
	}
	public static void Settle() {
		if(checkingaccount!=null) {
			checkingaccount.assessServiceCharge();
		}
		if(savingaccount!=null) {
			savingaccount.payInterest();
		}
		System.out.println("����ɹ���");
		System.out.println();
	}
	
	public static void Balance() {
		System.out.print("�ǲ�ѯ���ÿ����Ǵ���������Ŷ���ѯ��(c--���ÿ� s--���  b--����ѯ)");
		String choice = scan.next();
		if(choice.equals("c")) {
			if(checkingaccount == null) {
				System.out.println("�Բ�����δ�����ÿ����޷���ѯ��Ϊ���������˵�");
				return;
			}
			System.out.print("���ÿ����Ϊ��");
			System.out.println(checkingaccount.getBalance());
		}
		else if(choice.equals("s")) {
			if(savingaccount == null) {
				System.out.println("�Բ�����δ��������޷���ѯ��Ϊ���������˵�");
				return;
			}
			System.out.print("������Ϊ��");
			System.out.println(savingaccount.getBalance());
		}
		else if(choice.equals("b")) {
			if(checkingaccount == null||savingaccount == null) {
				System.out.println("�Բ�����δ���ſ�����ͨ���޷�ͬʱ��ѯ���ſ���Ϊ���������˵�");
				return;
			}
			System.out.print("���ÿ����Ϊ��");
			System.out.println(checkingaccount.getBalance());
			System.out.print("������Ϊ��");
			System.out.println(savingaccount.getBalance());

		}
	}
	public static void ShowInfo() {
		System.out.println("���û������п���Ϣ���£�");
		if(checkingaccount == null&&savingaccount==null) {
			System.out.println("���û����κ�һ�࿨,Ҳδ�ɼ����û��κ���Ϣ");
			return;
			
		}
		if(checkingaccount == null&&savingaccount!=null) {
			System.out.print("���֤����:"+customer.getSsn()+"\n");
			System.out.print("����:"+customer.getName()+"\n");
			System.out.println("�������:"+customer.getSavingAccount().getAccountNum()+"   "
					+ "�����"+customer.getSavingAccount().getBalance()  +"  ��Ϣ�ʣ�"+customer.getSavingAccount().getInteresetRate());
			System.out.println("���û������ÿ���");
			return;
		}
		if(savingaccount == null&&checkingaccount!=null) {
			System.out.print("���֤����:"+customer.getSsn()+"\n");
			System.out.print("����:"+customer.getName()+"\n");
			System.out.println("���ÿ�����:"+customer.getCheckingAccount().getAccountNum()+"   "
					+ "���ÿ���"+customer.getCheckingAccount().getBalance()  +"  ����ѣ�"+customer.getCheckingAccount().getServiceCharge());
			System.out.println("���û��޴����");
			return;
		}
		System.out.println(customer.toString());
	}

}
