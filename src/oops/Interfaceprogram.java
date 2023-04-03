package oops;


	interface animal{
		public void animalfood();
		public void animalbreed();
		
	}
	
	interface pet{
		public void petfood();
	}
	

	class Dog implements animal,pet
	{

		@Override
		public void petfood() {
			System.out.println("Dog pet");
			
		}

		@Override
		public void animalfood() {
			System.out.println("Dog food");
			
		}

		@Override
		public void animalbreed() {
			System.out.println("germen shepperd");
			
		}
		
	}
	
	class cat implements animal,pet
	{

		@Override
		public void petfood() {
			System.out.println("cat pet");				
		}

		@Override
		public void animalfood() {
			System.out.println("cat food");
		}

		@Override
		public void animalbreed() {
			System.out.println("dollface");
		}
		
	}
	
	
	
	public class Interfaceprogram {
	public static void main(String[] args) {
		Dog ob1=new Dog();
		ob1.animalbreed();
		ob1.animalfood();
		ob1.petfood();
		
		cat ob2=new cat();

		ob2.animalbreed();
		ob2.animalfood();
		ob2.petfood();
		
	}

}
