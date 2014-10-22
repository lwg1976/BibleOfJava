package chapter02;

public class CharToCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char ch = 'A';	// char ch = '\u0041';로 바꿔서 써도 같다.
		char ch2 = '\u0041';
		int code = (int)ch;
		
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(code);
	}
}
