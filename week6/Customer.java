package week6;

public class Customer {
	private String ssn;
	private String name;
	private CheckingAccount checkingAccount;
	private SavingAccount savingAccount;
	public Customer() {
		super();
	}
	public Customer(String ssn, String name, CheckingAccount checkingAccount, SavingAccount savingAccount) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.checkingAccount = checkingAccount;
		this.savingAccount = savingAccount;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	public SavingAccount getSavingAccount() {
		return savingAccount;
	}
	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}
	public String toString(){
		String msg;
		msg = "身份证号码:"+ssn+"\n";
		msg += "姓名:"+name+"\n";
		msg += "信用卡卡号:"+this.checkingAccount.getAccountNum()+"   信用卡余额："+this.checkingAccount.getBalance()  +"  服务费用："+this.checkingAccount.getServiceCharge();
		msg += "\n"+"储蓄卡卡号:"+this.savingAccount.getAccountNum()+"   储蓄卡余额："+this.savingAccount.getBalance()  +"  利息率："+this.savingAccount.getInteresetRate();
		return msg;
	}

}
