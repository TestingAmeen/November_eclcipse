package oops;

class animals{
	public void eat() 
	{
		System.out.println("Animal eats");
	}
			}

class dogs extends animals //class dog inherits animal class
{
	public void bark() {
		System.out.println("Food");
						}
}

class babydog extends dogs //class babydog inherits dogs class and animals class
{
	public void bit() {
		System.out.println("baby dog bites");
	}
}


public class Multilevelinheritance {

	public static void main(String[] args) {
	babydog ob=new babydog();
	ob.eat();
	ob.bark();
	ob.bit();

	}

}
