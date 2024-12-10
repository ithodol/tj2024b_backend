package day01;


public class Example2 {

	public static void main(String[] args) {
		

		// 자료형/타입/분류 : 데이터를 나누는 방법
		/*
		  - 자바 기본 타입
		  [논리]
		  		boolean		1바이트	true 혹은 false
		  
		  
		  [문자]
		  		char		2바이트	유니코도, 작은따옴표로 감싼 문자		'A'
		  	객체 (X)String	n바이트	문자열클래스, 큰따옴표로 감싼 문자열	"ABC"
		  
		  
		  [정수]
		  		byte		1바이트		-128 ~ +127 저장 
		  		short		2바이트		+-3만정도 저장
		  		int			4바이트		+-21억정도 저장 	리터럴정수(키보드로 입력한 정수), 정수 중에 기본 타입(모두 int)
		  		long		8바이트		+-21억이상 정도	리터럴 뒤에 L을 붙이면 저장 가능(리터럴은 int이므로 long에 대입 불가)
		  
		  
		  [실수, 부동 소수점]
		  		float		4바이트		소수점 8자리 표현
				double		8바이트		소수점 17자리 표현
		
			** 왜 타입을 여러가지로 구분해서 범위에 맞게 사용해야 하는가?
				메모리를 효율적으로 적절하게 선택하여 사용하기 위함
				박스는 크고 데이터는 적으면 공간 낭비잖슴
		*/
		
		
		// 1. boolean 타입은 true와 false만 저장할 수 있다.
		boolean bool1 = true;
		System.out.println("bool1 : " + bool1); // + 연결 연산자, "문자열" + 변수호출값
		// boolean bool2 = 3; *오류* boolean타입에 숫자를 저장할 수 없다.
		boolean bool3 = false; System.out.println("bool3 : " + bool3);
		
		
		// 2. char 타입은 작옴따옴표를 이용한 문자 1개만 저장할 수 있다.
		char ch1 = 'A';
		System.out.println("ch1 : " + ch1);
		// char ch2 = 'ABC'; *오류* 문자 1개만 저장 가능, 여러개 저장 불가
		// char ch3 = "ABC"; *오류* char는 큰따옴표를 사용할 수 없다.
		
		
		// 3. String 클래스타입 (기본 타입은 아님 / 객체임) 큰따옴표를 이용해 문자 여러개를 저장할 수 있다.
		String str1 = "ABC";
		System.out.println("str1 : " + str1);
		// String str2 = 'ABC'; *오류* 문자 여러개는 큰따옴표로 감싸야 한다.
		
		
		// 4. byte 타입은 -128 ~ +127까지 저장 가능하다.
		byte b1 = 100;
		System.out.println("b1 : " + b1);
		// byte b2 = 300; *오류* (127 이상)저장 허용범위를 벗어났기 때문
		
		
		// 5. short 타입은 대략 +- 3만정도 저장 가능하다.
		short s1 = 32000;
		System.out.println("s1 : " + s1);
		// short s2 = 40000; *오류* (3만 이상) 저장 허용범위를 벗어났기 때문
		
		
		// 6. int 타입은 대략 +-21억정도 저장 가능하다.
		int i1 = 2100000000;
		System.out.println("i1 : " + i1);
		// int i2 = 3000000000; *오류* (21억 이상) 저장 허용범위를 벗어났기 때문
		
		
		
		// 7. long 타입은 대략 +-21억이상 저장 가능하다.
		long lo1 = 3000000000L;
		System.out.println("lo1 : " + lo1);
		// long lo2 = 4000000000; *오류* 리터럴 값은 int이므로 long에 대입할 수 없다.
		
		
		
		// 8. float 타입은 소수점 8자리가지 표현, 실수 리터럴 값 뒤에 F를 붙이면 저장 가능
		// float f1 = 0.123456789123456789; *오류* 실수 리터럴값은 double이므로 float에 대입할 수 없다.
		float f2 = 0.123456789123456789F;
		System.out.println("f2 : " + f2);
		
		// 9. double 타입은
		double d1 = 0.123456789123456789;
		System.out.println("d1 : " + d1);
	}

}



















