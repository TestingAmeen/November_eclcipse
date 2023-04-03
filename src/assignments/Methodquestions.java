package assignments;

import java.util.Scanner;

public class Methodquestions {
public static void main(String[] args) {
	
	Methodquestions obj=new Methodquestions();
//1.
	obj.av();
//2.
	obj.cou("prepinsta");
	//3
	int value=obj.numb();
	System.out.println("character in string= "+value);
	
}
//method without return type and without parameter
public void av() {
	int a=10,b=20,c=30;
	double avr=(a+b+c)/3;
	System.out.println(avr);
}
//method without return type and with parameter
public void cou(String s){
	
	char[] c = s.toCharArray();
	int vowel=0;
	
	for (int i = 0; i < s.length(); i++) { 
        if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
            vowel++; 
	}
System.out.println("vowels "+ vowel);
}
//method with return type and without parameter
	public int numb(){
		System.out.println("enter the string value");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		int  count=0;
		  for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i) != ' ')    
	                count++;    
	        }    
		return count;
	    }  
	      
}
