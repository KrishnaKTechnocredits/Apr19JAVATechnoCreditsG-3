package kritiG;
//Assignment 1 Program7:
//hour minute seconds

public class Program7 {
	
	
	void time(int sec)
	{
		int h= sec/3600;
		int m= (sec%3600)/60;
		int s= (sec%3600)%60;
		System.out.println("The time for " + sec+ " seconds in hour:minute:seconds format is : " + h+ " hour :" + m + " minutes :"
		+ s + " seconds");
		
	}
	
	
	public static void main(String[] args) {
		
		Program7 program7 = new Program7();
		program7.time(3725);
		
		
	}

}
