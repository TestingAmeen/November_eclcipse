package oops;


	abstract class car
	{
		abstract public void speedlimit();//abstract method
		abstract public void airbag();//abstract method
		
		public void cardetails() {//method can also included
			System.out.println("cardetails");
		}
	}
	
	class maruthi extends car {

		@Override
		public void speedlimit() {
			System.out.println("maruthi speedlimit");
			
		}

		@Override
		public void airbag() {
			System.out.println("maruthi airbag");
			
		}
		
	}
	
	
	class kia extends car{

		@Override
		public void speedlimit() {
		System.out.println("kia speedlimit");
			
		}

		@Override
		public void airbag() {
			System.out.println("kia airbag");
			
		}
		
	}
	public class Abstraction {

	
	public static void main(String[] args) {
		maruthi ob1=new maruthi();
		
		ob1.airbag();
		ob1.speedlimit();
		ob1.cardetails();
		
		kia ob2=new kia();
		
		ob2.airbag();
		ob2.speedlimit();
		
		
	}

}
