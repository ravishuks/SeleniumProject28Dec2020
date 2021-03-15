package day2;

public class Car extends Machine{

	Car() {
		System.out.println ("This is the constructor of Car class");
	}
	
	void Shutdown() {
		System.out.println("This is the Shutdown method within the Car class");
	}
	
	void Restart() {
		System.out.println("This is the Restart methid within the Car class");
	}
	
	void Start(int x) {
		System.out.println("This is an overloaded method " + x);
	}
}
