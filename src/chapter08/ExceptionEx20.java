package chapter08;

public class ExceptionEx20 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 메소드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception {
		throw new Exception();
	}
}
