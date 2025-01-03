package day18.step1_예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example3 {

	// [1] 메소드 내부의 예외를 호출했던 곳으로 떠넘기기(미루기)
	public static Class loadClass(String fileName, String className)
			throws FileNotFoundException, ClassNotFoundException{
		// 접근제한자 반환타입 메소드명(타입 매개변수) throws 예외클래스명{}
		
		// 예외 처리 방법 2가지 : 1.try~catch 	2.throws
		FileInputStream fis = new FileInputStream(fileName); // 일반예외 발생
		Class c = Class.forName(className); // 일반예외 발생
		return c;
	}
	
	// [2] 메소드 내부 예외 던지기
	public static void method() {
		String str = null;
		System.out.println(str.length()); // *오류예측 : null 은 메소드를 호출할 수 없다
		// 예측 안 된다 -> 코드실행 -> 예외 확인 -> 예외처리	
	}
		// static : 프로그램이 실행될 때 static 키워드가 존재하는 변수와 메소드는 메모리에 우선 할당되고 프로그램이 종료되면 사라진다
		// -> 정적 : 메모리 고정, static vs 동적 : 인스턴스, new(생성), CG(참조 당하지 않으면 자동 삭제)
		// -> 인스턴스가 없어도 이미 메모리(실체)가 존재하므로 바로 사용 가능. static 없는 변수나 메소드는 인스턴스(메모리/실체)가 필요하다
	
	// static 을 빼면 실체가 없기 때문에 오류 발생.
	// -> new 로 실체를 만들어서 메소드로 호출하면 해결 // 38줄: new Example3().method();
	
	public static void main(String[] args) {
		// 1. 메소드 호출 / 예외처리 발생 : 호출한 메소드가 throws 이용하여 메소드 내부 예외를 반환했기 때문에
		try {
			loadClass("a.txt", "java.lang.String");
		}catch(FileNotFoundException e) {System.out.println(e);}
		catch(ClassNotFoundException e) {System.out.println(e);}
		// 2. 메소드 호출
		//method(); // NullPointerException
		try {
			method();
		}catch(NullPointerException e) {System.out.println(e);}
		
	} // main end
}
