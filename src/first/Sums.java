package first;

import java.util.Scanner;

public class Sums {

	public static void main(String[] args) {
		int a,b,sum=0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		System.out.println("Enter second number: ");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Sum= "+sum);
	}

}
