package namrataS;

class MarkCalculator
		{
		String calcMark(int marks)
			{
				if (marks<=100 && marks>=90)
				{
					System.out.println(marks);


					return "PASS";
				}
				else if (marks<90 && marks>=80)
				{
					System.out.println(marks);


					return "OK";
				}
				
				
				else
				{
					System.out.println(marks);


					return "Need more practice";
				}
			}
				
		}	
			