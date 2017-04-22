package electricalengineering;
//create the superclass
class Super {
	double current;
	double resistance;

	
	Super (Super ob){
		current = ob.current;
		resistance = ob.resistance;
	
	}
	
	Super(double i, double h){
		current = i;
		resistance = h;
		
	}
	Super(){
		current = -1;
		resistance = -1;
		
	}
	Super (double same){
		current = resistance = same;
	}
	double voltage(){
		return current*resistance;
	}
}

//create the subclass
class Sub extends Super{
	double power;
	
	Sub(double i, double r){
		current = i;
		resistance = r;
		power = i*i*r;
	}

	public Sub(Sub obj) {
		current = obj.current;
		resistance = obj.resistance;
		power = current*current*resistance;
	}
	
}
//main class
class InheritanceExample{
	public static void main(String args []){
		
		Sub sub1 = new Sub (10,20);
		Sub sub2 = new Sub (0.01, 50);
		Super clone = new Super(sub1);
		Sub sub3 = new Sub (sub2);
		
		double voltage;
		
		voltage = sub1.voltage();
		
		System.out.println("Voltage of sub1 is : " + voltage);
		System.out.println("Power of sub1 is : " + sub1.power);
		
		voltage = sub2.voltage();
		
		System.out.println("Voltage of sub2 is : " + voltage);
		System.out.println("Power of sub2 is : " + sub2.power);
		

		voltage = sub3.voltage();
		
		System.out.println("Voltage of sub3 clone of sub2 is : " + voltage);
		System.out.println("Power of sub3 clone of sub2 is : " + sub3.power);
		
		voltage = clone.voltage();
		
		System.out.println("Voltage of clone is : " + voltage);
		//System.out.println("Power of clone is : " + clone.power);
		
		
	
		
	}
}

		
