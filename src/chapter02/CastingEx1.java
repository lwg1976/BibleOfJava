package chapter02;

public class CastingEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double d = 100.0;
		int i = 100;
		int result = i + (int)d;
		
		System.out.println("d=" + d);
		System.out.println("i=" + i);
		System.out.println("result=" + result);
	}
}
