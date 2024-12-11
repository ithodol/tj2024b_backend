package day03;

public class Example2 {

	public static void main(String[] args) {

		// 연습문제 p.88
		
		
		// 1.
		int myAge = 23; // (1-1) =
		int teacherAge = 38;
				
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge); // (1-2) ==
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F'; // (1-3) ?  (1-4) :
		System.out.println(ch);
		
				
		// 2.
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num); // 10
		
		
		// 3.
		int num2 = 10;
		System.out.println(num2); // 10
		System.out.println(num2++); // 10
		System.out.println(num2); // 11
		System.out.println(--num2); // 10
		
		
		// 4.
		int num3 = 10;
		int num4 = 20;
		boolean result;
		
		result = ((num3 > 10) && (num3 > 10)); // 두 조건 모두 만족해야함
					// false 이면서 true
		System.out.println(result); // false
		
		result = ((num3 > 10) || (num4 > 10)); // 둘 중 하나만 만족해도 됨
					// false 이거나 true
		System.out.println(result); // true
		
		System.out.println(!result); // false // !부정 => 값의 반대
		
		
		
		
		// 5. (생략.비트연산자)
		
		
		
		
		// 6.
		int num5 = 8;
		
		System.out.println(num5 += 10); // 18
		System.out.println(num5 -= 10); // 18-10 => 8
		
		
		// 7.
		int num6 = 10;
		int num7 = 20;
		
		int result2 = (num6 >= 10) ? num7 + 10 : num7 - 10;
						// 만약 num6 값이 10 이상이면 num7 값에 +10, 아니면 num7 -10을 대입
						// 조건 만족함 true => num7 값에 +10
		System.out.println(result2); // 30
		
		
		
		
	}

}
