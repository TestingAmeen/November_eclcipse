package assignments;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
	
		}
}

//qns1
/*int a=12;
a++;
System.out.println(a);*/

//qns2
/*	
int a=1000;
int b=570;
System.out.println(a==b);
*/

//qns3
/*	int	b=6;
for(int a=1;a<=10;a++) {
int total=0;
total=a*b;
System.out.println(a+"*"+b+" = "+total);
}*/

//qns4
/*	int num=10,sum=0;
for(int a=1;a<=num;a++) {
sum=sum+a;
}
System.out.println(sum);*/

//qns5
/*	System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int  reverse = 0;  
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  */

//qns6
/*	Scanner sc = new Scanner(System.in);

char choice;
int even = 0;
int odd = 0;

do
{
    System.out.print("Enter any number ");
    int number = sc.nextInt();

    if( number % 2 == 0)
    {
        even += number;
    }
    else
    {
        odd += number;
    }

    System.out.print("Do you want to continue y/n? ");
    choice = sc.next().charAt(0);

}while(choice=='y' || choice == 'Y');

System.out.println("Sum of even numbers: " + even);
System.out.println("Sum of odd numbers: " + odd);*/