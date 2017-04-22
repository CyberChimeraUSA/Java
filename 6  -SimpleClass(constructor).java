package electricalengineering;

//create class
class OhmsVariables{
	double current;
	double resistance;
	
	double voltage()
	{
		return current * resistance;
	}
	
	
	OhmsVariables()
	{
		current = 0.003;
		resistance = 100;
	}
}

public class OhmsClass {
	
	public static void main(String args []){
				//create instance
				OhmsVariables ohmsinstance1 = new OhmsVariables();
				//create return variable
				double return_voltage;
				
				

				//set return varaible to method return
				return_voltage = ohmsinstance1.voltage();
				System.out.println("Voltage is : " + return_voltage);
				

	}
}
