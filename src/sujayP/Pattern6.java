package sujayP;
/* WAP to print

3	6	9	
12	15	18	
21	24	27

*/

public class Pattern6 
{
	static void m1()
	{
		for(int i=3; i<=3;i++)
		{
			for(int j=1; j<=3;j++)
			{
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
		
		for(int i=3; i<=3;i++)
		{
			for(int j=4; j<=6;j++)
			{
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
		
		for(int i=3; i<=3;i++)
		{
			for(int j=7; j<=9;j++)
			{
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		m1();

	}

}
