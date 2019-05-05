package namrataS;

public class LoopEx2 {
	
	static void findDivNumbers()
	
	{
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			System.out.println(i+ " is divisible by 3 and 5 ");
			else if (i%3==0)
			System.out.println(i+ " is divisible by 3 ");	
			else if(i%5==0)
			System.out.println(i+ " is divisible by 5 ");
			else
			System.out.println(i+ " not divisible by 3&5");
		}
	}
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--)
		if(i%2==0)
		System.out.println(i);	
		findDivNumbers();
	}
}
