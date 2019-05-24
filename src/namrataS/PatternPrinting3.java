package namrataS;

public class PatternPrinting3 {

		void ex1()
		{
			for(int i=1;i<=4;i++)
			{
				for(int j=4;j>=i;j--)
				{
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}	
		public static void main(String[] args)
		{
			PatternPrinting3 l = new PatternPrinting3();
			l.ex1();
		}
	}
