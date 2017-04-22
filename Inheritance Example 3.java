package objectOriented;

class Ohms{
	private double current;
	private double resistance;
	

	Ohms(Ohms ob){
		current = ob.current;
		resistance = ob.resistance;
		
	}
	Ohms(double i, double r){
		current = i;
		resistance = r;
		
	}
	Ohms(){
		current = -1;
		resistance = -1;
		
	}
	Ohms(double equalValues){
		current = resistance = equalValues;
	}
	double voltage(){
		return current*resistance;
	}
	double power(){
		return current*current*resistance;
	}
	
}
class Energy extends Ohms{
	double time;
	
	Energy(Energy ob){
		super(ob);
		time = ob.time;
	}
	Energy(double i, double r, double t){
		super(i,r);
		time = t;
	}
	Energy(){
		super ();
		time = -1;
	}
	Energy(double len, double t){
		super(len);
		time = t;
	}
	
}
	


public class ObjectClass {
	public static void main(String args[]){
		Energy electrical1 = new Energy(0.05,300,0.1);
		Energy electrical2 = new Energy(0.1,1000,0);
		Energy electrical3 = new Energy();
		Energy electrical4 = new Energy(3,2);
		Energy electricalclone = new Energy(electrical1);
		double volts, watts;
		
		
		volts =electrical1.voltage();
		watts =electrical1.power();
		System.out.println("Voltage of electrical1: "+ volts + "v");
		System.out.println("Power of electrical1: "+ watts + "w");
		System.out.println("Time of electrical1: "+ electrical1.time + "s");
		System.out.println("Joules of electrical1: " + electrical1.time*watts + "J");
		System.out.println();
		
		volts =electrical2.voltage();
		watts = electrical2.power();
		System.out.println("Voltage of electrical2: "+ volts + "v");
		System.out.println("Power of electrical2: "+ watts + "w");
		System.out.println("Time of electrical2: "+ electrical2.time + "s");
		System.out.println("Joules of electrical2: " + electrical2.time*watts + "J");
		System.out.println();
		
		volts =electrical3.voltage();
		watts = electrical3.power();
		System.out.println("Voltage of electrical3: "+ volts + "v");
		System.out.println("Power of electrical3: "+ watts + "w");
		System.out.println("Time of electrical3: "+ electrical3.time + "s");
		System.out.println("Joules of electrical3: " + electrical3.time*watts + "J");
		System.out.println();
		
		volts =electricalclone.voltage();
		watts = electricalclone.power();
		System.out.println("Voltage of electricalclone: "+ volts + "v");
		System.out.println("Power of electricalclone: "+ watts + "w");
		System.out.println("Time of electricalclone: "+ electricalclone.time + "s");
		System.out.println("Joules of electricalclone: " + electricalclone.time*watts + "J");
		System.out.println();
		
		volts =electrical4.voltage();
		watts = electrical4.power();
		System.out.println("Volume of electrical4: "+ volts + "v");
		System.out.println("Power of electrical4: "+ watts + "w");
		System.out.println("Time of electrical4: "+ electrical4.time + "s");
		System.out.println("Joules of electrical4: " + electrical4.time*watts + "J");
		System.out.println();
	}
}
