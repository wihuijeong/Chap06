package coorperation.q5;

public class Cafe {

	public static void main(String[] args) {
		Person kim = new Person("±è ¾¾", 7000);
		Star starcoffee = new Star();
		kim.buyStar(starcoffee, 4000);
		kim.buyStar(starcoffee, kim.money); 
		
		Person lee = new Person("ÀÌ ¾¾", 7500);
		Bean beancoffee = new Bean();
		lee.buyBean(beancoffee, 4500);
		lee.buyBean(beancoffee, lee.money); 
	}

}
