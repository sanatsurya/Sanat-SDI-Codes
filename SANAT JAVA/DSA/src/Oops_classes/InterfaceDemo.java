package Oops_classes;
interface RBI2{
	void deposite(int ammount);
	int ballance();
	int Withdraw(int amountv);
}
class ICCI implements RBI2{
	private int accbalance= 0;

	@Override
	public void deposite(int ammount) {
		// TODO Auto-generated method stub
		accbalance += ammount;
	}

	@Override
	public int ballance() {
		// TODO Auto-generated method stub
		return accbalance;
	}

	@Override
	public int Withdraw(int amount) {
		// TODO Auto-generated method stub
		if(amount> accbalance) {
			System.out.println("In sufficient Balance");
			return -1;
		}
		accbalance = accbalance-amount;
		return amount;
	}
	
}
public class InterfaceDemo {
 public static void main(String x[]) {
     ICCI icci = new ICCI();
     icci.deposite(10000);
     System.out.println("Avaiable Balance:"+icci.ballance());
     icci.Withdraw(4000);
     System.out.println("Avaiable Balance:"+icci.ballance());    
 }
}
