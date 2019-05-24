package namrataS;

public class PatternPrinting1 
	{
		void ex1()
		{
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(i%2==0)
					System.out.print("#" + " ");
					else
					System.out.print("*" + " ");
				}
			System.out.println();
			}
		}
		public static void main(String[] args)
		{
			PatternPrinting1 l = new PatternPrinting1();
			l.ex1();
		}
	}

