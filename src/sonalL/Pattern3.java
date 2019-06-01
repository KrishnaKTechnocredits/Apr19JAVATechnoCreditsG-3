package sonalL;

public class Pattern3{

static	void patternFour()
{
	for(int i=1; i<=4; i++)
	{
		if(i%2 == 0)
		{	
		for(int j=1;j<=4;j++)
		{
			if(j%2 == 0)
			{
				System.out.print("# ");
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
			System.out.print("# ");
		}
		
	}
	System.out.println();
}
	}
}

	public static void main(String[] args) {
		patternFour();


	}

}
