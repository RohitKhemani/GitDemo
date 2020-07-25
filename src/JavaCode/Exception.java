package JavaCode;

public class Exception {
	
	public static void main(String[]args) throws ArithmeticException {
		
		Exception exc = new Exception();
		exc.test2();
		
	}
	
		
		public void test2() throws ArithmeticException{
			
			div();
		}
		
		
		
		public void div() throws ArithmeticException{
			
			int i = 9/0;
		}
		
		
	
	

		
	
	
}
