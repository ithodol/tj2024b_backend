package day13;

public class Company {
	// 단계1 : private 디폴트 생성자 선언
	private Company() {}
	// 단계2 : 클래스내부에 static 인스턴스 선언/생성
	private static Company instance = new Company();
						//	-변수명-
		// 클래스내부에 미리 객체 생성
		// static 이라서 프로그램 시작시 객체가 생성됨
		// private 이라서 다른 클래스에서 접근 불가능
	
	// 단계3 : 외부에서 참조할 수 있는 public 메소드 선언
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance; // static 이라서 this 쓸 필요 없음
	}
		// 내부에 만든 객체를 다른클래스(외부)에서 접근할 수 있도록 public 으로 만듦
		// static 이므로 프로그램 시작시 메소드가 할당됨
		// return instance 하므로써 내부에 미리 만든 (싱글톤)객체를 반환함
	
	public void method() {	}
	
} // class Company end
