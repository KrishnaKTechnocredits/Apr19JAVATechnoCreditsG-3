package chaitrali;

public class Area {
	//method to calculate area of square
	public void area(int side){
		double area = side * side;
		System.out.println("Area of square is: " + area);
	}
	
	//method to calculate area of rectangle
		public void area(double l, double b){
			double area = l * b;
			System.out.println("Area of rectangle is: " + area);
	}
		
	//method to calculate area of circle
		public void area(double r){
			double area = 3.14 * r*r;
			System.out.println("Area of circle is: " + area);
	}

	public static void main(String[] args) {
		Area a1 = new Area();
		a1.area(5);
		a1.area(3.5);
		a1.area(5,10);

	}

}
