package oops;

public class Employeemethod {
	int empid;
	String empname;
	String designation;
	
	public static void main(String[] args) {
		Employeemethod obj=new Employeemethod();
		obj.setvalue(101,"ameen","tester");
		obj.display();
	}

	public void setvalue(int empid,String empname,String designation) //method for setting value
	{
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
}
