package electricalengineering;

//create class
class OhmsVariables{
	
	double current;
	double resistance;
	
	
	double voltage(){
	return current * resistance;
	}
}

public class OhmsClass {
	
	public static void main(String args []){

		//create instance
		OhmsVariables ohmsinstance1 = new OhmsVariables();
		
		double return_voltage;
		
		ohmsinstance1.current = 0.003;
		ohmsinstance1.resistance = 100;
	
		
		return_voltage = ohmsinstance1.voltage();
		System.out.println("Voltage is : " + return_voltage);
		
	}
}
