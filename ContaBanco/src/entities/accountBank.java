package entities;

public class accountBank {

	private int account;
	private String name;
	private double accValue;
	private char cond ;
	
	public accountBank(int account, String name, double accValue, char cond) {
		this.account = account;
		this.name = name;
		this.accValue = accValue;
		this.cond = cond;
	}

	
	
	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccValue() {
		return accValue;
	}

	public void setAccValue(double accValue) {
		this.accValue = accValue;
	}

	public char getCond() {
		return cond;
	}

	public void setCond(char cond) {
		this.cond = cond;
	}

	
	public double addValue(double accValue) {
		 return this.accValue += accValue;
	}

	public double removeValue(double accValue) {
		return this.accValue -= accValue + 5;
	}
	
	
	
	public String toString() {
		return "Account: " + account + ", Holder: " + name + ", Balance: " + accValue;
	
	}
	
	
}
