package sujayP;
/* WAP to print
*
##
***
####

*/

public class Pattern1 
{
	static void m1()
	{
		for(int i=1; i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j<=i)
				{
					if(i%2!=0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("#");
					}
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
