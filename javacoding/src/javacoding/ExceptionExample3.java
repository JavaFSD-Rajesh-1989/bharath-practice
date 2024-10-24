package javacoding;


//RunTime Exception - ArrayINdexOutOfBoundException
public class ExceptionExample3 {

	public static void main(String[] args) {
		int [] val = new int[2];
		System.out.println(val[3]);//ArrayIndexOutOfBoundException
		
		String n = null;
		System.out.println(n.charAt(0));//NullPointerException
	}

}
