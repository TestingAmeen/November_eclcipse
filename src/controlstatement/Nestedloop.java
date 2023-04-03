package controlstatement;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Nestedloop {

	public static void main(String[] args) {
		//nested for loop
		/*
		   *
		   * *
		   * * *
		 */
		
			for(int e=1;e<=5;e++) {
			for(int f=1;f<e;f++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		/* 1
		 * 12
		 * 123
		 * 1234
		 */
		
		for(int a=1;a<=8;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(b+" ");
			}
			System.out.println();
			}
		
		//1
		//4 5 
		//6 7 8 
	
		int k=1;
	for(int i=1;i<=8;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
	
		}
		//continue
		for (int ab=1;ab<=4;ab++) {
			if(ab<=3) {
				continue;
			}
			System.out.println("new");
		}
		//sum of natural numbers
		int sum=0;
		for (int nm=1;nm<=10;nm++) {
			sum=sum+nm;
		}
		System.out.println("number is "+sum);
	}
}
