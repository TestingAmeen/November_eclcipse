package controlstatement;

public class iterative {

	public static void main(String[] args) {
		
		//while
		int i=1;
		while(i<=5) {
			System.out.println("luminar "+i);
			i++;
		}
		//do-while
		int a=1;

		do
		{
			System.out.println(a);
			a++;
		}
		while(a<=4);
		//while
		int b=1;
		while(b<=10) {
			System.out.println(b);
			b++;
		}
		//for
	
		for(int j=1;j<=10;j++){
			System.out.println(j);
		}
		  int fact=1;  
		  int number=3;
		  for(int f=1;f<=number;f++){    
		      fact=fact*f;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		  
		  	//multiple table
		  int num = 5;
	        for(int e = 1; e <= 10; ++e)
	        {
	            System.out.println(e+"*"+num+"="+num*e);
	        }
	        //A-Z
	        for(char ch='A';ch<='Z';++ch) {
	        	System.out.print(ch+" ");
	        }
		 }  
	}


