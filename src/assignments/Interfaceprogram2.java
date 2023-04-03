package assignments;

interface SmartTv
{
	public void on();
}

interface TvRemote extends SmartTv
{
	public void off();
}

class Tv implements SmartTv
{

	@Override
	public void on() {
		System.out.println("Tv is on");
	}
	
}

public class Interfaceprogram2 {
	public static void main(String[] args) {
		SmartTv ob=new Tv();
		ob.on();
	}

}
