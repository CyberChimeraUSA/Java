package objectOriented;
class x {
	public interface NestedInterface{
		//boolean function takes an integer
		boolean notNeg(int a);
	}
}
class y implements x.NestedInterface{
	
	public boolean notNeg(int x){
		if (x < 0){
			System.out.println("Negative Number \n");
			return false;
		}
		if ( x == 0){
			System.out.println("X is 0");
			return true;
			
		}
		else {
			System.out.println("Positive Number");
			return true;
		}
	}
}

public class InterfaceTest {
	public static void main(String args[]){
	x.NestedInterface test = new y();
	
	if(test.notNeg(10))
		System.out.println("Displays Positive Number \n");
	if(test.notNeg(-10))
		//returns a false, will not display 
		System.out.println("Not Displayed \n");
	if(test.notNeg(0))
		System.out.println("Displays a 0 \n");

	}
}
