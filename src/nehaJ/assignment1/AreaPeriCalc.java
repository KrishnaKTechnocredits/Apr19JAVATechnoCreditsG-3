package nehaJ.assignment1;

//Program to calculate area and perimeter of Rectangle & Circle
public class AreaPeriCalc {
	public static void main(String[] args) {
		int recHeight = 67;
		int recWidth = 98;
		int circleRad = 34;
		AreaPeriCalc calc = new AreaPeriCalc();
		System.out.println("Area and Perimeter of rectangle are: " + calc.areaRec(recHeight, recWidth) + " and "
				+ calc.periRec(recHeight, recWidth));
		System.out.println("Area and Perimeter of Circle are: " + calc.areaCircle(circleRad) + " and "
				+ calc.periCircle(circleRad));

	}

	// Calculate Perimeter of circle
	float periCircle(int circleRad) {
		return (2 * 3.14f * circleRad);// 2πr
	}

	// Calculate Perimeter of rectangle
	int periRec(int recHeight, int recWidth) {
		return ((recHeight * 2) + (recWidth * 2));
	}

	// Calculate area of circle
	float areaCircle(int circleRad) {
		return (3.14f * circleRad * circleRad);
	}

	// Calculate area of rectangle
	int areaRec(int recHeight, int recWidth) {
		return (recHeight * recWidth);
	}
}
