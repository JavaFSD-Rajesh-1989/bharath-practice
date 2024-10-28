package javacoding;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
				x= sc.nextInt();
		System.out.println("Enter y:");
		y=sc.nextInt();
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Swapped NUmbers are:");
		System.out.println(x);
		System.out.println(y);
	}

}
