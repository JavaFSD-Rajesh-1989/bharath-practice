package javacoding;

public class CheckedEx {

	public static void main(String[] args)  throws ClassNotFoundException{
		method1();
	}
	public static void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}

}
