package oops;
//value assigning through object
public class Employee {
		int empid;
		String empname;
		String designation;
		
		public void display()//method for displaying
		{
			System.out.println("Emp id= "+empid);
			System.out.println("Empname = "+empname);
			System.out.println("Designation= "+designation);
		}
	public static void main(String[] args) {
	Employee emp=new Employee();//object of 1t employee
	emp.empid=101;
	emp.empname="Ameen";
	emp.designation="Tester";
	emp.display();

	Employee emp1=new Employee();//object of 2nd employee
	emp1.empid=102;
	emp1.empname="Amal";
	emp1.designation="Qa";
	emp1.display();
	}

}
