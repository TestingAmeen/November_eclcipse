package assignments;
class members
{
	String Name;
	int Age;
	String Address;
	int Salary;
	
	public void printdetails() 
	{
		System.out.println("name = "+Name);
		System.out.println("age = "+Age);
		System.out.println("address = "+Address);
		System.out.println("salary = "+Salary);
	}
	
}

class employee extends members//inherits member class
{
	String Specialization;
}


class manager extends members//inherits member class
{
	String Department;
}

public class Inheritancequestions {
	
public static void main(String[] args) {
	employee obj1=new employee();//object of employee
		obj1.Name="Ameen";
		obj1.Address="nettoor";
		obj1.Age=22;
		obj1.Salary=15000;
		System.out.println(obj1.Specialization="Tester");
		obj1.printdetails();
		
	manager obj2=new manager();//object of manager
	obj2.Name="Amal";
	obj2.Address="kochi";
	obj2.Age=23;
	obj2.Salary=10000;
	System.out.println(obj2.Department="Testengineer");
	obj2.printdetails();
}
}
