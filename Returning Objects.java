package electricalengineering;


class ExponentSquareIncreaser{
	int R;
	int y = 2;
	
	ExponentSquareIncreaser(int x){
		R = x;
	}
	ExponentSquareIncreaser Multiplier(){
		ExponentSquareIncreaser  temp = new ExponentSquareIncreaser(R * y);
		return temp;
	}
}
public class OhmsClass {
	public static void main(String args []){
		
		ExponentSquareIncreaser object1 = new ExponentSquareIncreaser(2);
		ExponentSquareIncreaser object2;
		
		object2 = object1.Multiplier();
		
		System.out.println("1st Power : " + object1.R);
		System.out.println("2nd Power : " + object2.R);
		object2 = object2.Multiplier();
		System.out.println("3rd Power : " + object2.R);
		object2 = object2.Multiplier();
		System.out.println("4th Power : " + object2.R);
	}
}
