public class Person {

	int age;
	String name;

	Person(String name) {
		this.name = name;
	}

	Person(int age) {
		this.age = age;
	}
	
	String height;

	void printDetails() {
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
}
