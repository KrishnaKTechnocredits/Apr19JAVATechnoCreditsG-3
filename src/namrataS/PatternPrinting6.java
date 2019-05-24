package namrataS;

public class PatternPrinting6 {
		void ex1()
		{
			for(int i=1;i<=9;i=i+3)
			{
				for(int j=i;j<i+3;j++)
				{
					System.out.print(3 * j + "\t");
				}
			System.out.println();
			}
		}
		public static void main(String[] args)
		{
			PatternPrinting6 l = new PatternPrinting6();
			l.ex1();
		}

}
