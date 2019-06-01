package shubhamJ.Assignment1;

class Q9SwapNumber {

	public void swapNumbers(int num1,int num2)
	{
		System.out.println("Before swap,num1 = "  + num1 + " num2 = " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swap,num1 = " + num1 + " num2 = " + num2);
	}

	public static void main (String [] args)
	{
		Q9SwapNumber swap = new Q9SwapNumber();
		swap.swapNumbers(100,60);
	}
}
