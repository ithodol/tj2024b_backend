package day07;

import java.util.Scanner;

/*
	자바 과제5 : 식당 대기번호 발행 프로그램
	- 문법 : 변수, 연산자, 제어문(조건문/반복문), 클래스(멤버변수)/객체
	- 전화번호, 인원수를 입력받아 저장/출력 구현
	- 명단 클래스를 설계한다
	- 총 대기명단은 3개까지 가능
*/


// main 함수를 갖는 실행 클래스
public class Example1 {
	public static void main(String[] args) {
		// 클래스 정의하기, 객체를 담을 변수 선언
			// 정수 3을 담기 위해서는 int 타입 사용
			// Food 객체를 담기 위해서는 Food 변수 타입 사용
		Food Food1 = null;
		Food Food2 = null;
		Food Food3 = null;
		
		// 출력
		while(true) {System.out.println("1.명단등록 2.명단현황");
		
		// 입력
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		// 조건문
		if(choose == 1) {
			System.out.println("전화번호 : "); String phone = scan.next();
			System.out.println("인원수 : "); int count = scan.nextInt();
			// [6] 객체 생성 후 입력받은 값 대입
			Food Food = new Food(); // 대기명단 객체 생성
			Food.phone = phone; Food.count = count; // 대기명단 객체 내 입력받은 값 대입
			if(Food1 == null) { // 만약 비어있는 대기명단이 있으면 객체 생성 후 대입
				Food1 = Food; // 대기명단 객체를 while 밖 변수에 대입한다
			}else if(Food2 == null) { // 만약 두번째 대기명단이 비어있으면
				Food2 = Food; // 대기명단 객체를 while 밖 변수에 대입한다
			}else if(Food3 == null) { // 만약 세번째 대기명단이 비어있으면
				Food3 = Food; // 대기명단 객체를 while 밖 변수에 대입한다
			}
		} // if end
		
		else if(choose == 2) {
			if(Food1 != null) {
				System.out.printf("인원수 %d명, 연락처 : %s \n", Food1.count, Food1.phone);
			}
			if(Food2 != null) {
				System.out.printf("인원수 %d명, 연락처 : %s \n", Food2.count, Food2.phone);
			}
			if(Food3 != null) {
				System.out.printf("인원수 %d명, 연락처 : %s \n", Food3.count, Food3.phone);
			}
		} // else if end

		} // while end
		
		

	} // main end
} // class end
