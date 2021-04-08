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
		System.out.println("===============欢迎使用银行系统===============");
		System.out.println("1.开户create     2.存款save    3.取款withdraw");
		System.out.println("4.消费comsume    5.还款repay   6.银行结算settle");
		System.out.println("7.查询余额balance 8.退出exit    0.信息显示showinfo ");
		System.out.println("==========================================");
		System.out.print("输入你的操作选择:");
		choice = scan.nextInt();
		if(choice == 8) {
			System.out.println("欢迎下次使用！");
			return choice;
		}
		while(choice!=1&&customer==null)
		{
			System.out.println("请先完成开户操作！");
			System.out.print("重新输入操作选择:");
			choice = scan.nextInt();
		}
		while(choice>8) {
			System.out.print("输入无效，请重新输入操作选择：");
			choice = scan.nextInt();
		}
		if(customer == null)
			customer = new Customer();
		return choice;
	}
	
	public static int submenu(){
		int choice;
		System.out.println("请选择开卡类型");
		System.out.println("1.信用卡 checkingAccount");
		System.out.println("2.存储卡 savingAccount");
		System.out.println("3.返回 exit");
		System.out.print("输入你的选择：");
		choice = scan.nextInt();
		while(choice!=3&&choice!=1&&choice!=2) {
			System.out.print("输入无效，请重新输入操作选择：");
			choice = scan.nextInt();
		}
		return choice;
		
	}
	public static void submenuDrive(){
		int choice = submenu();
		if(choice == 3&&(checkingaccount == null)&&(savingaccount == null)) {
			System.out.println("没有正确完成开户操作！请继续开户");
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
		System.out.print("输入身份证号(如果之前开过卡，使用同一个身份证号)：");
		ssn = scan.next();
		System.out.print("输入姓名(如果之前开过卡，使用同一个姓名)：");
		name = scan.next();
		System.out.print("输入卡号：");
		accountNum = scan.next();
		System.out.print("输入服务费：");
		serviceNum = scan.nextDouble();
		checkingaccount = new CheckingAccount(accountNum,0,serviceNum);
		customer.setSsn(ssn);
		customer.setName(name);
		customer.setCheckingAccount(checkingaccount);
		System.out.println("您的信用卡卡信息如下：");
		System.out.print(checkingaccount.toString());
		System.out.println("开启信用卡成功");
		System.out.println();
	}
	
	public  static void setSavingAccount(){
		String ssn,name,accountNum;
		double interestRate;
		System.out.print("输入身份证号(如果之前开过卡，使用同一个身份证号)：");
		ssn = scan.next();
		System.out.print("输入姓名(如果之前开过卡，使用同一个姓名)：");
		name = scan.next();
		System.out.print("输入卡号：");
		accountNum = scan.next();
		System.out.print("输入利率：");
		interestRate = scan.nextDouble();
		savingaccount = new SavingAccount(accountNum,0,interestRate);
		customer.setSsn(ssn);
		customer.setName(name);
		customer.setSavingAccount(savingaccount);
		System.out.println("您的储蓄卡信息如下：");
		System.out.print(savingaccount.toString());
		System.out.println("开启储蓄卡成功");
		System.out.println();
	}
	
	public static void SaveMoney() {
		System.out.print("输入存款的金额：");
		double money = scan.nextDouble();
		System.out.print("是存在信用卡中还是储蓄卡中还是两张卡都存：(c--信用卡 s--储蓄卡  b--都存)");
		String choice = scan.next();
		if(choice.equals("c")) {
			if(checkingaccount == null) {
				System.out.println("对不起，您未开通信用卡，无法存款，为您返回主菜单");
				return;
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()+money);
			checkingaccount.setBalance(checkingaccount.getBalance()+money);
			customer.setCheckingAccount(checkingaccount);
		}
		else if(choice.equals("s")) {
			if(savingaccount == null) {
				System.out.println("对不起，您未开通储蓄卡，无法存款，为您返回主菜单");
				return;
			}
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()+money);
			savingaccount.setBalance(savingaccount.getBalance()+money);
			customer.setSavingAccount(savingaccount);
		}
		else if(choice.equals("b")) {
			if(checkingaccount == null||savingaccount == null) {
				System.out.println("对不起，您未两张卡都开通，无法同时为两张卡存款，为您返回主菜单");
				return;
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()+money);
			checkingaccount.setBalance(checkingaccount.getBalance()+money);
			customer.setCheckingAccount(checkingaccount);
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()+money);
			savingaccount.setBalance(savingaccount.getBalance()+money);
			customer.setSavingAccount(savingaccount);
		}
		System.out.println("存款成功!");
		System.out.println();
	}
	
	public static void Consume() {
		System.out.print("输入消费的金额：");
		double money = scan.nextDouble();
		System.out.print("是使用信用卡消费还是储蓄卡消费：(c--信用卡 s--储蓄卡)");
		String choice = scan.next();
		if(choice.equals("c")) {
			if(checkingaccount == null) {
				System.out.println("对不起，您未开通信用卡，无法消费，为您返回主菜单");
				return;
			}
			if(checkingaccount.getBalance()<money) {
				System.out.println("对不起，你的信用卡中没有这么多余额，无法消费！");
				return;
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()-money);
			checkingaccount.setBalance(checkingaccount.getBalance()-money);
			customer.setCheckingAccount(checkingaccount);
		}
		else if(choice.equals("s")) {
			if(savingaccount == null) {
				System.out.println("对不起，您未开通储蓄卡，无法消费，为您返回主菜单");
				return;
			}
			if(savingaccount.getBalance()<money) {
				System.out.println("对不起，你的储蓄卡中没有这么多余额，无法消费！");
				return;
			}
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()-money);
			savingaccount.setBalance(savingaccount.getBalance()-money);
			customer.setSavingAccount(savingaccount);
		}
		System.out.println("消费成功!\n");
	}
	
	public static void WithDraw() {
		System.out.print("输入取款的金额：");
		double money = scan.nextDouble();
		System.out.print("是从信用卡中取还是储蓄卡中取还是两张卡都取：(c--信用卡 s--储蓄卡  b--都取)");
		String choice = scan.next();
		if(choice.equals("c")) {
			if(checkingaccount == null) {
				System.out.println("对不起，您未开通信用卡，无法取款，为您返回主菜单");
				return;
			}
			while(checkingaccount.getBalance()<money) {
				System.out.println("对不起，你的信用卡中没有这么多余额，无法取款！");
				System.out.print("请重新输入取款金额：");
				money = scan.nextDouble();
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()-money);
			checkingaccount.setBalance(checkingaccount.getBalance()-money);
			customer.setCheckingAccount(checkingaccount);
		}
		else if(choice.equals("s")) {
			if(savingaccount == null) {
				System.out.println("对不起，您未开通储蓄卡，无法取款，为您返回主菜单");
				return;
			}
			while(savingaccount.getBalance()<money) {
				System.out.println("对不起，你的储蓄卡中没有这么多余额，无法取款！");
				System.out.print("请重新输入取款金额：");
				money = scan.nextDouble();
			}
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()-money);
			savingaccount.setBalance(savingaccount.getBalance()-money);
			customer.setSavingAccount(savingaccount);
		}
		else if(choice.equals("b")) {
			if(checkingaccount == null||savingaccount == null) {
				System.out.println("对不起，您未两张卡都开通，无法同时在两张卡内取款，为您返回主菜单");
				return;
			}
			while(checkingaccount.getBalance()<money||savingaccount.getBalance()<money) {
				System.out.println("对不起，你的信用卡或者储蓄卡中没有这么多余额，无法取款！");
				System.out.print("请重新输入取款金额：");
				money = scan.nextDouble();
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()-money);
			checkingaccount.setBalance(checkingaccount.getBalance()-money);
			customer.setCheckingAccount(checkingaccount);
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()-money);
			savingaccount.setBalance(savingaccount.getBalance()-money);
			customer.setSavingAccount(savingaccount);
		}
		System.out.println("取款成功!\n");
	}
	public static void Repay() {
		System.out.print("输入还款的金额：");
		double money = scan.nextDouble();
		System.out.print("是使用信用卡还款还是储蓄卡还款：(c--信用卡 s--储蓄卡)");
		String choice = scan.next();
		if(choice.equals("c")) {
			if(checkingaccount == null) {
				System.out.println("对不起，您未开信用卡，无法还款，为您返回主菜单");
				return;
			}
			if(checkingaccount.getBalance()<money) {
				System.out.println("对不起，你的信用卡中没有这么多余额，无法偿还！");
				return;
			}
			//customer.getCheckingAccount().setBalance(checkingaccount.getBalance()-money);
			checkingaccount.setBalance(checkingaccount.getBalance()-money);
			customer.setCheckingAccount(checkingaccount);
		}
		else if(choice.equals("s")) {
			if(savingaccount == null) {
				System.out.println("对不起，您未开储蓄卡，无法还款，为您返回主菜单");
				return;
			}
			if(savingaccount.getBalance()<money) {
				System.out.println("对不起，你的储蓄卡中没有这么多余额，无法偿还！");
				return;
			}
			//customer.getSavingAccount().setBalance(savingaccount.getBalance()-money);
			savingaccount.setBalance(savingaccount.getBalance()-money);
			customer.setSavingAccount(savingaccount);
		}
		System.out.println("还款成功!\n");
	}
	public static void Settle() {
		if(checkingaccount!=null) {
			checkingaccount.assessServiceCharge();
		}
		if(savingaccount!=null) {
			savingaccount.payInterest();
		}
		System.out.println("结算成功！");
		System.out.println();
	}
	
	public static void Balance() {
		System.out.print("是查询信用卡还是储蓄卡还是两张都查询：(c--信用卡 s--储蓄卡  b--都查询)");
		String choice = scan.next();
		if(choice.equals("c")) {
			if(checkingaccount == null) {
				System.out.println("对不起，您未开信用卡，无法查询，为您返回主菜单");
				return;
			}
			System.out.print("信用卡余额为：");
			System.out.println(checkingaccount.getBalance());
		}
		else if(choice.equals("s")) {
			if(savingaccount == null) {
				System.out.println("对不起，您未开储蓄卡，无法查询，为您返回主菜单");
				return;
			}
			System.out.print("储蓄卡余额为：");
			System.out.println(savingaccount.getBalance());
		}
		else if(choice.equals("b")) {
			if(checkingaccount == null||savingaccount == null) {
				System.out.println("对不起，您未两张卡都开通，无法同时查询两张卡，为您返回主菜单");
				return;
			}
			System.out.print("信用卡余额为：");
			System.out.println(checkingaccount.getBalance());
			System.out.print("储蓄卡余额为：");
			System.out.println(savingaccount.getBalance());

		}
	}
	public static void ShowInfo() {
		System.out.println("该用户及所有卡信息如下：");
		if(checkingaccount == null&&savingaccount==null) {
			System.out.println("该用户无任何一类卡,也未采集到用户任何信息");
			return;
			
		}
		if(checkingaccount == null&&savingaccount!=null) {
			System.out.print("身份证号码:"+customer.getSsn()+"\n");
			System.out.print("姓名:"+customer.getName()+"\n");
			System.out.println("储蓄卡卡号:"+customer.getSavingAccount().getAccountNum()+"   "
					+ "储蓄卡余额："+customer.getSavingAccount().getBalance()  +"  利息率："+customer.getSavingAccount().getInteresetRate());
			System.out.println("该用户无信用卡！");
			return;
		}
		if(savingaccount == null&&checkingaccount!=null) {
			System.out.print("身份证号码:"+customer.getSsn()+"\n");
			System.out.print("姓名:"+customer.getName()+"\n");
			System.out.println("信用卡卡号:"+customer.getCheckingAccount().getAccountNum()+"   "
					+ "信用卡余额："+customer.getCheckingAccount().getBalance()  +"  服务费："+customer.getCheckingAccount().getServiceCharge());
			System.out.println("该用户无储蓄卡！");
			return;
		}
		System.out.println(customer.toString());
	}

}
