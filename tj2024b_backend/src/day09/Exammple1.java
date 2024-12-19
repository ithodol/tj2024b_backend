package day09;

import java.util.Scanner;

/*
	자바 과제8 : 식당 대기번호 발행 프로그램
	- 문법 : 변수, 연산자, 제어문(조건문/반복문), 클래스(멤버변수)/객체, 배열, 메소드
	- 전화번호, 인원수를 입력받아 저장함수, 출력함수 구현
	- 명단 클래스를 설계한다
	- 총 대기명단은 100개까지 가능
	제출 : 카카오톡 git주소
*/


public class Exammple1 {

	public static void main(String[] args) {
		// *** 기능 제공 객체 생성
		WaitingService ws = new WaitingService();
		// *** 배열 생성
		Waiting[] waitings = new Waiting[100];
		
		while(true) {
			System.out.println("1.명단등록 2.명단출력");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if(choose == 1) {
				ws.waitingAdd(scan, waitings);
			}
			else if(choose == 2){
				ws.waitingPrint(waitings);
			}
		} // while end
		
	} // main end

	


//	public static void main(String[] args) {
//		
//		WaitingService ws = new WaitingService();
//		
//		Waiting[] waitingList = new Waiting[100];
//		
//		
//		while(true){
//			System.out.println("1.대기등록 2.대기현황");
//			Scanner scan = new Scanner(System.in);
//			int choose = scan.nextInt();
//			if(choose ==1) {
//				ws.WaitingChoice(scan, waitingList);
//			}else if(choose ==2){
//				
//			}
//			
//		} // while end
//		
//	} // main end
	
	
} // class end
	

