package shubhamJ;

public class Pattern {

	
	void pattern1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
			System.out.println(" ");;
		}
	}
	
	void pattern2()
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
	void pattern3()
	{
		for(int i=1;i<=3;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
			for(int j=2;j>=1;j--)
			{
				for(int k=1;k<=j;k++)
				{
					System.out.print(k);
				}
			System.out.println();
			}
	}
	
	public static void main(String[] args) {

		Pattern p1 = new Pattern();
		p1.pattern1();
		p1.pattern2();
		p1.pattern3();
	}

}
