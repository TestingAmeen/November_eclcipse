package controlstatement;

public class Switchs {

	public static void main(String[] args) {
		int day=7;
		switch(day)
		{
			case 1:System.out.println("monday");
					break;
			case 2:System.out.println("tuesday");
					break;
			case 3:System.out.println("wednesday");
					break;
			case 4:System.out.println("thursday");
					break;
			case 5:System.out.println("friday");
					break;
			case 6:System.out.println("saturday");
					break;
			case 7:System.out.println("sunday");
					break;
			default:System.out.println("invalid choice");
		}

	//calculater
	int calculator=4;
	int a=10,b=2,total=0;
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
		}
	}

}

