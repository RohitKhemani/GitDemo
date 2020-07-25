package JavaCode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {

	public static void main(String[] args) {

		
	List<String> list = Arrays.asList("ROHIT", "VISHAL", "POONAM", "HITESH");
	
	//Predicate<String> func = x->x.startsWith("ROH");
	
	//List<String> lists = list.stream().filter(func.negate()).collect(Collectors.toList());
	
	//System.out.println("The Output is: " +lists);
	
	list.forEach(x->System.out.println(x));
	
	
	
	
	}

}
