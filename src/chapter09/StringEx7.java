package chapter09;

public class StringEx7 {

	public static void main(String[] args) {
		int value = 100;
		String strValue = String.valueOf(value);
		
		int value2 = 100;
		String strValue2 = value + "";
		
		System.out.println(strValue);
		System.out.println(strValue2);
	}
}
