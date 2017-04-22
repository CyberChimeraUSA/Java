package electricalengineering;

//create class
class PowerVariables{
	double current;
	double resistance;
	
	PowerVariables(double i, double r)
	
	{
		current = i;
		resistance = r;
	}
	PowerVariables()
	{
	current = 0;
	resistance = 0;
	}
	PowerVariables(double iEQUALSr)
	{
		current=resistance=iEQUALSr;
	}
	
	double power(){
		return current*current*resistance;
	}
}
public class OhmsClass {
	public static void main(String args []){
		
		PowerVariables powervalues = new PowerVariables(0.03, 100);
		PowerVariables powervalues1 = new PowerVariables();
		PowerVariables powervalues2 = new PowerVariables(5);
		
	double POW;
	
	POW = powervalues.power();
	System.out.println("Power of powervalues object is : " + POW);
	
	POW = powervalues1.power();
	System.out.println("Power of powervalues1 object is : " + POW);
	
	POW = powervalues2.power();
	System.out.println("Power of powervalues2 object is : " + POW);
		
	}
}
