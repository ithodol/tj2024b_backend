package day03; // 클래스가 위치한 패키지명/폴더명

public class Example1 { // 클래스 start
	// 자바는 번역(컴파일)단위를 클래스 단위로 함으로써 모든 코드는 클래스 안에 존재해야 한다.

	public static void main(String[] args) { // main start
		// 번역된(.class 파일)코드를 실행하기 위해서는 main 함수 안에 있어야 실행된다.

		// 연산자 p.71
		
		// [1] 대입연산자, 왼쪽변수 = 오른쪽변수(또는 식)
		int age = 24; // 나이를 의미하는 age변수에 값이 24를 대입.
		
		int mathScore = 10;
		int engScore = 20;
		int totalScore = mathScore + engScore;
		// 수학점수와 영어점수의 값을 더해서 총점을 의하는 변수에 대입.
		
		
		
		// [2] 부호연산자 (+양수, -음수)
		int num = 10;
		System.out.println(+num); // +10 --> 10
		System.out.println(-num); // -10 --> -10 // 부호를 붙여서 출력한 것 뿐, 수정한 것은 아님.
		System.out.println(num); // 10 --> 10
		
		num = -num;
		// 변수 선언 : 타입 변수명 = 값; <선언할 때만 타입명을 씀>
		// 변수호출 : 변수명
		// 변수 수정 : 변수명 = 새로운 값;
		System.out.println(num); // -10 --> -10
		
		
		
		// [3] 산술연산자 (+덧셈, -뺄셈, *곱셈, /나누기, %나머지)
		System.out.println(5/3); // 1.xxxxxx -> 1(몫)	**int / int -> int
		System.out.println(5.0/3.0); // 1.6666666666667 -> 나누기 결과		**double / double -> double
		System.out.println((int)(5.0/3.0)); // 1.666666666666667 강제 타입변환 -> 정수
		
		int math = 90;
		int eng = 70;
		int total = math + eng; // 총점 구하기
		
		double avg = total / 2.0; // 평균 구하기
		System.out.println(avg); // 평균변수의 값을 출력.
		
		// 1분 복습 p.74
//		int kor = 100;
//		int total2 = total + kor;
//		double avg2 = total2 / 3.0;
//		System.out.println(avg2);
		
		int korScore2 = 100;
		int mathScore2 = 90;
		int engScore2 = 80;
		int totalScore2 = korScore2 + mathScore2 + engScore2;
		double avgScore2 = totalScore2 / 3.0;
		// totalScore2(int) / 3(int) --> int
		// totalScore2(int) / 3.0(double) --> double 
			// 왜 3이 아닌 3.0으로 썼는지 생각하기. 소수점을 쓰지 않으면 생략되기 때문
		System.out.println(totalScore2);
		System.out.println(avgScore2);
		
		
		
		//[4] 증감연산자 (++, --) *주의할점 : ;(세미콜론/명령어단위) 기준으로 우선순위를 정한다.
		int num2 = 10;
		int value2;
		value2 = ++num2; // num2 값이 1 증가한 후에 value2 변수에 대입한다.
			System.out.println(value2); // num2 = 11, value2 = 11
		value2 = num2++; // value2 변수에 기존 num2 값이 먼저 대입한 후에 mum2값이 1 증가한다.
			System.out.println(value2); // value2 = 11, num2 = 12
		value2 = --num2; // num2 값이 1 감소한 후에 value2 변수에 대입한다.
			System.out.println(value2); // num2 = 11, value2 = 11
		value2 = num2--; // value2 변수에 기존 num2 값을 먼저 대입한 후에 num2 값이 1 감소한다.
			System.out.println(value2); // value2 = 11, num2 = 10
		
		
		// 예제 p.75
		int gameScore = 150;
		int lastScore = ++gameScore; // 변수 앞에 ++가 있으므로 대입(=)보다 1증가가 우선
		System.out.println(lastScore); // 151
		
		int lastScore2 = --gameScore; // 변수 앞에 --가 있으므로 대입(=)보다 1감소가 우선
		System.out.println(lastScore2); // 150
		
		
		
		// 1분 복습 p.76
//		int lastScore = gameScore++; // 150
//		int lastScore2 = gameScore--; // 151
			
			
		// 사칙연산의 우선순위에 따라 *계산 후 +계산
		int result1 = 3 + 3 * 2;
		System.out.println(result1); // 9
			// 3 * 2 => 6
			// 3 + 6 => 9
			// int result1 =9
		
		int x = 10;
		int y = x-- + 5 + --x;
			// x-- + 5 		-> 10 + 5 => 15 [x는 +연산 후 1차감] x = 9
			// 15 + --x 	-> 15 + 8 => 23 [x는 +연산 전 1차감] x = 8
		System.out.println(x); // 8
		System.out.println(y); // 23
			
			
		// [5] 관계(비교)연산자 (>초과, <미만 >=이상, <=이하, ==같다, !=다르다) 결과는 true 또는 false
		int myAge = 27;
		boolean value = (myAge > 25); // 가독성을 위해 ( )소괄호를 사용함
		System.out.println(value); // true
			
		
		
		
	} // main 함수 end

} // 클래스 end



































