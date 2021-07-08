package coorperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student tomasStudent = new Student("Tomas", 5000);
		Bus bus1004 = new Bus(1004);
		tomasStudent.takeBus(bus1004);
		tomasStudent.printStudentInfo();
		bus1004.printBusInfo();
		
		Subway greenLine = new Subway("2È£¼±");
		Student JamesStudent = new Student("James", 10000);
		JamesStudent.printStudentInfo();
		greenLine.printSubwayInfo();
		JamesStudent.takeSubway(greenLine);
		JamesStudent.printStudentInfo();
		greenLine.printSubwayInfo();
		
		Taxi taxi1 = new Taxi("12¹Ù 3456");
		Student edwardStudent = new Student("Edward", 20000);
		edwardStudent.takeTaxi(taxi1);
		edwardStudent.printStudentInfo();
		taxi1.printTaxiInfo();
	}

}
