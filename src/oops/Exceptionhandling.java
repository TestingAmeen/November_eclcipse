package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream.GetField;

public class Exceptionhandling {

	public static void main(String[] args) 
	//throws FileNotFoundException 
	{
		
		//example of Throw keyword
	//	FileInputStream f=new FileInputStream("E://book1.xscx");
		
		
		
		//example of trycatch keyword
		try {
		int c=20/0;
		System.out.println(c);
		}
		catch(Exception a) {
			System.out.println("Arithemtic Exception");
			System.out.println(a.getMessage());
		}
		System.out.println("Ameen");
	
	
	
	//another example
		try {
	  String s=null;
	  System.out.println(s.length());
		}
		catch(Exception a) {
			System.out.println("nullpointer Exception");
			System.out.println(a.getMessage());
		}
		System.out.println("hello");
		
	}
	

}
