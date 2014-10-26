package chapter10;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner3 {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner3 {
		// int siv = outerCv;	// 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner3 {
			int liv = outerIv;
			int liv2 = outerCv;
			// int liv3 = lv;	// 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int liv4 = LV;
		}
	}
}
