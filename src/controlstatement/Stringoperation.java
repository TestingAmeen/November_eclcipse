package controlstatement;

public class Stringoperation {

	public static void main(String[] args) {
	String s1="hello";
			String s2=new String("Hello");
	String s3="Hello";
	String s4="       HELLO Welcome      ";
	//1.comparison
	System.out.println((s1)==(s2));//false
	System.out.println(s1.equals(s2));//false
	System.out.println(s1.equals(s3));//false
	System.out.println(s1.equalsIgnoreCase(s3));//true
	
	//2.concat
	System.out.println(s1.concat(s2));
	System.out.println(s1.concat(s3));
	System.out.println(1+2+"hello"+6+7);//3hello67
	
	//3.length
	System.out.println(s1.length());
	
	//4.startwith,endswith
	System.out.println(s1.startsWith("h"));//true
	System.out.println(s1.startsWith("H"));//false
	
	//5.toupper(),tolower()
	System.out.println(s1.toUpperCase());//HELLO
	System.out.println(s2.toLowerCase());//hello
	
	//6.charAt
	System.out.println(s2.charAt(2));//l
	
	//7.trim
	System.out.println(s4.trim());//HELLO
	
	//8.contains
	System.out.println(s4.contains("Welcome"));
	
	//9.Substring
	System.out.println(s1.substring(2,5));
	
	//10.split
	String s="welcome to luminar";
	String arr[]= s.split(" ");
	for(String v:arr) {
		System.out.println(v);//welcome
							  //to
							  //luminar
	}
	
	}

}
