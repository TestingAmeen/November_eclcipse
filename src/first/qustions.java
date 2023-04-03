package first;

public class qustions {

	public static void main(String[] args) {
		//qns 1
		
		int N1=23,N2=45;
		System.out.println(N1==N2);
		//qns2
		int a=55,b=70;
		System.out.println(a<50&&a<b);
		System.out.println();
		//qns3
		int c=20,d=30;
		System.out.println("before c="+c+" d="+d);
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("after c="+c+" d="+d);
		//qns4
		int e=17,lastdigit;
		lastdigit=e%10;
		System.out.println(lastdigit);
	}

}
