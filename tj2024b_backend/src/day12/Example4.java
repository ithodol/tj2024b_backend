package day12;


class Member{
	
	String name;
	static int age;
	
	boolean getAge() {return true;}
	static int getName() {return 10;}
	
}

public class Example4 {	
	
	// 함수 호출 판단
		// 1. 호출하고자 하는 메소드가 같은 클래스인지 다른 클래스인지?
		// 2. 호출하고자 하는 메소드가 static(정적)인지 아닌지?
		// 3. 호출하고자 하는 위치의 메소드가 static(정적)인지 아닌지?
			// 내부메소드 : 메소드명();
			// 외부메소드
			// 		** static 없는 메소드는 객체를 통해 호출		/ 변수명(첫글자소문자).메소드명();
			// 		** static 있는 메소드는 클래스를 통해 호출	/ 클래스명(첫글자대문자).메소드명();
	
	
	// static 정적메소드
	public static void main(String[] args) {
		
		// [1] 정적(main) 메소드 안에서 동일한 클래스 내부 메소드 호출하기
		// signup(); => 불가능. // main 함수가 우선 할당되므로 signup 함수를 모름
			// 해결방안
		Example4 example4 = new Example4();
		example4.signup();
		
		// [2] 정적(main) 메소드 안에서 동일한 클래스 static 내부 메소드 호출하기
		login(); // => 가능. // main 함수가 우선 할당되고 login 함수도 우선할당(static)이므로 호출 가능
			// --> 다른 클래스 static 메소드이면
		Member.getName();
		
		// [3] 메소드 안에서 동일한 클래스 내부 메소드 호출하기
		// 함수명();	=> 가능. // 동일한 멤버함수들끼리는 호출 가능
		
		// [4] 메소드 안에서 서로 다른 클래스의 메소드 호출하기
		// 클래스명 변수명 = new 생성자();  객체 생성 --> 변수명.함수명();
		
		
	} // main end
	
	// 메소드
	void signup(){ // 멤버함수/메소드
		myInfo(); // 같은 클래스 메소드
		//getAge(); => 불가능.
		Member member = new Member();
		member.getAge(); // 서로 다른 클래스면 객체가 필요함
	}
	
	void myInfo() { }
	
	// 정적메소드
	static void login() {
		
	} 
	
	
} // class Example4 end
