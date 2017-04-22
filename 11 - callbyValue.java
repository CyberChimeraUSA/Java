package electricalengineering;


class PowerVariables{

	void CallbyValue(double i1, double i2){
	System.out.println("i1 and i2 before the change : " + i1 + " and " + i2);

	i1 = i1*i1;
	i2 = i2*i2;
	System.out.println("i1 and i2 after the change : " + i1 + " and " + i2);

}
	

}
public class OhmsClass {
	public static void main(String args []){
		PowerVariables test = new PowerVariables();
		double current1 = 0.001;
		double current2 = 0.002;
		
		System.out.println("Current1 and Current2 before the method call: " + current1 + " and " + current2);
		test.CallbyValue(current1,current2);

		System.out.println("Current1 and Current2 after the method call: " + current1 + " and " + current2);
		
	}
}
