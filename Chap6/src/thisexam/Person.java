package thisexam;

public class Person {
	String name;
	int age;
	
	public Person() {
		/*
		 * name = "����"; age = 1;
		 */
		this("����", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnself(){
		return this;
	}
	
}
