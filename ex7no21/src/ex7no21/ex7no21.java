package ex7no21;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv1 extends Product {

	Tv1() {
		super(100);
	}
	
	public String toString() { return "Tv";}
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer";}
}

class Buyer {
	int money = 1000;
	int bounsPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("??‘?΄ λΆ?μ‘±ν?¬ λ¬Όκ±΄? ?΄ ? ??΅??€.");
			return;
		}
		
		money -= p.price;
		bounsPoint += p.bonusPoint;
		System.out.println(p + "?/λ₯? κ΅¬μ??¨?΅??€.");
	}
}

public class ex7no21 {  //  368p
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("??¬ ?¨?? ??? " + b.money + "λ§μ???€.");
		System.out.println("??¬ λ³΄λ?€? ?? " + b.bounsPoint + "? ???€.");
	}

}
