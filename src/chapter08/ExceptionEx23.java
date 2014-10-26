package chapter08;

public class ExceptionEx23 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 메소드에서 예외가 처리되었습니다.");
		}		
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 메소드에서 예외가 처리되었습니다.");
			throw e;
		}
	}
}
