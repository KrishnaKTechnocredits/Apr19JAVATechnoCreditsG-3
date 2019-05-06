package namrataS;

public class PrimeNumbers
{
	int count=0;
	int sum =0;
	void isPrime(int number)
	{
		int temp = 0;

		for(int i=2;i<number;i++)
		{
			//17%2 17%3 17%4
				if(number%i==0)
				{
				temp = 1;
				System.out.println(number +" not prime");
				break; 
				}	
		}
				if(temp==0)
				{
					System.out.println(number  + " is Prime");
					count++;
					sum=sum+number;
				
				}
	}
	void displayCount()
	{
		System.out.println("Total prime number is " + count);
	}
	void displayAvg()
	{
		double avg = (double)sum/count;
		System.out.println("AVG is " + avg);
	}
	
	
	
	void primeNumberFromRange(int start,int end)
	{
		//int count=0;
		for(int i=start;i<=end;i++)
		{
			isPrime(i);
			
		}
		System.out.println("Total prime number is " + count);
		System.out.println("Total sum of prime numbers " + sum);
		//System.out.println("Avg is" + avg);
		
	}
	

	public static void main(String[] args)
	{
		PrimeNumbers primeNumber = new PrimeNumbers();
		/*for(int start=25;start<=30;start++)
		{
			primeNumber.isPrime(start);
		}
		*/
		primeNumber.primeNumberFromRange(1,10);
		primeNumber.displayAvg();
		//primeNumber.displayCount();
		//primeNumber.isPrime(17);
		//primeNumber.isPrime(25);
		//primeNumber.isPrime(21);
		
	}
}
