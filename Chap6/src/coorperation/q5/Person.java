package coorperation.q5;

public class Person {
	String personName;
	int money;
	
	public Person(String personName, int money) {
		this.personName = personName;
		this.money = money;
	}
	
	public void buyStar(Star star, int money) {
		
		if(this.money > 4000) {
			System.out.println(this.personName+"님이 "+ money +"원으로 별다방 아메리카노를 구매했습니다.");
			this.money -= money;
			star.buy(money);
		} 
		else {
			System.out.println(money + "원으로 돈이 부족하여 아메리카노를 마실수가 없네요.");
		}
	}
	
	public void buyBean(Bean bean, int money) {
		
		if(this.money > 4500) {
			System.out.println(this.personName+"님이 "+ money +"원으로 콩다방 라떼를 구매했습니다.");
			this.money -= money;
			bean.buy(money);
		} 
		else {
			System.out.println(money + "원으로 돈이 부족하여 라떼를 마실수가 없네요.");
		}
	}
	
}
