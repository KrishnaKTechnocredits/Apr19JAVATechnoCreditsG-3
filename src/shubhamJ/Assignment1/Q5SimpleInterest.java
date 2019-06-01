package shubhamJ.Assignment1;

public class Q5SimpleInterest {

	public double calculateSimpleInterest(int p, int r, int t)
	{
		return (p*r*t)/100;
	}
	
	public static void main(String[] args) {
		Q5SimpleInterest si = new Q5SimpleInterest();
		System.out.println("Simple Interest = " + si.calculateSimpleInterest(10000,10,5));  

	}

}
