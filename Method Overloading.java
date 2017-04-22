package electricalengineering;

//create class
class PowerVariables{

	void power()
	{
		System.out.println("Nothning has been given");
	}
	
	int power(int i, int r)
	{
		System.out.println("Given int current is: " + i + " \nGiven int resistance is: " + r);
		return i*i*r;
	}
	double power(double i, double r)
	{
		System.out.println("Given double current is: " + i + " \nGiven double resistance is: " + r);
		return i*i*r;
	}
}

public class OhmsClass {
	public static void main(String args []){
	
		PowerVariables powervalues = new PowerVariables();
		int integerresult;
		double douberesust;
		
		powervalues.power();
		integerresult = powervalues.power(1, 500);
		douberesust = powervalues.power(0.1, 500);
		
		System.out.println("Power of integerresult is: " + integerresult);
		System.out.println("Power of douberesust is: " + douberesust);

	}
}
