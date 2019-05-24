package sujayP;
/*WAP to print
1
12
123
12
1

*/

public class Pattern5 
{
	static void m1()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j<=i)
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
		for(int i=2;i>=1;i--)
		{
			for(int j=1;j<=2;j++)
			{
				if(j<=i)
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		m1();

	}

}
