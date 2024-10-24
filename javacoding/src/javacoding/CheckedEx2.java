package javacoding;

public class CheckedEx2 {

	public static void main(String[] args) {
		method1();
	}
	public static void method1() {
		try {
			throw new ClassNotFoundException();
		}
		catch(ClassNotFoundException eObj) {
			eObj.printStackTrace();
		}
	}

}
