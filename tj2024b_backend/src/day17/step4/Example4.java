package day17.step4;

public class Example4 {

	public static void main(String[] args) {
		
	// [1] customer 인스턴스 생성
	Customer customer = new Customer();
	// 첫글자 대문자 = 클래스명 or 인터페이스
	
	// [2] customer 인스턴스가 Buy 타입 형 변환
	Buy buyer = customer;
	buyer.buy(); // 구매
	
	// [3] customer 인스턴스가 Sell 타입 형 변환
	Sell seller = customer; // (업)캐스팅
	seller.sell(); // 판매
	
	// [4] 변수명 instanceof 타입 : 변수가 참조하는 인스턴스의 타입 조회  
	if(seller instanceof Customer) { // true
		Customer customer2 = (Customer)seller; // (다운)캐스팅
		customer2.buy(); // 구매
		customer2.sell(); // 판매
	}
	
	}
	
	
}
