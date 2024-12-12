package day04;

public class Example2 {

	public static void main(String[] args) {

		// while
		/*
			 while(조건식){
			 	실행문
			 }
			 - 조건식이 true면 {}안에 있는 실행문이 실행된다		 
		*/
		
		// [1] while문을 활용하여 1부터 10까지 더하기
		int num = 1; // 초기값
		int sum = 0; // = 0 미입력시 *오류*
		// int sum; 변수가 참조 또는 가지고 있는 값이 없다. 정수가 없는 것과 0은 다르다.
		// 임의값(초기값이 없는 상태)(타입x) / 0(정수타입) / null(참조타입) / ''(char타입) / ""(String타입)
		// 변수에 0을 대입하지 않으면 초기값이 없으면 임의값은 연산이 불가능하다.
		
		while(num <= 10) { // 조건문 / 만약 num이 10 이하면 반복처리.
			sum = sum + num;	// sum += num
			num++;				// 증감식 / num = num + 1  // num 1증가 
		}
		System.out.println("[while] 1부터 10까지의 합은 " + sum);
		
		
		
		// [1-2] for문 활용
		int sum2 = 0;
		for(int num2 = 1; num2 <= 10; num2++) {
			//    초기값		조건문		증감식
			sum2 += num2;
		}
		System.out.println("[for] 1부터 10까지의 합은 " + sum2);
		
		
		
		
		// [2] while문이 무한히 반복되는 경우 : 무한루프 / 조건식에 상수 true
		// while(true) {
		//		System.err.println("[while] 쇼핑몰 24시간 실행중");
		// }
		
		// for(;;) {
		//		System.out.println("[for] 쇼핑몰 24시간 실행중");
		// }
		
		
		
		// [3] do ~ while
		int num3 = 1;
		int sum3 = 0;
		
		do { // 먼저 실행 후, 선 처리
			sum3 += num3;
			num3++;
		}while(num <= 10); // 실행 후 조건 검사, 후 검사
		
		System.out.println("[do-while] 1부터 10까지의 합은 " + sum3 + "입니다");
		
		
		
		// [4] 구구단 2단 출력하시오.
		// 		- while 과 do~while문으로 구현하기
		
		// [4-0] 반복문 없이
		System.out.println("[반복문x] 2 x 1 = " + (2*1));
		System.out.println("[반복문x] 2 x 2 = " + (2*2));
		System.out.println("[반복문x] 2 x 3 = " + (2*3));
		System.out.println("[반복문x] 2 x 4 = " + (2*4));
		System.out.println("[반복문x] 2 x 5 = " + (2*5));
		System.out.println("[반복문x] 2 x 6 = " + (2*6));
		System.out.println("[반복문x] 2 x 7 = " + (2*7));
		System.out.println("[반복문x] 2 x 8 = " + (2*8));
		System.out.println("[반복문x] 2 x 9 = " + (2*9));
		// 반복되는 코드 : System.out.println("2 x ? = " + (2*?));
		// 반복되지 않는 코드 : 1 ~ 9 1씩 증가
		
		
		// [4-1] while
		int 곱 = 1; // 초기값
		while(곱 <= 9) { // 조건식
			// System.out.println("2 x " + 곱 + "="  + (2*곱));
			System.out.printf("[while] 2 x %d = %d \n",곱, (2*곱));
			곱++;
		}
		
		
		// [4-2] do~while
		int 곱2 = 1; // 초기값 / 선 실행
		do { 
			System.out.printf("[do ~ while] 2 x %d = %d \n",곱2, (2*곱2));
			곱2 ++; // 증감식
		}while(곱2 <= 9); // 조건식 / 후 조건검사
		
		
		
		// [4-3] for **권장**
		for( int 곱3 = 1; 곱3 <= 9; 곱3 ++) {
			System.out.printf("[for] 2 x %d = %d \n",곱3, (2*곱3));
		}
		


	}

}









