package controlstatement;

public class Methodpgrm {

	public static void main(String[] args) {
		Methodpgrm object=new Methodpgrm();
//1
		int value=	object.add();
		System.out.println(value);
//2
		int value2=object.sub(30, 20);
		System.out.println(value2);
//3
		object.mul(30,20);
//4
		object.div();
	}
	//method with return type and without parameter
		public int add(){
				int a=30,b=20;
				int sum=a+b;
				return sum;
		}
		//method with return type and with parameter
		public int sub(int a,int b){
			int subt=a-b;
			return subt;
		}
		//method without return type and with parameter
				public void mul(int a,int b){
					int mult=a*b;
					System.out.println(mult);
				}
		//method without return type and without parameter
				public void div(){
					int a=30,b=20;
					int divs=a/b;
					System.out.println(divs);
				}

}
