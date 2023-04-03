package first;

public class operators {

	public static void main(String[] args) {
		int a=85,b=40;
		
	    //arithematic operators
		System.out.println("a+b= "+(a+b));
		System.out.println("a-b= "+(a-b));
		System.out.println("a*b= "+(a*b));
		System.out.println("a/b= "+(a/b));
		System.out.println("a%b= "+(a%b));
		//relational operators
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a!=b);//not equal
		
		//asignment operators
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		//logical operators
		String username="Ameen";
		String pswrd="Abc123";
		System.out.println(username=="Ameen"&&pswrd=="Abc123");
		System.out.println(username=="Amee"||pswrd=="abc123");
		System.out.println(!(username=="Amee"));
		//unary operators
		int v=30,y=20;
		System.out.println(v++);
		System.out.println(v);
		System.out.println(++v);
		System.out.println(y--);
		System.out.println(y);
		System.out.println(--y);
		//ternary operators
		int v1=10,v2=17,v3;
		v3=v1>v2?v1:v2;
		System.out.println(v3);
	}

}
