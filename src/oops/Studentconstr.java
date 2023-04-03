package oops;

public class Studentconstr {

	int stdid;
	String stdname;
	String course;
	public Studentconstr(int stdid,String stdname,String course) {
	this.stdid=stdid;
	this.stdname=stdname;
	this.course=course;
	}
	public void display()//method for displaying
	{
		System.out.println("Std id= "+stdid);
		System.out.println("stdname = "+stdname);
		System.out.println("course= "+course);
	}	
	public static void main(String[] args) {
		Employeeconst std=new Employeeconst(101, "Ameen", "Testing");
		Employeeconst std1=new Employeeconst(102, "Amal", "MEARN");
		std.display();
		
		std1.display();
	
	}
}

