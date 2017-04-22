package electricalengineering;

//create class
class OhmsVariables{
	
	double current;
	double resistance;
	double voltage;
	
	void voltage(){
		voltage = current * resistance;
		System.out.println("Voltage is : " + voltage );
	}
}


public class OhmsClass {
	
	public static void main(String args []){
		
		
		OhmsVariables ohmsinstance1 = new OhmsVariables();
		
		
		ohmsinstance1.current = 0.003;
		ohmsinstance1.resistance = 100;
		
		ohmsinstance1.voltage();
		
	}
}
