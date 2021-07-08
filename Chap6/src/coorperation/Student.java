package coorperation;

public class Student {
	public String studentName;
	public int age;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		this.money -= 1000;
		bus.take(1000);
	}
	
	public void takeSubway(Subway subway) {
		this.money -= 1500;
		subway.take(1500);
	}
	
	public void takeTaxi(Taxi taxi) {
		this.money -= 10000;
		taxi.take(10000);
	}
	
	public void printStudentInfo() {
		System.out.println(studentName + "학생의 남은 돈은 " + money + "원 입니다.");
	}
	
}
