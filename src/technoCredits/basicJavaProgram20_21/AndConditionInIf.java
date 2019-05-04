package technoCredits.basicJavaProgram20_21;

class AndConditionInIf {
	public static void main(String[] a) {
		AndConditionInIf cc = new AndConditionInIf();
		cc.getGrade(90);
		cc.getGrade(70);
		cc.getGrade(80);
		cc.getGrade(55);
	}

	void getGrade(int marks) {
		if (marks <= 100 && marks >= 90)
			System.out.println("A+");

		else if (marks < 90 && marks >= 80)
			System.out.println("A");

		else if (marks < 80 && marks >= 70)
			System.out.println("B+");

		else if (marks < 70 && marks >= 60)
			System.out.println("B");

		else if (marks < 60 && marks >= 50)
			System.out.println("C+");
	}
}