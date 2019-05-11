package nehaJ.assignment1;

//Program to swap two numbers using the third variable
public class SwapWithVar {
	public static void main(String[] args) {
		// Number 1
		int firstNum = 10;
		// Number 2
		int secondNum = 20;
		// Swapping of numbers with third variable
		int temp = firstNum;
		firstNum = secondNum;
		secondNum = temp;
		System.out.println("Value of firstNum and secondNum after swapping: " + firstNum + " and " + secondNum);

	}

}
