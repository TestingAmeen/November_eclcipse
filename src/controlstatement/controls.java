package controlstatement;

public class controls {
public static void main(String[] args) {
	
	int d=25;
	//+ve or -ve
	if(d>0)
	{
		System.out.println("value is postive");
	}
	else 
	{
		System.out.println("value is negative");
	}
	//odd or even
	
	if(d%2==0) {
		System.out.println("even");
	}
	else
	{
		System.out.println("odd");
	}
	
	//greatest number among three
int a=47,b=22,c=45;
	
	if(a>b){
		if(a>c){
				System.out.println("a is greater");
			   }
			  else{
				  		System.out.println("c is greater");
			  	   }
			}
					else if(b>c){
							System.out.println("b is greater");
								}
							else {
								System.out.println("c is greater");
								 }
		//other method for greatest number among three
	if(a>b && a>c) {
		System.out.println("a is greater");
	}
	else if(b>c) {
		System.out.println("b is greater");
	}
	else {
		System.out.println("c is greater");
	}
}
}
