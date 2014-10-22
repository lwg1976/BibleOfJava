package chapter02;

public class CodeToChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int code = 65;	// 또는 int code = 0x0041;
		int code2 = 0x0041;
		char ch = (char) code;
		
		System.out.println(code);
		System.out.println(code2);
		System.out.println(ch);
	}

}
