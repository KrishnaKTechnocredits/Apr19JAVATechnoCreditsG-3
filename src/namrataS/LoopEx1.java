package namrataS;

public class LoopEx1 {
	
	static void findEvenNumbers()
	
	{
		for(int i=1;i<=100;i++)
		if(i%2==0)
			System.out.println(" even : " + i);
		else
			System.out.println(" odd : " + i);	
	}
	
	public static void main(String[] args){
		findEvenNumbers();
		// start , condition, increment/decrement
		//1.assignment;2.condition;3.execute for loop body;4.increment;5.conndition;6.repeat 3-5 steps[till condition statisfies]
		for(int i=5;i>=1;i--)
		//for(int i=1;i==20;i++) //i==20;out of loop as 2nd cond not satisfied
		{
			System.out.println("Namrata"+i);
		}
		    System.out.println("Run");
	}
}
