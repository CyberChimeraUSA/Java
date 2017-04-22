package electricalengineering;


class PowerVariables{

	double variable1, variable2;
	
	PowerVariables(double i1, double i2){
		variable1 = i1;
		variable2 = i2;
		
}
	void CallbyReference(PowerVariables passedObject){
		passedObject.variable1 = passedObject.variable1*passedObject.variable1;
		passedObject.variable2 = passedObject.variable2*passedObject.variable2;
	}

}
public class OhmsClass {
	public static void main(String args []){
		PowerVariables test = new PowerVariables(0.001, 0.002);
		
		System.out.println("test.variable1 and test.variable2 before the method call: " + test.variable1 + " and " + test.variable2);
		test.CallbyReference(test);
		System.out.println("test.variable1 and test.variable2 after the method call: " + test.variable1 + " and " + test.variable2);
	}
}
