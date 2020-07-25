package JavaCode;

import java.util.function.Function;

public class FunctionalInterface {

	public static void main(String[] args) {

		Function<String,Integer> f1 = x->x.length();
		
		int res = f1.apply("This is JAVA");		
		
		System.out.println("The Output is: " +res);
	}

}
