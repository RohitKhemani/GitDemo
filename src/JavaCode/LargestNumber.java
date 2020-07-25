package JavaCode;

public class LargestNumber {

	public static void main(String[] args) {

		int num[]= {-33, 44, 100, 99};
		
		int largest = num[0];
		
		for(int i= 0; i<num.length; i++) {
			
			if(num[i]>largest) {
				
				largest = num[i];
				System.out.println("Largest Number is: " +largest);
				
			}
		}
	}
	
}
