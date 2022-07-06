package Java_Project_Demo;

import java.util.function.Function;

class functionimpl implements Function<String,String>{
	public static void apply() {
		
	}

	@Override
	public String apply(String t) {
		// TODO Auto-generated method stub
		return t.toUpperCase();
	}
	
}
public class FunctionInterfacesDemo {
	public static void main(String[] arr) {
		Function<String,Integer> fun1 = name-> name.length();
		System.out.println("The lenght of bistnu is " + fun1.apply("bishnu"));
		System.out.println("The lenght of Abhya is " + fun1.apply("abhaya"));
		System.out.println("The lenght of singham is " + fun1.apply("singham"));
		functionimpl fc1 = new functionimpl();
		System.out.println(fc1.apply("raghav"));
		Function<String,String> fc3 = new Function<String,String>(){

			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
				return t.repeat(8);
			}
			
		};
		System.out.println("sanat will repaeat 8 times" + fc3.apply("Sanat \n"));
	}

}
