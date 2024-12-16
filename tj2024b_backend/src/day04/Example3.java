package day04;

public class Example3 {

	public static void main(String[] args) {
		
		
		
		// [1] for
		// 1부터 10까지 더하는 과정
		int sum = 0;
		sum += 1; sum += 2; sum += 3; sum += 4;  sum += 5;
		sum += 6; sum += 7; sum += 8; sum += 9;  sum += 10;
			// - 반복 : sum +=
			// - 반복 x : int sum = 0; 1~10
			// - 패턴/규칙 : 1~10 1씩 증가 반복
		int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			sum2 += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum2);
		
		
		// 나 혼자 코딩 p.114
		// 반복문 없이
		System.out.println("안녕하세요1");
		System.out.println("안녕하세요2");
		System.out.println("안녕하세요3");
		// ...
		
		// 반복 : System.out.println("안녕하세요?");
		// 반복 x : 1~10
		
		// 반복문 for
		for(int i2 = 1; i2 <= 10; i2++) {
			System.out.println("안녕하세요" + i2);
		}
		
		
		
		// 구구단 작성 (손코딩 테스트)
		for(int d = 2; d <=9; d++) { // 단 
			for(int g = 1; g <= 9; g++) { // 곱
				System.out.printf("%d x %d = %d \n",d, g, (d*g));
			}
		}
		
		
		for(int 단 = 2; 단 <=9; 단++) {
			for(int 곱 = 1; 곱 <= 9; 곱++) {
				System.out.printf("%d x %d = %d \n",단, 곱, (단*곱));
			}
		}
		
		
		
		
		// 1분 복습 p.118
		// 구구단 3단 ~ 7단 출력
		for(int dan = 3; dan <= 7; dan++ ) {
			for(int times = 1; times  <= 9; times++) {
				System.out.println(dan + " x " + times + " = " + dan*times );
			}
		}
		
		
		
		// [2] continue : 이후의 문장은 수행하지 않고 for문의 증감식으로 이동한다.
		// 1~100 홀수값들의 누적 합계
		int total = 0;
		for(int num = 1; num <= 100; num++) {
			if(num % 2 == 0) { // 만약 현재 반복되는 변수값(num)에 나누기 2 했을 때 0이면(짝수)
				continue;				
			} // if end
			total += num;
		} // for end
		System.out.println("1부터 100까지 홀수의 합 : " + total);
		
		
		
		
		
		// [3]break : 가장 가까운 for/switch{ }을 탈출/종료 한다.
		int sum3 = 0;
		for(int num = 0; ; num++) {
			sum3 += num;
			if(sum3 >= 100) { // 만약 sum3이 100 이상이면 반복문 탈출/종료 한다.
				break;
			}
		}
		
		
		
		// 연습문제 p.123
		// 1.
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
			// 1-1. if-else 
			if(operator == '+') {
				System.out.println(num1 + num2);
			}else if(operator == '-') {
				System.out.println(num1 - num2);
			}else if(operator == '*') {
				System.out.println(num1 * num2);
			}else if(operator == '/') {
				System.out.println(num1 / num2);
			}
			
			
			// 1-2. switch-case 
			// switch 문에서 논리연산(t/f) x --> 검사(==) o
			switch(operator) {
				case '+' : 
					System.out.println(num1 + num2);
					break;
				case '-' : 
					System.out.println(num1 - num2);
					break;
				case '*' : 
					System.out.println(num1 * num2);
					break;
				case '/' : 
					System.out.println(num1 / num2);
					break;
			}
		
		
		
		
		// 2.
		int total2 = 0;							// 단과 곱을 곱한 결과를 저장하는 변수 = i
			for(int i = 2; i <= 9; i++) {		// i = 단, 2부터 9까지 1씩 증가 반복
				for(int j = 1; j <= 9; j++) {	// j = 곱, 1부터 9까지 1씩 증가 반복
					if(i % 2 != 0) {			// 만약 단이 홀수이면
						continue;				// continue -> for 증감식으로 이동
					}
					total2 = i * j;				// 단이 짝수인 경우에만 실행되는 코드
					System.out.println(i + " x " + j + " = " + total2);
				}
			}
		
		
		
		// 3. 단보다 곱하는 수가 작거나 같은 경우에만.
		int 단1; 
		int 곱1;
		
		for(단1 = 2; 단1 <= 9; 단1 ++) { 
			for(곱1 = 1; 곱1 <= 9; 곱1++) {
				if(단1 < 곱1) { // 만약 단이 곱보다 작으면 break(가장 가까운 반복문 종료 -> 곱 for 종료 -> 단 증감식으로 이동) 
					break;
				}System.out.println(단1 + " x " + 곱1 + " = " + 단1*곱1);
			}
		}
		
		
		
		
		
		// 4.
		
		 
		
		
		
		
				
		
		// 5.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
