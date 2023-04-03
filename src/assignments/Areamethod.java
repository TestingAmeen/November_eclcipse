package assignments;

public class Areamethod {

	public static void main(String[] args) {
		Areamethod obj=new Areamethod();
//1
		double value=obj.circle();
		System.out.println("area of circle = "+value);
//2		
		double value1=obj.triangle(4, 6);
		System.out.println("area of triangle = "+value1);
//3
		obj.square(20);
//4
		obj.rectangle();
	}
	//method with return type and without parameter
	public double circle() {
		int r=3;
		double area=3.14*r*r;
		return area;
	}
	//method with return type and with parameter
			public double triangle(int b,int h){
				double area=0.5*b*h;
				return area;
			}
	//method without return type and with parameter
			public void square(int a){
				int area=a*a;
				System.out.println("area of square = "+area);
			}
	//method without return type and without parameter
			public void rectangle(){
				int L=30,B=20;
				int area=L*B;
				System.out.println("area of rectangle = "+area);
							}
			}

