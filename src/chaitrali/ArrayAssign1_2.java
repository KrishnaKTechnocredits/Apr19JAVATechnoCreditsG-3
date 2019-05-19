package chaitrali;

import java.util.Scanner;



public class ArrayAssign1_2 {
	
	public void findduplicate(int[] num,int maxNum)
	{
		for(int i=0;i<maxNum;i++)
		{
			//	boolean flag = true;
				for(int j =i+1;j<num.length;j++)
				{
					if(num[i] == num[j])
					{
						//flag = false;
						System.out.println("Duplicate no. is " + num[i]);
						//break;
					}
					//if(flag == true){
					//	System.out.println("Duplicate no. is " + num[i]);
				//	}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum no. of array length: ");
		int maxNum = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter number series with space between: ");
		String line = sc.nextLine();
		String[] data = line.split(" ");
		int[] num = new int[data.length];
		for(int i=0;i<num.length;i++)
		{
			num[i] = Integer.parseInt(data[i]);//As data array is og string type
		}
		
		ArrayAssign1_2 ex3 = new ArrayAssign1_2();
		ex3.findduplicate(num,maxNum);

	}

}
