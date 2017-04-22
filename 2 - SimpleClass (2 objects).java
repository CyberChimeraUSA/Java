package electricalengineering;


class OhmsVariables{
	
	double current;
	double resistance;
}

public class OhmsClass {
	
	public static void main(String args []){
		
		
		OhmsVariables ohmsinstance1 = new OhmsVariables();
		OhmsVariables ohmsinstance2 = new OhmsVariables();
		
		double voltage;
		
		ohmsinstance1.current = 0.003;
		ohmsinstance1.resistance = 100;
		
		ohmsinstance2.current = 0.008;
		ohmsinstance2.resistance = 5000;
		
		
		//perform math function
		voltage = ohmsinstance1.current * ohmsinstance1.resistance;
		//print
		System.out.println("Voltage of instance 1 is : " + voltage);
		
		//perform math function
		voltage = ohmsinstance2.current * ohmsinstance2.resistance;
		//print
		System.out.println("Voltage of instance 2 is : " + voltage);
				
	}
}
