package shubhamJ.StringAssignment;

public class Q2ReverseString {

	public static void main(String[] args) {

		String str= "there is an apple";
		String[] astr= str.split(" ");
		String rstr="";
		for(int i=astr.length-1;i>=0;i--)
		{
			rstr=rstr+astr[i]+" ";
		}
		System.out.println("Original String : "+str);
		System.out.println("Reverse String : "+rstr);
		String[] arstr = rstr.split(" ");
		
		String temp="";
		for(int i=0;i<arstr.length;i++)
		{
			for(int j=arstr[i].length()-1;j>=0;j--)
			{
				temp=temp+arstr[i].charAt(j);
			}
			temp=temp+" ";
		}
		System.out.println("After Reverse Whole String : "+temp);
	}
	
	
}
