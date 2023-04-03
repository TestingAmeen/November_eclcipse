package oops;
class sbi
{
	public void interest() {
		System.out.println("interest is 7%");
	}
	int fd=50000;
	sbi(){
		System.out.println("Sbi constructer");
	}
}



class rbi extends sbi
{
	public rbi()
	{
		super();//to call sbi class  constructor
		
	}
	
	
	@Override
	public void interest() {
		
			System.out.println("interest is 6%");
		super.interest();//used to call sbi class interest method
		
		System.out.println(super.fd);//used to call sbi class fd variable
	
		
	}
	
}

public class Methodoverridings {	
	public static void main(String[] args) {
		rbi obj=new rbi();
		obj.interest();

	}

}
