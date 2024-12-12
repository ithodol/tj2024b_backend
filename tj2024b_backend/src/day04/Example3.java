package day04;

public class Example3 {

	public static void main(String[] args) {
		
		
		
		// [1] for / 1부터 10까지 더하는 과정
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
		
		
	}

}
