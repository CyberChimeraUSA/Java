package objectOriented;

//create our class
class Ohms{
	
int x, y;
Ohms(int i, int r){
	x = i;
	y = r;
}
void show(){
	System.out.println("i and r: " + x + ""+ y);
}
}
class Power extends Ohms{
	int z;
	Power(int i, int r, int p){
		super(i, r);
		z = p;
	}
	void show(){
		System.out.println("z:" + z);
	}
}


//create our public class
public class ObjectClass {
	public static void main(String args[]){
		
		Power subClass1 = new Power(1,2,3);
		subClass1.show();
		

		
	}
}
