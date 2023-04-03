package assignments;

public class Concates {

	public static void main(String[] args) {
//		String s="java";
//		String s1="language";
//		System.out.println(s.concat(s1)	);
		String s3="java is platform independent";
		
String ar[]=s3.split(" ");
		for(String v:ar) {
			//System.out.println(v);
			if(v.contains("platform")){
				System.out.println("present in "+v );
			}
			else
			{
				System.out.println("not present in "+v);
			}
		}
	}

}
