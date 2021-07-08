package thisexam;

public class AnotherConstructor {

	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println(person1.name);
		System.out.println(person1.age);
		
		Person person2 = person1.returnself();
		System.out.println(person1);
		System.out.println(person2);
	}

}
