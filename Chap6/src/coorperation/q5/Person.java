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
			System.out.println(this.personName+"���� "+ money +"������ ���ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.");
			this.money -= money;
			star.buy(money);
		} 
		else {
			System.out.println(money + "������ ���� �����Ͽ� �Ƹ޸�ī�븦 ���Ǽ��� ���׿�.");
		}
	}
	
	public void buyBean(Bean bean, int money) {
		
		if(this.money > 4500) {
			System.out.println(this.personName+"���� "+ money +"������ ��ٹ� �󶼸� �����߽��ϴ�.");
			this.money -= money;
			bean.buy(money);
		} 
		else {
			System.out.println(money + "������ ���� �����Ͽ� �󶼸� ���Ǽ��� ���׿�.");
		}
	}
	
}
