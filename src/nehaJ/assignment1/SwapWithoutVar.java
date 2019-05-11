package nehaJ.assignment1;

//Program to swap two numbers without using the third variable
public class SwapWithoutVar {
	// Number 1
	int firstNum = 10;
	// Number 2
	int secondNum = 20;

	public static void main(String[] args) {

		SwapWithoutVar p1 = new SwapWithoutVar();
		SwapWithoutVar p2 = new SwapWithoutVar();
		// Swapping of numbers using objects
		p1.firstNum = p2.secondNum;
		p1.secondNum = p2.firstNum;
		System.out.println("Value of firstNum and secondNum after swapping: " + p1.firstNum + " and " + p1.secondNum);
	}
}
