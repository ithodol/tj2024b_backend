package day08;

import java.util.Scanner;

import day08.Waiting;

/*
 	자바 과제7 : (식당)대기번호 발행 프로그램
 	- 문법 : 변수, 입출력함수, 연산자, 제어문(조건문/반복문), 클래스(멤버변수)/객체, 배열
 	- 전화번호 인원수를 입력받아서 저장/출력 구현
 	- 명단 클래스 설계
 	- 총 대기명단은 100개까지 가능
 	제출 : 카톡 git 주소 제출 
*/

public class Example1 {

	public static void main(String[] args) {
		
//		Waiting wait1 = null;	Waiting wait2 = null;	Waiting wait3 = null;
		// (변경사항1) 대기명단 객체가 3개가 아닌 이상 100개로 변경되므로 배열을 사용하는 것이 효율적임.
		Waiting[] waitingArray = new Waiting[100];
		
		while(true){
			System.out.print("1.명단등록 2.명단확인 : ");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if( choose == 1 ) {  
				System.out.print("전화번호 : "); 	String phone = scan.next();
				System.out.print("인원수 : ");	int count = scan.nextInt();
				
				Waiting waiting = new Waiting();
				waiting.phone = phone; waiting.count = count;
//				if( wait1 == null ) { 
//					wait1 = waiting; 
//				}else if( wait2 == null ) { 
//					wait2 = waiting;
//				}else if( wait3 == null ) { 
//					wait3 = waiting;
//				}
				// (변경사항2) 대기명단 객체 3개에서 빈 객체 찾기 if 3번, 객체 100개면 if 100개 사용? => 비효율적임.
				for(int index = 0; index <= waitingArray.length-1; index++) {
					if(waitingArray[index] == null) {waitingArray[index] = waiting; break;}
				} // for end
			}else if( choose == 2) {
//				if( wait1 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait1.count , wait1.phone ); }
//				if( wait2 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait2.count , wait2.phone ); }
//				if( wait3 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait3.count , wait3.phone ); }
				// (변견사항3) 대기명단
				for(int index = 0; index <= waitingArray.length-1; index++) {
					if(waitingArray[index] != null) {
						System.out.printf("인원수 %d명, 연락처 : %s \n",
								waitingArray[index].count, waitingArray[index].phone);
					}
					
				} // for end
				
			} // else if end
			
		} // w end 
		
	} // main end
	
} // class end


















