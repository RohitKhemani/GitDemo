package JavaCode;

public class RemoveJunkChars {

	public static void main(String[] args) {
 
		
		String str = "TR%89qw:&[";
		
		str = str.replaceAll("[^A-Za-z0-9]", " ");
		
		System.out.println("string value is: " +str);
		
	}

}
