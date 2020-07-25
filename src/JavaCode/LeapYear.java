package JavaCode;

public class LeapYear {

	public static void main(String[] args) {

		
		int year = 2000;
		
		if(year%4==0) {
			
			
			System.out.println("Entered Year is a leap year");
		}
			
			else{
				
				System.out.println("Entered year is not a leap year");
			}
				
				if(year%100==0) {
					
					
					System.out.println("Entered Year is a century year");
				}
					
					else{
						
						System.out.println("Entered year is not a century year");
						
						if(year%400==0) {
							
							
							System.out.println("Entered Year is a century leap year");
						}
							
							else{
								
								System.out.println("Entered year is not a century leap year");
							}


				
				
			}
			
		}
}



