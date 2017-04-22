package electricalengineering;

//static used when using independent from object of that class

public class staticClass {
	static int x = 5;
	static int y;


static void testMethod(int z)
{
	System.out.println("z = " + z);
	System.out.println("x = " + x);
	System.out.println("y = " + y);
}
static {
	System.out.println("Static Initilizaed First");
	y = x + 2;
	
}
	public static void main(String args []){
		testMethod(6);
	}
}
		
		
