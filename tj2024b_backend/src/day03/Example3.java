package day03;

public class Example3 {

	public static void main(String[] args) {
		// 조건문 p.92
		
		// [1] if
		int age = 10;
		if(age >= 8) {
			// 만약 age 값이 8 이상이면 출력함수를 실행한다
			System.out.println("학교에 다닙니다.");
		}
		
		// [2] if ~ else
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
		
		
		// [3] if ~ else if
		int charge;
		if( age < 8) { // 만약 age 값이 8 미만이면
			charge = 1000;
			System.out.println("미취학 아동입니다");
		}else if(age < 14) { // 아니고 age 값이 8 초과이면서 14미만이면
			charge = 2000;
			System.out.println("초등학생입니다");
		}else if(age < 20) { // 아니고 age 값이 14초과이면서 20미만이면
			charge = 2500;
			System.out.println("중.고등학생입니다");
		}else if(age >= 60 ) {
			charge = 0;
			System.out.println("경로우대입니다 " + "입장료는 " +charge+ "원입니다");
		}else { // 그 외 나머지 모두
			charge = 3000;
			System.out.println("성인입니다");
		}
		System.out.println("입장료는 " +charge+ "원입니다.");
		
		
		
		// 1분 복습 p.98
		// age >= 60 조건 추가↑. 경로우대, 입장료 안내 추가 출력 

		
		
		// if ~ else if 와 if if 의 차이점
		// if ~ else if (다수 조건에 따른 하나의 결과)
		// if if (다수 조건에 따른 N개의 결과실행문)
		
		
		
		// 나 혼자 코딩 p.100
		// 90 <= 성적 <=100 --> 불가능.
		// 2개 이상의 조건은 논리연산자를 사용 --> 성적 >=90 && 성적 <=100
		int score = 78; // 성적 (임의값 사용)
		char grade; // 등급;
		
		if(score >= 90) { // 만약 score 값이 100~90 이면 (score <= 100 && score >= 90)
			grade = 'A';
		}else if(score >= 80) { // 아니고 score 값이 89~80 이면 (score <= 89 && score >= 80)
			grade = 'B';
		}else if(score >= 70) { // 아니고 score 값이 79~70 이면 (score <= 79 && score >= 70)
			grade = 'C';
		}else if(score >= 60) { // 아니고 score 값이 69~60 이면 (score <= 69 && score >= 60)
			grade = 'D';
		}else { // 그 외 모두
			grade = 'F'; 
		}
		System.out.println(score);
		System.out.println(grade);
		
		
		// 1분 복습 p.100 
		grade=(score >= 90) ? 'A' : 'B';
		
		
		
	}

}














