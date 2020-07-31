package lab7;

import java.util.ArrayList;

class Account{
	private long accNo;
	private double balance;
	private String name;
	public Account(long accNo, double balance, String name) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", name=" + name + "]";
	}
	
}
class Bank{
	private ArrayList<Account> accounts;
	int maxActive;
	public Bank() {
		maxActive=0;
		accounts=new ArrayList<Account>();
	}
	public boolean addAcc(Account a) {
		if(maxActive<30) {
			accounts.add(a);
			maxActive++;
			return true;
		}
		return false;
	}
	public boolean removeAcc(long accno) {
		if(maxActive>0) {
			for(int i=0;i<accounts.size();i++) {
				Account temp=accounts.get(i);
				if(temp.getAccNo()==accno) {
					accounts.remove(i);
					maxActive--;
					return true;
				}
			}
			return false;
		}
		return false;
	}
	public double deposit(long accno,double amt) {
		if(amt<0) {return -1;}
		for(int i=0;i<accounts.size();i++) {
			Account temp=accounts.get(i);
			if(temp.getAccNo()==accno) {
				temp.setBalance(temp.getBalance()+amt);
				return temp.getBalance();
			}
		}
		return -1;
	}
	public double withdraw(long accno,double amt) {
		if(amt<0) {return -1;}
		for(int i=0;i<accounts.size();i++) {
			Account temp=accounts.get(i);
			if(temp.getAccNo()==accno) {
				if(temp.getBalance()<amt) {return -1;}
				temp.setBalance(temp.getBalance()-amt);
				return temp.getBalance();
			}
		}
		return -1;
	}
	public String toString() {
		return accounts.toString();
	}
	
}
public class Ex_ArrayList {

	public static void main(String[] args) {
		Bank sbi=new Bank();
		sbi.addAcc(new Account(12345,1000,"Pok"));
		sbi.addAcc(new Account(12346,1004,"rok"));
		sbi.addAcc(new Account(12347,1003,"bok"));
		sbi.addAcc(new Account(12348,1002,"cok"));
		sbi.addAcc(new Account(12349,1001,"dok"));
		System.out.println(sbi);
		System.out.println(sbi.removeAcc(12366));
		System.out.println(sbi.removeAcc(12348));
		System.out.println(sbi);
		sbi.deposit(12345, 10000);
		System.out.println(sbi);

	}

}
