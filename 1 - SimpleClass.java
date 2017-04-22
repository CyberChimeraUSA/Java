package electricalengineering;


class OhmsVariables{
	
	double current;
	double resistance;
}

public class OhmsClass {
	
	public static void main(String args []){
		
		
	OhmsVariables ohmsinstance = new OhmsVariables();
	double voltage;
	
	ohmsinstance.current = 0.003;
	ohmsinstance.resistance = 100;
	
	voltage = ohmsinstance.current * ohmsinstance.resistance;
	
	System.out.println("Voltage is : " + voltage);
			
	}
}
