package oops;

public class Employeeconst {
	int empid;
	String empname;
	String designation;
	public Employeeconst(int empid,String empname,String designation) {
	this.empid=empid;
	this.empname=empname;
	this.designation=designation;
	}
	public void display()//method for displaying
	{
		System.out.println("Emp id= "+empid);
		System.out.println("Empname = "+empname);
		System.out.println("Designation= "+designation);
	}	
	public static void main(String[] args) {
		Employeeconst emp=new Employeeconst(101, "Ameen", "Tester");
		emp.display();
	
	}

}
