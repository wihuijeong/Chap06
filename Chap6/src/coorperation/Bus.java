package coorperation;

public class Bus {
	int busNumber;
	int money;
	int passengerCount;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void printBusInfo() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "�� �̰�, " 
				+ "������ " + money + "�� �Դϴ�.");
	}
	
}
