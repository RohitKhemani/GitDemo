package JavaCode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamFilterAPI {

	public static void main(String[] args) {

		
		List<Customer> list = Arrays.asList(
				                      new Customer("Rohit", 25),
				                      new Customer("Vishal",24),
				                      new Customer("Hitesh",23)
				                      );
		
		Predicate<Customer> func = x->"Rohit".equals(x.getName());
		
	Customer cust =list.stream().filter(func).findAny().orElse(null);
	
	System.out.println("The information is: " +cust.getName());
		
	
	
	
	Predicate<Customer> funct = x->24==(x.getAge());
	
Customer customer =list.stream().filter(func).findAny().orElse(null);

System.out.println("The information is: " +customer.getAge());

		
		
		
	}

}

