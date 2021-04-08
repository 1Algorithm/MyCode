package week6;

public class SavingAccount extends BankAccount {
	private double interestRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public double getInteresetRate() {
		return interestRate;
	}

	public void setInteresetRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void payInterest(){
		super.setBalance(super.getBalance()*(1+this.interestRate));
	}
	
	public String toString(){
		String msg = super.toString();
		msg += "Interest:"+this.interestRate+"\n";
		return msg;
	}
	

}
