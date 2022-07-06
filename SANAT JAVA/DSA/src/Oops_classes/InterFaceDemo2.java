package Oops_classes;
interface Rbi{
	void deposite(int ammount);
	int balance();
	int withdraw(int ammount);
}
class CBI implements Rbi{
	int accountbalance = 0;

	@Override
	public void deposite(int ammount) {
		// TODO Auto-generated method stub
		accountbalance =+ ammount;
	}

	@Override
	public int balance() {
		// TODO Auto-generated method stub
		return accountbalance;
	}

	@Override
	public int withdraw(int ammount) {
		// TODO Auto-generated method stub
		if(ammount>accountbalance)
			System.out.println("Insuficient balance");
		else
			accountbalance = accountbalance-ammount;
		return accountbalance;
	}

}
class Axis implements Rbi{
	int accountbalance = 0;
	@Override
	public void deposite(int ammount) {
		// TODO Auto-generated method stub
		accountbalance =+ ammount;
	}

	@Override
	public int balance() {
		// TODO Auto-generated method stub
		return accountbalance;
	}

	@Override
	public int withdraw(int ammount) {
		// TODO Auto-generated method stub
		if(ammount>accountbalance)
			System.out.println("Insuficient Balance");
		return ammount;
	}
	
}
public class InterFaceDemo2 {
	public static void main(String[] args) {
		CBI a1 = new CBI();
		a1.deposite(5000);
		a1.withdraw(2000);
		System.out.println("Your account balance in Central Bank of India"+ a1.balance());
		Axis ax = new Axis();
		System.out.println(ax.balance());
	}

}
