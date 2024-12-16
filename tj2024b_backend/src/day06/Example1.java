package day06;

import java.util.Scanner;

/*
	자바 과제3 : 식당 대기번호 발행 프로그램
		- 문법 : 변수, 연산자, 제어문(조건문/반복문) 
		- 전화번호, 인원수를 입력받아 저장/출력 구현
		- 총 대기명단은 3개까지 가능
			대기명단 1개당 전화번호/인원수 저장소(변수) 2개 필요
			대기명단3 => 변수 6개 필요
*/


public class Example1 {

	public static void main(String[] args) {
		
		// [5] 각 연락처와 인원수를 각 3개를 저정할 변수를 초기화함
		//		각 사용자에게 입력받은 값들을 저장할 변수를 선언
		String phone1 = null;	int count1 = 0;
		String phone2 = null;	int count2 = 0;
		String phone3 = null;	int count3 = 0;
		
		
		while(true) { // [1] 무한반복문
			// [2] 출력함수 프로그램의 메뉴 메세지 출력
			
			System.out.print("1.대기등록 2.대기현황 : "); // print()함수를 이용하여 사용자에게 등록과 출력 메뉴를 보여준다
			
			// [3] 입력함수 Scanner 객체 필요
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt(); //nextInt() 함수 이용하여 정수타입을 입력받아 정수타입 변수에 저장했다
			
			// [4] 조건문 논리 연산에 따른 제어
			// if(흐름조건), 입력받은 값(메뉴선택)에 따른 흐름제어 (1이면, 2이면)
			if(choose == 1) {System.out.println(">> 대기명단 등록 <<");
			
				// [5] 각 사용자에게 필요한 데이터 입력받기
				System.out.print("전화번호 : ");		String phone = scan.next();
				System.out.print("인원수 : ");		int count = scan.nextInt();
				
				// [6] 만약 비어있는 명단이 있으면 각 입력받은 데이터를 비어있는 변수에 대입한다. 비어있다. / 문자열 = null, 숫자 = 0으로 판단함
				if(phone1 == null) {phone1 = phone; count1 = count;}
				else if(phone2 == null) {phone2 = phone; count2 = count;}
				else if(phone3 == null) {phone3 = phone; count3 = count;}
			}else if(choose == 2) {System.out.println(">> 대기명단 현황 <<");}
				// [7] 만약 비어있지 않으면 각각 변수값 호출
				if(phone1 != null) {System.out.printf("인원수 %d명, 연락처 : %s \n", count1, phone1);}
				if(phone2 != null) {System.out.printf("인원수 %d명, 연락처 : %s \n", count2, phone2);}
				if(phone3 != null) {System.out.printf("인원수 %d명, 연락처 : %s \n", count3, phone3);}
		}


			
	}
		
		
		
	
		
		
	}
		
		

