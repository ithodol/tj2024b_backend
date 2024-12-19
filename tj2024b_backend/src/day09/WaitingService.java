package day09;

import java.util.Scanner;

public class WaitingService {

	// 멤버변수
	
	// 메소드
	// 1. 명단등록 메소드
	void waitingAdd(Scanner scan, Waiting[] waitings) {
		System.out.println("> 전화번호 : ");	String num = scan.next();
		System.out.println("> 인원수 : ");	int count = scan.nextInt();
		// *** 객체를 생성하고 객체 내 멤버변수에 접근하여 입력받은 값을 대입함.
		Waiting waiting = new Waiting(); // 객체 생성
		waiting.num = num;
		waiting.count = count;
		// *** 배열에 저장하기
		for(int index = 0; index <= waitings.length-1; index++) {
			if(waitings[index] == null) {
				waitings[index] = waiting;
				break;
			}
		} // for end
		
	} // main void end
	
	// 2. 명단출력 메소드
	void waitingPrint(Waiting[] waitings) {
		for(int index = 0; index <= waitings.length-1; index++) {
			System.out.printf("인원수 %d명, 연락처 : %s \n",
					waitings[index].count, waitings[index].num);
		}
	}
	
	
	
//	void WaitingChoice(Scanner scan, Waiting[] waitingList) {
//		System.out.print("> 대기등록 선택");
//		System.out.print("- 전화번호");	String num = scan.next();
//		System.out.print("- 인원수");		int count = scan.nextInt();
//		
//		Waiting waiting = new Waiting();
//		waiting.num = num;
//		waiting.count = count;
//		
//		for(int index = 0; index < waitingList.length -1; index++) {
//			if(waitingList == null) {
//				waitingList[index] = waiting;
//				break;
//			}
//		}
//		
//	} // main void end
	
} // class end
