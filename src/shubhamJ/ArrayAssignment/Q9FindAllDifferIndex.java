package shubhamJ.ArrayAssignment;

public class Q9FindAllDifferIndex {
	
	public static void main(String[] agrs)
	{
		int[] data1 = {10,3,5,2,8,4,9};
		System.out.print("Array 1 : ");
		for(int i=0;i<data1.length;i++)
		{
			System.out.print(data1[i]+" ");
		}
		System.out.println();
		int[] data2 = {10,1,5,2,7,4,9};
		System.out.print("Array 2 : ");
		for(int i=0;i<data2.length;i++)
		{
			System.out.print(data2[i]+" ");
		}
		System.out.println();
		Q9FindAllDifferIndex obj=new Q9FindAllDifferIndex();
		obj.findAllDifferIndex(data1,data2);
	}
	
	void findAllDifferIndex(int[] data1,int[] data2)
	{
		for(int i=0;i<data1.length;i++)
		{
				if(data1[i]!=data2[i])
				{
					System.out.println("Values are not matching at index ->"+i);
				}
		}
	}
}
