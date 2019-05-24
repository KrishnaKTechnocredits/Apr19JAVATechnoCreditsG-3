package narendraS;

public class SwitchCaseCal {
	
	
private static void m1(int a, int b, String op  )
	
	{
		switch(op)
		
		{
		case "Sum":
			System.out.println("Sum of two Num is  " + (a+b));
		
			
		case "Sub":
			System.out.println(a-b);
			break;
			
		case "div":
		
		System.out.println(a/b);
		break;
		
		default:
			System.out.println("Invalid Operations");
			break;
			
		
		}
	}

	public static void main(String[] args) {
		
		m1(11,5,"Sum");
		

	}

}


