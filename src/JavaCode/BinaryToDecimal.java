package JavaCode;

public class BinaryToDecimal {

	public static void main(String[] args) {

	
	
double decimalnumber =conversion(10100011);

System.out.println("The Decimal is: " +decimalnumber);
	}
	public static double conversion(long num) {
		
		int i=0;
		
		double decimal=0;
		
		long remainder;
		
		while(num!=0) {
			
			num=num/10;
			
			remainder=num%10;
			
			decimal= decimal + (remainder * Math.pow(2, i));
			
			i++;
			
			
			
			
					
					
		}
		
		return decimal;
	}

}
