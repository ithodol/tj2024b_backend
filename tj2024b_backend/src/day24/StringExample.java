package day24;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		// 1. 변수 = 2개 / 자료 = 1개
			// 리터럴이란? 키보드로부터 입력받은 자료, 상수풀(이미 저장된 값)
		int a = 3;
		int b = 3;
		// 즉, 서로 다른 두 변수는 같은 자료를 참조한다
		
		// 2. 변수 = 2개 / 자료 = 1개
		int c = 5;
		int d = c;
		// 즉, c가 참조하는 5개를 d에 대입. 그러므로 c와 d는 같은 자료를 참조함
		
		// 3. 변수 = 2개 / 자료 = 2개(순수한 자료3, 포장된 인스턴스)
		Integer value1 = 3; // 순수한 자료의 리터럴
		Integer value2 = new Integer(3); // 취소선 : 사용을 권장하지 않음
							// 순수한 자료의 리터럴이 저장된 타입(포장된것(Wrapper))
		System.out.println(value1 == value2); // false		// 리터럴(스택값) 비교 // 값 자체를 비교
		System.out.println(value1.equals(value2)); // true	// 인스턴스 안에 있는 값(힙값) 비교 // 포장된 것 내부의 값 비교

		
		// 4. String 클래스
			// [1] 배열을 이용한 문자열 표현
		char[] str1 = new char[] {'유','재','석'};
			// [2] "" 리터럴을 이용한 문자열 (권장)
		String str2 = "유재석";		// 상수풀(리터럴)의 "유재석"
			// [3] 생성자를 이용한 문자열
		String str3 = new String("유재석");	// 인스턴스의 "유재석"
		
		System.out.println(str2 == str3); // false
		System.out.println(str2.equals(str3)); // true
		String str4 = "유재석";
		System.out.println(str2 == str4); // true
		
		// 5. String 주요 메소드
			// [1] "문자열".concat("문자열")
		String str5 = "자바".concat("프로그래밍");
		System.out.println(str5);
		
			// [2] .append("문자열")
		StringBuilder builder = new StringBuilder();
		builder.append("자바");
		builder.append("프로그래밍");
		System.out.println(builder); // 자바프로그래밍
		
			// [3] .format("형식문자", 값)
		String str6 =  String.format("%s %s", "자바", "프로그래밍");
		System.out.println(str6); // 자바 프로그래밍
		
			// [4] String 변수명 = ""
		String str7 = "";
		str7 += "자바";
		str7 += "프로그래밍";
		System.out.println(str7); // 자바프로그래밍

		// 연산/함수는 무조건 하나의 결과만 도출한다.
		
			// [5] .chartAt(인덱스)
		char gender = "012345-1230123".charAt(7);
		System.out.println(gender); // 1
		
			// [활용] .nextChar() 가 없는 이유 : .next().charAt(0) : 한글자 입력받기 가능
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0); // 입력받은 문자열의 첫글자 추출
		
			// [6] .length()
		System.out.println("012345-1230123".length()); // 14
			// [활용] 반복문 : 변수명.length()-1 => 마지막인덱스 
		//for(int index = 0; index <= 변수명.length()-1; index++) {}
		
			// [7] .replace(기존문자열, 새로우문자열)
		String str8 = "자바프로그래밍".replace("자바", "JAVA");
		System.out.println(str8); // JAVA프로그래밍
			// [활용] html<br/> / java(\n)
		String htmlData = "유재석<br/>안녕하세요.";
		System.out.println(htmlData); // 유재석<br/>안녕하세요
		String javaData = htmlData.replace("<br/>", "\n");
		System.out.println(javaData);
		// 유재석
		// 안녕하세요
		
		// html에서 사용하는 줄바꿈 <br/>이 존재하면 JAVA에서 사용하는 줄바꿈 \n으로 치환하는 방법
		
	
		
		
	} // main end
	
	
}
