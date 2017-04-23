package objectOriented;

class One{
	void callmethod(){
		System.out.println("Inside callmethod() class One");
	}
}
class Two extends One {
	void callmethod(){
		System.out.println("Inside callmethod() class Two");
	}
}

class Three extends Two{
	void callmethod(){
		System.out.println("Inside callmethod() class Three");
	}
}
//create our public class
public class ObjectClass {
	public static void main(String args[]){
		One one = new One();
		Two two = new Two();
		Three three = new Three();
		
		One x;
		
		x = one;
		x.callmethod();
		
		x = two;
		x.callmethod();
		
		x = three;
		x.callmethod();
		
		
	}
}
