package coorperation.q5;

public class Bean {
	int money;
	
	public void buy(int money) {
		this.money += money;
		System.out.println("콩다방의 매출은" + money + "원 입니다.");
	}
}
