package technoCredits.basicJavaProgram20_21;

class ConditionCheck {
	public static void main(String[] a) {
		ConditionCheck cc = new ConditionCheck();
		cc.display("Maulik", 7);
		cc.display("Krishna", 12);
	}

	void display(String name, int rollNumber) {
		if (rollNumber > 10) {
			System.out.println("Name is: " + name);
		} else {
			System.out.println("Technocredits");
		}
	}
}