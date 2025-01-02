package day17.step1;

public interface InterfaceTest {

	// 인터페이스 멤버
	// 1. 상수
	//int value1; // *오류 발생 / 인터페이스는 변수를 갖지 못 함
	// (1) 상수 만들기1 : 변수가 아닌 상수로 자동 초기화함
	int value2 = 10;
	// (2) 상수 만들기2 : public static final 키워드를 이용 
	public static final int value3 = 20;
	
	// 2. 추상메소드
	//int method(int a) { } // *오류발생 / 일반 메소드를 갖지 못 함 
	// (1) 추상메소드 만들기1
	int method2(int a);
	// (2) 추상메소드 만들기2
	abstract int method3(int a);
	
}
