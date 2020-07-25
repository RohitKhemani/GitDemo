package JavaCode;

public class CharacterSequence {

	public static void main(String[] args) {
		
		IsNumeric("ASDcx567");

		
	}

	
	public static void IsNumeric(CharSequence cs) {
		
		for(int i=0; i<cs.length(); i++) {
			
		
			
			if(Character.isDigit(cs.charAt(i))) {
				
				System.out.println("Entered CharacterSequence is numeric: " +cs);
			}
				else {
					
					System.out.println("Entered CharacterSequence is not numeric");

				}
				}
			}
}
	
	

