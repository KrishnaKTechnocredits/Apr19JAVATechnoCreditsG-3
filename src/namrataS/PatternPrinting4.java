package namrataS;

public class PatternPrinting4 {

		void ex1()
		{
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=4;j++)
				{
					if(i%2==0)
					{
						if(j%2==0)
						System.out.print( j + " ");
						else
						System.out.print("* ");
					}
					else
					{
						if(j%2==0)
						System.out.print("* ");
						else
						System.out.print( j + " " );
					}
										
				}
				System.out.println();
			}
		}
		public static void main(String[] args)
		{
			PatternPrinting4 l = new PatternPrinting4();
			l.ex1();
		}
	}

