package controlstatement;

//import java.util.Scanner;
class manager{
	int id;
	
}

public class scannerprgrms {

		int empid;
		String empname;
	
	public static void main(String[] args) {
		/*
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("sum= "+(a+b));

		*/
		manager mng=new manager();
		mng.id=102;
		System.out.println(mng.id);
		scannerprgrms emp1=new scannerprgrms();
		emp1.empid=101;
		emp1.empname="sarah";
		System.out.println(emp1.empid + emp1.empname);
	}
}

