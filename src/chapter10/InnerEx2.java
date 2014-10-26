package chapter10;

class InnerEx2 {
	class InstanceInner2 {}
	static class StaticInner2 {}
	
	InstanceInner2 iv = new InstanceInner2();
	static StaticInner2 cv = new StaticInner2();
	
	static void staticMethod() {
		// InstanceInner obj1 = new InstanceInner();	// static 멤버는 인스턴스멤버에 직접 접근할 수 없다.
		StaticInner2 obj2 = new StaticInner2();
		
		InnerEx2 outer = new InnerEx2();
		InstanceInner2 obj1 = outer.new InstanceInner2();
	}
	
	void instanceMethod() {
		InstanceInner2 obj1 = new InstanceInner2();
		StaticInner2 obj2 = new StaticInner2();
		// LocalInner2 lv = new LocalInner2();	// 메소드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
	}
	
	void myMethod() {
		class LocalInner2 {}
		LocalInner2 lv = new LocalInner2();
	}
}
