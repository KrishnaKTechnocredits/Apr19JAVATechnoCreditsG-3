package kritiG;
//1. Create a Circle class with fields radius as float 

//Initialize the radius through method .
//Also create separate method to calculate Area and Circumference of a Circle. 
//Create another class as ClientCircle and call the respective methods.

public class ClientCircle{
	
	public static void main(String[] args) {
		Circle c = new Circle();
		float r= c.radius();
		System.out.println(" Area of the circle is " + c.area(r));
		System.out.println(" Corcumference of the circle is  " + c.circumference(r));
	}
	
}
