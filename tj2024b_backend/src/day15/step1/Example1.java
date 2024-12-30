package day15.step1;

// [1] 동물 클래스
class 동물{
	// 멤버변수
	String myName;
	// 생성자
	동물(){
		myName = "동물";
		System.out.println("[동물 생성자 탄생]");
	}
	// 메소드
	void showMe() {
		System.out.println("myName : " + this.myName);
	}
} // class 동물 end

// [2] 조류 클래스, 동물 클래스로부터 상속받기
class 조류 extends 동물{
	// 생성자
	조류(){
		myName = "조류";
		System.out.println("[조류 생성자 탄생]");
	}
} // class 조류 end

// [3] 참새 클래스, 참새클래스는 조류 클래스로부터 상속받기
class 참새 extends 조류{
	참새(){myName = "참새";
		System.out.println("[참새 생성자 탄생]");
	}
} // class 참새 end

// [4] 닭 클래스, 닭 클래스는 조류 클래스로부터 상속받기
class 닭 extends 조류{
	닭(){
		myName = "닭";
		System.out.println("[닭 생성자 탄생]");
	}
}




public class Example1 {
	public static void main(String[] args) {
		// 1. 동물 객체(인스턴스) 생성
		동물 animal = new 동물(); animal.showMe(); // 결과 : [동물 생성자 탄생], myName : 동물
		// 2. 조류 객체(인스턴스) 생성
			// **** 하위 클래스의 인스턴스를 생성하면 상의 클래스의 인스턴스도 같이 생성된다 ****
		조류 bird = new 조류();	bird.showMe(); // 결과 : [동물 생성자 탄생], [조류 생성자 탄생], myName : 조류
		// 3. 참새 객체(인스턴스) 생성
			// **** 하위 클래스의 생성자를 호출하면 상위 클래스의 생성자도 같이 호출된다 ****
		참새 sparrow = new 참새(); sparrow.showMe(); // 결과 : [동물 생성자 탄생], [조류 생성자 탄생], [참새 생성자 탄생], myName : 참새

		// [타입변환]
			// 참새는 동물과 조류가 될 수 있다.
			// 즉, 자식 타입의 자료는 부모 타입으로 자동 변환 가능 / 자식 객체는 부모타입을 참조한다. 
		조류 bird2 = sparrow;
		// 참새 타입의 자료(객체)가 조류 타입으로 변환된다. (자동타입변환)
		동물 animal2 = sparrow;
		// 참새 타입의 자료(객체)가 동물 타입으로 변환된다. (자동타입변환)
		Object obj2 = sparrow;
		// 참새 타입의 자료(객체)가 Object 타입으로 변환된다. (자동타입변환)
			// 동물은 조류와 참새가 될 수 없다.
			// 즉, 부모 타입의 자료는 자식 타입으로 변환 불가능 / 왜? 부모 객체는 자식 타입을 참조하지 않는다.
		
		//참새 sparrow2 = animal; *오류발생* // 동물 타입의 자료(객체)가 참새 타입으로 변환 불가능
		//조류 birds3 = animal; *오류발생* // 동물 타입의 자료(객체)가 조류 타입으로 변환 불가능
			// *캐스팅 : 가능한 전제조건은 본래 하위 타입의 객체가 상위 타입에서 다시 본래 하위 타입 변환 허용
				// 부모 타입의 자료는 자식 타입으로 변환이 될 수 없지만, 객체가 본래 자식 타입의 객체였다면 가능함
		
		동물 animal3 = sparrow; // 참새 타입의 객체를 동물 타입으로 변환
		참새 sparrow3 = (참새)animal3; // 동물 타입은 참새 타입으로 변환 가능. 단, 객체가 본래 자식 타입이었다면 캐스팅() 활용하여 변환 가능
		
			// 형제간의 타입변환은 불가능.
		닭 chicken1 = new 닭(); // 인스턴스 4개 생성
		// 참새 sparrow5 = (참새)chichen1; *오류발생 // 닭은 참새를 모른다
		
	} // main end
}
























