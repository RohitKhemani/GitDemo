package SeleniumCode;

import org.testng.TestNG;

public class RunnableJar {
	
	static TestNG testng;
	
	
	
	public static void main(String[] args) {
		
		testng.setTestClasses(new Class[] {TESTNG.class});
		
		testng.run();
	}
	
	
	

}
