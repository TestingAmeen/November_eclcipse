package controlstatement;

import java.util.Scanner;


public class Calculatorscanner {

	public static void main(String[] args) {
		//calculater with scanner
		int total;
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("1.add 2.subtract 3.multiply 4.divide");
			System.out.println("enter your choice");
			int calculator=sc.nextInt();
			switch(calculator)
			{
				case 1: total=a+b;
						System.out.println("a+b="+total);
						break;
				case 2: total=a-b;
						System.out.println("a-b= "+total);
						break;
				case 3: total=a*b;
						System.out.println("a*b= "+total);
						break;
				case 4: total=a/b;
						System.out.println("a/b= "+total);
						break;
				default:System.out.println("invalid");
			}
			
				//another method
		/*	
			switch(calculator)
			{
				case 1: System.out.println("a+b="+(a+=b));
						break;
				case 2: System.out.println("a-b= "+(a-=b));
						break;
				case 3: System.out.println("a*b= "+(a*=b));
						break;
				case 4: if(b==0) {
						System.out.println("not divisible by zero");
								}
						else {
						System.out.println("a/b= "+(a/=b));
							}
						break;
				default:System.out.println("invalid");
			}*/
	}

}
