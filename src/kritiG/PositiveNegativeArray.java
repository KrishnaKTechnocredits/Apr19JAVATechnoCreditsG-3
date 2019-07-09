package kritiG;
//12) from the array separate positive number and negative number, positive number in

//ascending order and negative number in descending order.
//Example:- 
//input:- [-11, 5, 9, 2, -1, 17, -4]
//output:- positive-  [2, 4, 5, 9]
//	   negative  [-1, -4, -11]

import java.util.Arrays;
import java.util.Scanner;

public class PositiveNegativeArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a list of random positive and negative numbers");
		String[] s = sc.nextLine().split(",");
		int[] list = new int[s.length];
		for (int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(s[i]);
		}

		seperate(list);
	}

	static void seperate(int[] list) {
		Arrays.sort(list);

		String pos = "";
		String neg = "";
		for (int i = 0; i < list.length; i++) {
			if (list[i] > 0) 
				pos += list[i] + ",";
			else
				neg += list[i] + ",";
			
		}

		System.out.println(pos);
		System.out.println(neg);

	}
}
