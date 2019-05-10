package sonalL;

public class Pattern2 {
	
	static void patternTwo(int num)
	{
		for(int i =1; i<=num*num; i++)
		{
			System.out.print(i*num+" ");
			
			if(i%num == 0)
			{
				System.out.println();
			}
				
		}
	}

	public static void main(String[] args) {
		
		patternTwo(3);

	}

}
