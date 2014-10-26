package chapter08;

public class ExceptionEx19 {

	public static void main(String[] args) {
		method1();
	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 메소드에서 예외가 처리되엇습니다.");
			e.printStackTrace();
		}
	}
}
