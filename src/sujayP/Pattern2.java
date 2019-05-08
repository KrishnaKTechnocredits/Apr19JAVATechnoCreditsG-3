package sujayP;
/* WAP to print
 
#*#*
*#*#
#*#*
*#*#

*/

public class Pattern2 
{
	static void m1()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1; j<=4;j++)
			{
				if((i+j)%2!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("#");
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
