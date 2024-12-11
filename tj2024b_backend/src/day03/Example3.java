package day03;

public class Example3 {

	public static void main(String[] args) {
		// 조건문 p.92
		
		// [1] if문
		int age = 10;
		if(age >= 8) {
			// 만약 age 값이 8 이상이면 출력함수를 실행한다
			System.out.println("학교에 다닙니다.");
		}
		
		// [2] if~else문
		if(age >= 8) { // 만약 age 값이 8 이상이면 "학교에 다닙니다."를 출력하고
			System.out.println("학교에 다닙니다");
		}else { // 아니면(8 이상이 아니면) "학교에 다니지 않습니다"를 출력한다
			System.out.println("학교에 다니지 않습니다");
		}
		
		
		// 1분 복습 p.95
		char gender = 'F';
		if(gender == 'F') { // 만약 gender 값이 F와 같다면 "여성입니다"를 출력하고 
			System.out.println("여성입니다");
		}else{ // 아니면(gender 값이 'F'가 아니면) "남성입니다"를 출력한다
			System.out.println("남성입니다");
		}
		
		
		// 
		
		

	}

}
