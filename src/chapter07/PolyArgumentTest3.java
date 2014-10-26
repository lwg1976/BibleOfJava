package chapter07;

import java.util.Vector;

class Tv5 extends Product2 {
	Tv5() { super(100); }
	
	public String toString() { return "Tv"; }
}

class Computer3 extends Product2 {
	Computer3() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
	Audio2() { super(50); }
	
	public String toString() { return "Audio"; }
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
		
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return ;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하였습니다.");
	}
	
	void refund(Product2 p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.size(); i++) {
			Product2 p = (Product2)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 물품의 제품은 " + itemList + "입니다.");
	}
}

public class PolyArgumentTest3 {

	public static void main(String args[]) {
		Buyer3 b = new Buyer3();
		Tv5 tv = new Tv5();
		Computer3 com = new Computer3();
		Audio2 audio = new Audio2();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
