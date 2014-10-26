package chapter09;

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1);
	}
	
	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}

public class CardToString2 {

	public static void main(String[] args) {
		Card2 c = new Card2("HEART", 10);
		System.out.println(c.toString());
	}
}
