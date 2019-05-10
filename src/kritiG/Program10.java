package kritiG;

//Assignment 1 , Program 10
// Prime number operations
public class Program10 {

	static int cnt = 0;
	static int sum = 0;
	static int nonprime = 0;

	void prime(int num) {

		int count = 0;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				count = 1;
				nonprime = nonprime + 1;
				// System.out.println(num + " is not prime");
				break;
			}
		}
		if (count == 0 && num !=1) {
			cnt = cnt + 1;     //cnt++;
			sum = sum + num;
			System.out.println(num + " is prime");
		}

	}
	
	void displayCount()
	{
		System.out.println("\n" + "Number of prime numbers in this range are " + cnt);
	}
	
	void displayCountNonPrime()
	{
		System.out.println("Number of non prime numbers in this range are " + nonprime);
	}
	
	void sum()
	{
		System.out.println("Sum of prime numbers in this range is " + sum);
	}
	
	void average()
	{
		System.out.println("Average of prime numbers in this range is " + (double)sum / cnt);
	}
	
	void div(int x)
	{
		if(sum % x == 0)
			System.out.println(sum + " is divisible by " +x);
		else
			System.out.println(sum + " is not divisible by " +x);
	}

	void primeNumberfromRange(int start, int end) {
		for (int i = start; i <= end; i++) {
			prime(i);    //for in for loop, n square complexity
		}	
	}
	

	public static void main(String[] args) {
		Program10 program10 = new Program10();

		// printPrime.prime(start);
		program10.primeNumberfromRange(1, 100);
		program10.displayCount();
		program10.displayCountNonPrime();
		program10.sum();
		program10.average();
		program10.div(11);
		

	}

}
