package objectOriented;
abstract class Super{
	double resistance;
	double current;
	
	Super(double r, double i){
		resistance = r;
		current = i;
	}
	abstract double callmethod();
	
	
}
class Ohms1 extends Super{
	Ohms1(double r, double i){
		super(i,r);
	}
	double callmethod(){
		System.out.println("In Ohms1 Class ");
		return current * resistance;
	}
}

class Ohms2 extends Super{
	Ohms2(double r, double i){
		super(i,r);
	}
	double callmethod(){
		System.out.println("In Ohms2 Class ");
		return current*resistance;
	}
}
public class ObjectClass {
	public static void main(String args[]){
		
		Ohms1 o1 = new Ohms1 (500, 0.2);
		Ohms2 o2 = new Ohms2 (100, 0.7);
		
		Super superReference;

		superReference = o2;
		System.out.println("Voltage of Ohms2 is : " + superReference.callmethod() + "\n");
		superReference = o1;
		System.out.println("Voltage of Ohms1 is : " + superReference.callmethod() + "\n");
		
		
	}
}
