package day06;

public class Example4 {

	public static void main(String[] args) {
		
		
		// [1] 클래스 정의하기, 객체를 만들기 위한 일종의 틀/설계도 만들기
		// 생활 속에서 틀/설계도가 필요한 이유?
		// 붕어빵 가게에서 붕어빵 구매 --> 주인이 붕어빵을 손으로 만들기 / 모양이 일정하지 않음 / 오래 걸림
		// 붕어빵 틀을 사용하면 빠르고 일정한 모양으로 붕어빵을 만들 수 있다.
		// 객체 설계도 클래스는 main 함수가 없어도 가능
		// * 클래스 생성하는 방법 : class 클래스명{ }
		
		// [2] 객체 생성하기, 클래스 기반으로 메모리 할당하기 , 인스턴스
		// 붕어빵 2개 주세요 --> 객체 2개 생성
		// * 객체 생성하는 방법 : new 클래스명(); , 클래스명 변수명 = new 클래스명();
		
		new 붕어빵틀(); // 붕어빵1 생성
		new 붕어빵틀(); // 붕어빵2 생성
		
		붕어빵틀 붕어빵1 = new 붕어빵틀(); // 붕어빵3을 생성하고 변수에 담았다
		붕어빵틀 붕어빵2 = new 붕어빵틀(); // 붕어빵4을 생성하고 변수에 담았다
		// [3] 객체의 멤버변수에 접근하기, .(접근연산자)를 이용한 멤버변수를 사용한다.
		붕어빵1.내용물 = "슈크림";
		붕어빵2.내용물 = "팥";
		
		
		
		// [1] 클래스 정의하기, 자동차
		//	만들고자하는 객체가 가질 수 있는 속성들을 구성하여 클래스에 코드로 작성한다.
		
		// [2] 객체 생성하기, 클래스 기반
			// new 클래스명(); / 클래스명 변수명 = new 클래스명();
		new Car(); // 객체 생성 후 변수에 대입하지 않으면 사라진다.
		Car car1 = new Car(); // 주로 객체 생성과 동시에 변수에 담는다.
											// * 변수 타입은 클래스명(타입)으로 한다
		Car car2 = new Car();
		
		// [3] 객체의 멤버변수에 접근하기 
		car1.차종류 = "스팅어";
		car2.차종류 = "머스탱";
		
		
		
		// 생각해보기 : 클래스(예시 제외)를 하나 생성하고 객체 2개 이상 선언하는 코드를 작성하시오.
		
		Game game1 = new Game();
		Game game2 = new Game();
		
		game1.job = "비숍";
		game2.job = "윈브";
		
	
		
		
		
	}

}












