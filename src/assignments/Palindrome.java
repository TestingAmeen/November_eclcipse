package assignments;

import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		System.out.print("Enter the Character");  
		char n=sc.next().charAt(0);
		
		if( (n >= 'A' && n <= 'Z') || (n>='a' && n<='z') ) 
		{
			 System.out.println(n + " is an alphabet.");
		}
		        else
		{
		        	System.out.println(n + " is not an alphabet.");
	
		}
		
	}
}
