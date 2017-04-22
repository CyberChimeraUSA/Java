package electricalengineering;

//create class
class PowerVariables{
	double current;
	double resistance;
	
	PowerVariables(PowerVariables objectPower)
	{
		current = objectPower.current;
		resistance = objectPower.resistance;
	}
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
		PowerVariables powervaluesObject = new PowerVariables(powervalues);
		PowerVariables powervaluesObject1 = new PowerVariables(powervalues1);
		PowerVariables powervaluesObject2 = new PowerVariables(powervalues2);
		
		double POW;
		
		POW = powervalues.power();
		System.out.println("Power of powervalues object is : " + POW);
		
		POW = powervalues1.power();
		System.out.println("Power of powervalues1 object is : " + POW);
		
		POW = powervalues2.power();
		System.out.println("Power of powervalues2 object is : " + POW);
		
		POW = powervaluesObject.power();
		System.out.println("Power of powervaluesObject object is : " + POW);
		
		POW = powervaluesObject1.power();
		System.out.println("Power of powervaluesObject1 object is : " + POW);
		
		POW = powervaluesObject2.power();
		System.out.println("Power of powervaluesObject2 object is : " + POW);
			
		
	}
}
