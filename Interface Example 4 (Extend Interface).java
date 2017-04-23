package objectOriented;

interface StructLike{
	double current = 0.01;
	
}
interface StructLike2 extends StructLike{
	double resistance = 500;
}
class Power implements StructLike2{
	double powerMethod(){
		return current*current*resistance;
	}
}

class Voltage implements StructLike2{
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
