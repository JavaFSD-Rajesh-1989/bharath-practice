package javacoding;

import java.io.FileNotFoundException;

public class CheckedEx3 {

	public static void main(String[] args) {
		try {
			method1("bharath");
			method2();
		}
		catch(ClassNotFoundException e) {
		
		}
		catch(InterruptedException e) {
			
		}
		catch(FileNotFoundException e) {
			
		}
	}
	public static void method1(String name) throws ClassNotFoundException, InterruptedException{
		if(name.equals("bharath")) {
			throw new ClassNotFoundException();
		}
		else if(name.equals("Interrupted")) {
			throw new InterruptedException();
		}
	}
	public static void method2() throws FileNotFoundException{
		
	}

}
