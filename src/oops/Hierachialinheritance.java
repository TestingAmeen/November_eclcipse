package oops;


	class A
	{
		
		
		public void eat() 
		{
			
			
			System.out.println("Animal eats");
		}
	}

	
	
	class B extends A //class B inherits A class
	{
		
		public void bark() {
			System.out.println("Food");
		}
	}
	
	class C extends A//class C inherits only A class
	{
		
		
		public void details() {
			System.out.println("tiger");
		}
	}
	public class Hierachialinheritance {
		
	public static void main(String[] args) {
      B Bobeject=new B();
      Bobeject.eat();//method of class A
      Bobeject.bark();//method of class B
      
      C Cobject=new C();
      Cobject.eat();//method of class A
      Cobject.details();//method of class C
		

	}

}
