package objectOriented;

interface StructLike{
	double current = 0.01;
	double resistance = 500;
}
class Power implements StructLike{
	double powerMethod(){
		return current*current*resistance;
	}
}
class Voltage implements StructLike{
	double voltageMethod(){
		return current*resistance;
		
	}
}
public class InterfaceTest {
	public static void main(String args[]){
	Power p = new Power();
	Voltage v = new Voltage();
	System.out.println("Power is " + p.powerMethod());
	System.out.println("Voltage is "+ v.voltageMethod());
	
	}
}
