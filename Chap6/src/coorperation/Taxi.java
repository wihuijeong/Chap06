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
		System.out.println("�ý�" + taxiNumber + "�� �°��� " + passengerCount + 
				"�� �̰�, ������" + money + "�� �Դϴ�.");
	}
}
