package oops;

public class Methodoverloadings {

	public static void main(String[] args) {
		Methodoverloadings obj=new Methodoverloadings();
		obj.add();
		obj.add(20, 10);
		obj.add(2.5,10);
		obj.add(10,20.5);
	}
	
	public void add() {
		int a=20,b=10;
		int s=a+b;
		System.out.println(s);
	}
	
	//1st method
	
	public void add(int a,int b) {
		int s=a+b;
		System.out.println(s);
	}
	//2nd method
	
	public void add(int a,double b) {
		double s=a+b;
		System.out.println(s);
	}
	
	//3rd method
	
	public void add(double b,int a) {
		double s=a+b;
		System.out.println(s);
	}
}
