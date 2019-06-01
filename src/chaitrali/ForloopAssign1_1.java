package chaitrali;

//Program for for loop assignments
public class ForloopAssign1_1 {
	
	public static void print1(){
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2 == 0)
				{
					System.out.print("#" + " ");
				}else
					System.out.print("*" + " ");
			}
				System.out.println();	
		}
				System.out.println("End of pattern 1");	
	}
	
	public static void print2(){
		int a,b;
		for(a=1;a<=4;a++)
		{
			for(b=1;b<=4;b++)
			{
				if((a%2 == 0 & b%2 == 0)||(a%2 == 1 & b%2 ==1)){
					System.out.print("#" + " ");
					}else
					System.out.print("*" + " ");
			}
			System.out.println();
		}
		
			System.out.println("End of Pattern 2");
	}
	
	public static void print3()
	{
		int c,d;
		for(c=1;c<=4;c++)
		{
			for(d=4;d>=c;d--)
			{
				System.out.print(d + " ");
			}
				System.out.println();
			
		}
		
		System.out.println("End of Pattern 3");
	}
	
	public static void print4(){
		int a,b;
		for(a=1;a<=4;a++)
		{
			for(b=1;b<=4;b++)
			{
				if((a%2 == 0 & b%2 == 0)||(a%2 == 1 & b%2 ==1)){
					System.out.print(b + " ");
					}else
					System.out.print("*" + " ");
			}
			System.out.println();
		}
		
			System.out.println("End of Pattern 4");
	}
	
	public static void print5()
	{
		int i ,j;
		for(i=0;i<=3;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print((j+1) + " ");
			}
			System.out.println();
		}
		for(i=3;i>0;i--)	
		{
			for(j=0;j<(i-1);j++)
			{
				System.out.print((j+1) + " ");
			}
			System.out.println();
		}
		
				System.out.println("End of pattern 5");	
	}
	
	public static void print6(){
		
			for(int j=1;j<=9;j++)
			{
				int k = j*3;
				System.out.print(k + " ");
				if(j%3 == 0)
				{
					System.out.println();
				}
			}
	}
	
	public static void main(String[] args) {
			print1();
			System.out.println();
			print2();
			System.out.println();
			print3();
			System.out.println();
			print4();
			System.out.println();
			print5();
			System.out.println();
			print6();
	}

}
