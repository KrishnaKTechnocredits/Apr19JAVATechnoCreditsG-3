package kritiG;
//WAP to know how many times constructor call print count of constructor calling

public class String1 {
	static int count;
	String1(){
		count++;
	}
	
	public static void main(String[] args) {
		
		String1 s = new String1();
		System.out.println("Checking number of times of constructor calling ");
		String1 s1 = new String1();
		System.out.println("Constructor is called " + count + " times");
	}
	
	

}
