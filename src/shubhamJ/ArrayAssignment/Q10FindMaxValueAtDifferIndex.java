package shubhamJ.ArrayAssignment;

public class Q10FindMaxValueAtDifferIndex {
	
	public static void main(String[] agrs)
	{
		int[] data1 = {10,3,5,2,1,4,9};
		System.out.print("Array 1 : ");
		for(int i=0;i<data1.length;i++)
		{
			System.out.print(data1[i]+" ");
		}
		System.out.println();
		int[] data2 = {10,3,5,2,7,4,9};
		System.out.print("Array 2 : ");
		for(int i=0;i<data2.length;i++)
		{ 
			System.out.print(data2[i]+" ");
		}
		System.out.println();
		Q10FindMaxValueAtDifferIndex obj=new Q10FindMaxValueAtDifferIndex();
		obj.findMaxValueAtDifferIndex(data1,data2);
	}
	
	void findMaxValueAtDifferIndex(int[] data1,int[] data2)
	{
		for(int i=0;i<data1.length;i++)
		{
				if(data1[i]!=data2[i])
				{
					System.out.println("Values are not matching at index ->"+i);
					if(data1[i]>data2[i])
					{
						System.out.println("From {"+data1[i]+","+data2[i]+"} max value is "+data1[i]);    
					}
					else
						System.out.println("From {"+data1[i]+","+data2[i]+"} max value is "+data2[i]);
				}
		}
	}
}
