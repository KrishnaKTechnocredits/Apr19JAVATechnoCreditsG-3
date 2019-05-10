package kritiG;

//Assignment 1 , Program 10
// Prime number operations
public class Program10 {

	public static void main(String[] args) {
		Program10 program10 = new Program10();

		program10.primeNumberfromRange(1, 10);
		program10.displayCount();
		program10.sum();

	}

	int cnt = 0;
	int sum = 0;

	void primeNumberfromRange(int start, int end) {
		for (int num = start; num <= end; num++) {
			int count = 0;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					count = 1;
					System.out.println(num + " is not prime");
					break;
				}
			}
			if (count == 0) {
				System.out.println(num + "is a prime number");
				cnt++;
				sum = sum + num;
			}
		}
	}

	void displayCount() {
		System.out.println("\n" + "Number of prime numbers in this range are " + cnt);
	}

	void sum() {
		System.out.println("Sum of prime numbers in this range is " + sum);
	}

}
