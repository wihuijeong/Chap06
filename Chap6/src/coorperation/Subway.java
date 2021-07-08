package coorperation;

public class Subway {
	String lineNumber;
	int money;
	int passengerCount;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void printSubwayInfo() {
		System.out.println("지하철" + lineNumber + "의 승객은 " + passengerCount + 
				"명 이고, 수입은" + money + "원 입니다.");
	}
}
