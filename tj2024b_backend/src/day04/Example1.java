package day04;

public class Example1 {

	public static void main(String[] args) {
		
		// switch p.102
		/*
		 	- 형태
		 	switch(조건/조건검사대상){
		 		case 값 : 
		 			실행문;
		 			break;
		 	}
		 	
		 	- break : switch 종료
		 		만일 break가 없다면 아래 case의 실행문이 실행됨
		 		일반적으로 switch와 함께 사용됨	 
		 */
		
		
		// 예제1
		int ranking = 1;
		char medalColor;
		
		switch(ranking) { // switch(조건) {case 값1 : 실행문;}
			case 1 :
				medalColor = 'G';
				break; // switch 종료
			case 2 : 
				medalColor = 'S';
				break; // switch 종료
			case 3 : 
				medalColor = 'B';
				break; // switch 종료
			default : 
				medalColor = 'A';
		}
		System.out.println("메달의 색깔은? " + medalColor);
		
		
		
		// 예제2 p.104
		// - 각 월마다의 일수를 정하는 코드 / case 동시에 사용하기
		int month = 10;
		int day;
		switch(month) {
			case 1 :
			case 3 : 
			case 5 : 
			case 7 : 
			case 8 :
			case 10 :
			case 12 : // month가 1 3 5 7 8 10 12 경우에 아래 코드가 실행된다 
				day = 31;
				break; // 아래 코드가 실행되지 않고 switch 종료
			case 4 :
			case 6 : 
			case 9 : 
			case 11 :
				day = 30;
				break;
			case 2 :
				day = 28;
				break;			
		}
		
		
		
		// 예제3 p.105
		// '메달' 문자열에 따른 메세지 출력코드 / case문에 문자열 사용하기
		String medal = "Gold";
		switch(medal) {
			case "Gold" : 
				System.out.println("금메달입니다");
				break;
				
			case "Silver" : 
				System.out.println("은메달입니다");
				break;
				
			case "Bronze" : 
				System.out.println("동메달입니다");
				break;
				
			default : 
				System.out.println("메달이 없습니다");
				break; // 생략가능
		}
		
		
		
		// 예제4 책x
		// if =  조건결과의 논리(t/f) 제어,
		// switch =  조건결과의 값(value case)제어
			int score = 80;
			// switch(score >= 80){ } *오류* : 조건문에 논리연산, 비교연산에 따른 논리결과 케이스가 아님
			// switch(score) {
			//	case score >= 80 : 
			//		System.out.println("합격"); *오류*
			// }
		
		
		
		// 나 혼자 코딩 p.106
		String L = "5층";
		switch(L) {
			case "1층" : 
				System.out.println("1층. 약국입니다");
				break;
			case "2층" : 
				System.out.println("2층. 정형외과입니다");
				break;
			case "3층" : 
				System.out.println("3층. 피부과입니다");
				break;
			case "4층" : 
				System.out.println("4층. 치과입니다");
				break;
			case "5층" : 
				System.out.println("5층. 헬스 클럽입니다");
				break;
		}
		
		
	}

}
