package coorperation;

public class Taxi {
	String taxiNumber;
	int money;
	int passengerCount;
	
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void printTaxiInfo() {
		System.out.println("택시" + taxiNumber + "의 승객은 " + passengerCount + 
				"명 이고, 수입은" + money + "원 입니다.");
	}
}
