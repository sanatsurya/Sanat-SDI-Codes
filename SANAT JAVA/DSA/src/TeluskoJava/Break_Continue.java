package TeluskoJava;

public class Break_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++) {
			if(i>7) {
				continue;
			}
			System.out.println("The number is " + i);
		}
	}

}
