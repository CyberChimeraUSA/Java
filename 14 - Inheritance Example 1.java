package electricalengineering;

	//superclass
class Super {
		double current, resistane;
		void show_voltage_current(){
			System.out.println("Current is : " + current +  ", Resistance is :" + resistane);
		}
	}
	//subclass
class Sub extends Super{
	
	double Voltage;

	void VoltageCalculator(){
		Voltage = current * resistane;
		System.out.println("V = IR : " + (Voltage));
	}
}
//main class
class InheritanceExample{
	public static void main(String args []){
		Super superClass = new Super();
		Sub subClass = new Sub();
		
		superClass.current = 0.001;
		superClass.resistane = 500;
		System.out.println("Values in superClass: ");
		superClass.show_voltage_current();
		System.out.println();
		
		/*
		System.out.println("Voltage is : ");
		subClass.VoltageCalculator();
		System.out.println();
		*/
		
		subClass.current = 0.002;
		subClass.resistane = 800;

		System.out.println("Values in subClass: ");
		subClass.show_voltage_current();
	
		System.out.println();
		
		System.out.println("Voltage is : ");
		subClass.VoltageCalculator();
		
	}
}

		
