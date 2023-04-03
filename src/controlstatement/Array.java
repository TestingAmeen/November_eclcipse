package controlstatement;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			/*
			 * //double array int ar[][]=new int[3][3];
			 * System.out.println("Enter the values"); for(int i=0;i<=2;i++) { for(int
			 * j=0;j<=2;j++) { ar[i][j]=sc.nextInt(); } }
			 * 
			 * for(int i=0;i<=2;i++) { for(int j=0;j<=2;j++) { System.out.println(ar[i][j]);
			 * } }
			 */
			
			
			
		int[] Arr=new int[3];
		
        for(int j=0;j<=2;j++) {
        	System.out.println("enter the "+j+" no.");
        	Arr[j]=sc.nextInt();
        	}
        //for each
        
        for(int v:Arr) {
        	System.out.println(v);
        }
        
		/*
		 * // Arr[0]=10; //Arr[1]=20; //Arr[2]=30; for(int i=0;i<=2;i++) {
		 * System.out.println("Value is "+Arr[i]); }
		 * 
		 * //String name String[] name=new String[3]; for(int i=0;i<=2;i++) {
		 * System.out.println("Enter the "+i+"th name"); name[i]=sc.next(); }
		 * 
		 * for(int j=0;j<=2;j++) { System.out.println("value is "+name[j]); }
		 * 
		 * //sum int sum=0; for(int i=0;i<=2;i++) { sum=sum+Arr[i]; }
		 * System.out.println("sum is "+sum);
		 */
	}
}
