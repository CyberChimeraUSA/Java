package objectOriented;

interface CallMethod{
	void callmethod(int param);
}
class User1 implements CallMethod{
	public void callmethod(int y){
		System.out.println("User 1 callMethod called with " + y);
		
	}
	
	void nonInterfaceMethod(){
		System.out.println("Implementing non-Interface method");
	}
}

class User2 implements CallMethod{
	public void callmethod(int z){
		System.out.println("User 2 callMethod called with " + z);
		
	}
}


public class InterfaceTest {
	public static void main(String args[]){
		CallMethod x = new User1();
		User1 u1 = new User1();
		User2 u2 = new User2();

		x.callmethod(100);
		u1.nonInterfaceMethod();
		x = u2;
		x.callmethod(50);
	
		
	
	}
}
