
public class Student {

	int age;
	String name;

	Student(String inputname, int inputage) {

		name = inputname;

	}

	int readBook(String bookName, int minutestoread) {

		System.out.println("Reading Book: HarryPotter, Minutes to read: 30");

		int actualminutesRead = 25;
		return actualminutesRead;
	}

	void doHomework() {

		System.out.println("doing Homework");

	}
}
