package sonalL;

public class Pattern6 {
	
	static	void patternThree()
	{
		for(int i=1; i<=4; i++)
		{
			if(i%2 == 0)
			{	
			for(int j=1;j<=4;j++)
			{
				if(j%2 == 0)
				{
					System.out.print(j+" ");
				}else
				{System.out.print("* ");	
			}
				
		}
			System.out.println();
	}else
	{
		for(int j=1; j<=4; j++)
		{
			if(j%2 == 0)
			{
				System.out.print("* ");
			}else
			{
				System.out.print(j+" ");
			}
			
		}
		System.out.println();
	}
		}
	}


	public static void main(String[] args) {
		patternThree();

	}

}
