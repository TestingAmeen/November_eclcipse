package oops;



	interface newcar
	{
		public void speedlimit();
	}
	
	class newkia implements newcar
		{

		@Override
		public void speedlimit() {
			System.out.println("kia speed");
								}
		
		}
	
	class bmw implements newcar
	{

		@Override
		public void speedlimit() {
			System.out.println("bmw speed");
		}
		
	}
	
	public class Interfaceobjectreference {
	public static void main(String[] args) {
			newcar ob=new newkia();//newcar object reference with kia
			ob.speedlimit();
			
			ob = new bmw();
			ob.speedlimit();
	}

}
