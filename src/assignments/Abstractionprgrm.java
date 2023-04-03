package assignments;

interface BasicAnimal
{
	public void cat();
	public void sleep();
}

class Monkey
{
	public void jump()
	{
		System.out.println("monkey jump");
	}
	
	public void bite()
	{
		System.out.println("monkey bite");
	}
}

class human extends Monkey implements BasicAnimal
{

	@Override
	public void cat() {
		System.out.println("Cat animal");
		
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleeps");
	}
	
}




public class Abstractionprgrm {

	public static void main(String[] args) {
		human obj=new human();
		obj.jump();//inherited from monkey class
		obj.bite();//inherited from monkey class
		
		obj.cat();//inherited from BasicAnimal
		obj.sleep();//inherited from BasicAnimal

	}

}
