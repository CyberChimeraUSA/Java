package electricalengineering;

//create class
class OhmsVariables{
	double current;
	double resistance;
	
	double voltage(){
		return current * resistance;
		}
	
	void setValues(double i, double r)
	{
		current = i;
		resistance = r;
	}

}

public class OhmsClass {
	
	public static void main(String args []){
		//create instance
		OhmsVariables ohmsinstance1 = new OhmsVariables();
		//create return variable
		double return_voltage;
		
		ohmsinstance1.setValues(0.003, 100);

		//set return varaible to method return
		return_voltage = ohmsinstance1.voltage();
		System.out.println("Voltage is : " + return_voltage);
		

	}
}
