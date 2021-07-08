package coorperation.q5;

public class Star {
	int money;
	
	public void buy(int money) {
		this.money += money;
		System.out.println("별다방의 매출은" + money + "원 입니다.");
	}
}
