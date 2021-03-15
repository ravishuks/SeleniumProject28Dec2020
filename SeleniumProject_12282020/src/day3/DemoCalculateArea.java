package day3;

public class DemoCalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculateArea obj = new CalculateArea();
		
		System.out.println("Area of Rectangle");
		int width = 100;
		int len = 50;
		
		float Area;
		
		Area = obj.Area(len,  width);
		
		System.out.println ("Area of the Reactangle " + Area);
				
	}

}
