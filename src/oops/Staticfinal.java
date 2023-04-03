package oops;

public class Staticfinal {
	final double pivalue=3.25;//final
	static String Name="Ameen";//static
	static final int interest_rate=7;//static final
	
	public static void main(String[] args) {
		//object needed for final
		Staticfinal ob=new Staticfinal();
		System.out.println(ob.pivalue);
		//object not needed also value can be  change
		System.out.println(Name="Ameen");
		//object not needed also value cannot change
		System.out.println(interest_rate);
	}

}
