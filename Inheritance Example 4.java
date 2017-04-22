package objectOriented;

//create our class
class Ohms{
	private double current;
	private double resistance;
	//create multiple constructors
	//object as argument
		Ohms(Ohms ob){
			current = ob.current;
			resistance = ob.resistance;
			
		}
		//current and resistance as argument
		Ohms(double i, double r){
			current = i;
			resistance = r;
			
		}
		//no arguments
		Ohms(){
			current = 1;
			resistance = 1;
			
		}
		//equal value arguments 
		Ohms(double equalValues){
			current = resistance = equalValues;
		}
		
		//voltage and power methods
		double voltage(){
			return current*resistance;
		}
		double power(){
			return current*current*resistance;
		}
	
	
}
//create our extended class
class Energy extends Ohms{

	//create a time variable
		double time;
		//object as parameter
		Energy(Energy ob){
			//use super to use parent classes constructor
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
		Energy(double equalValues, double t){
			super(equalValues);
			time = t;
		}

}

class WireGauge extends Energy{
	double gauge;
	
	WireGauge(WireGauge ob){
		
	}
	WireGauge(double i, double r, double t, double awg){
		super(i,r,t);
		gauge = awg;
	}
	WireGauge(){
		super();
		gauge = 22;
	}
	WireGauge(double equalValues, double t, double awg){
		super(equalValues, t);
		gauge = awg;
	}
	
}
	

//create our public class
public class ObjectClass {
	public static void main(String args[]){
		
		WireGauge electrical1 = new WireGauge(0.05,300,0.1, 8);
		WireGauge electrical2 = new WireGauge(0.1,2000,0, 16);
		WireGauge electrical3 = new WireGauge();
		WireGauge electrical4 = new WireGauge(3,8, 4);
		WireGauge electricalclone = new WireGauge(electrical1);
		double volts, watts;
		
		volts =electrical1.voltage();
		watts =electrical1.power();
		System.out.println("Voltage of electrical1: "+ volts + "v");
		System.out.println("Power of electrical1: "+ watts + "w");
		System.out.println("Time of electrical1: "+ electrical1.time + "s");
		System.out.println("Joules of electrical1: " + electrical1.time*watts + "J");
		System.out.println("AWG of electrical1: " + electrical1.gauge);
		System.out.println();
		
		volts = electrical2.voltage();
		watts = electrical2.power();
		System.out.println("Voltage of electrical2: "+ volts + "v");
		System.out.println("Power of electrical2: "+ watts + "w");
		System.out.println("Time of electrical2: "+ electrical2.time + "s");
		System.out.println("Joules of electrical2: " + electrical2.time*watts + "J");
		System.out.println("AWG of electrical2: " + electrical2.gauge);
		System.out.println();
		
		volts =electrical3.voltage();
		watts = electrical3.power();
		System.out.println("Voltage of electrical3: "+ volts + "v");
		System.out.println("Power of electrical3: "+ watts + "w");
		System.out.println("Time of electrical3: "+ electrical3.time + "s");
		System.out.println("Joules of electrical3: " + electrical3.time*watts + "J");
		System.out.println("AWG of electrical3: " + electrical3.gauge);
		System.out.println();
		

		volts =electricalclone.voltage();
		watts = electricalclone.power();
		System.out.println("Voltage of electricalclone: "+ volts + "v");
		System.out.println("Power of electricalclone: "+ watts + "w");
		System.out.println("Time of electricalclone: "+ electricalclone.time + "s");
		System.out.println("Joules of electricalclone: " + electricalclone.time*watts + "J");
		System.out.println("AWG of electricalclone: " + electricalclone.gauge);
		System.out.println();
		
		volts =electrical4.voltage();
		watts = electrical4.power();
		System.out.println("Volume of electrical4: "+ volts + "v");
		System.out.println("Power of electrical4: "+ watts + "w");
		System.out.println("Time of electrical4: "+ electrical4.time + "s");
		System.out.println("Joules of electrical4: " + electrical4.time*watts + "J");
		System.out.println("AWG of electrical4: " + electrical4.gauge);
		System.out.println();
	
	}
}
