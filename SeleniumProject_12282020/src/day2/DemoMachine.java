package day2;

public class DemoMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine mac;
		Car bmw;
		
		mac = new Machine();
		
		bmw = new Car();
		
		System.out.println ("Start of the machine class methods");
		mac.Start();
		mac.Stop();
		System.out.println ("End of the machine class methods");
		System.out.println("**********************************");
		System.out.println("Start of the Car class methods");
		bmw.Restart();
		bmw.Shutdown();
		bmw.Start();
		bmw.Stop();
		bmw.Start(100);
		System.out.println("End of the Car class methods");
		System.out.println("**********************************");
		Machine bmw2 = new Car();
		bmw2.Start();
		bmw2.Stop();
		
		
		
	}

}
