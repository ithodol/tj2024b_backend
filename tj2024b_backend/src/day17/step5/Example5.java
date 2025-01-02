package day17.step5;

interface InterfaceTest2{
	// 인터페이스의 구성멤버
	// 1. 상수 : 수정이 불가능한 변수
	public static final int value = 10;
	// 2. 추상메소드 : 선언부(접근제한자/반환타입/메소드명/매개변수)작성, 구현부{}는 작성하지 않음
	public abstract void method(); // 구현부{}가 없다
	// 3. 디폴트메소드
	public default void method2() {} // 인터페이스에 구현한 메소드를 만들 수 있다
	// 4. 정적메소드
	public static void method3() {}	// 인터페이스에 정적 구현 메소드를 만들 수 있다
	// 5. private 메소드
	private void method4() {}		// 현재 인터페이스에서 사용 가능한 구현 메소드를 만들 수 있다
	// 6. private 정적메소드
	private static void method5() {}	// 현재 인터페이스에서 사용 가능한 정적 구현 메소드를 만들 수 있다
	
	
	// + 인터페이스는 클래스와 다르게 생성자가 없다
	// 인터페이스를 new 인터페이스명(); 불가능. / 인터페이스는 인스턴스를 만들 수 없다
	// - 생성자 : 클래스의 구성 멤버이자 클래스로 인스턴스를 만들 때 인스턴스의 초기화하는 메소드/역할
	// - static : 프로그램이 시작될 때 메모리가 할당되고 프로그램이 끝날 때 메모리 초기화(상수/전역(공유))
		// static 이 있는 변수 또는 메소드는 인스턴스가 없어도 사용 가능
	
} // interface end

public class Example5 {
	public static void main(String[] args) {
		// [1] 인터페이스의 상수 호출 = O
		System.out.println(InterfaceTest2.value);
		
		// [2] 인터페이스의 추상메소드 호출 = X
		//InterfaceTest2.method();
		
		// [3] 인터페이스의 디폴트메소드 호출 = X
		//InterfaceTest2.method2();
		
		// [4] 인터페이스의 static 정적메소드 호출 = O
		InterfaceTest2.method3();
		
		// [**] 인터페이스 타입은 new 할 수 없다 => 인스턴스 생성 불가능
		//InterfaceTest2.inter = new InterfaceTest2();
		
	} // main end
}






















