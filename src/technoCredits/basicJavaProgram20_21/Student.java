package technoCredits.basicJavaProgram20_21;

class Student {
	String name = "Krishna";
	int age = 22;
	int age1 = 30;

	void display() {
		System.out.println(age + age1 + name);
		System.out.println(name + age + age1);
		System.out.println(name + (age + age1));
	}

	public static void main(String[] k) {
		Student s = new Student();
		s.display();
	}

}