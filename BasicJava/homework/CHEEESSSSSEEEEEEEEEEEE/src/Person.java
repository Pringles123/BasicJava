
public class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	boolean canDrive() {

		if (age >= 16) {
			return true;
		} else {
			return false;

		}
	}
}
