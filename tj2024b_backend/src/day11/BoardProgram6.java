package day11;

import java.util.Scanner;

public class BoardProgram6 { // class start

	// (1) main 함수가 갖는 프로그램 실행 클래스
	public static void main(String[] args) { // main start
		// 배열 만들기
		BoardDto[] boards = new BoardDto[100];
		// 함수 가져오기
		BoardService bs = new BoardService();
		while(true) {
			System.out.print("1.등록 2.출력");
			Scanner scan = new Scanner(System.in);
			
			int choose = scan.nextInt();
			if(choose ==1) {
				// 등록함수 호출
				bs.boardAdd(scan, boards);
			}else if (choose == 2) {
				// 출력함수 호출
				bs.boardPrint(boards);
			} // if end

		} // while end
		
	} // main end
	
} // class end
