package shubhamJ.Assignment1;

public class Q8SwapTwoNumbersUsingThirdVariable {

	
	public void swapNumbers(int num1, int num2)
	{
		System.out.println("Before swap : num1 = "+num1+ ", num2 = "+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swap : num1 = "+num1+ ", num2 = "+num2);
	}
	public static void main(String[] args) {
		
		Q8SwapTwoNumbersUsingThirdVariable swap = new Q8SwapTwoNumbersUsingThirdVariable();
		swap.swapNumbers(100,60);

	}

}
