package day07;

import java.util.Scanner;

/*
실습1 : 게시판 프로그램
	- 문법 : 변수, 연산자, 제어문(조건문/반복문) 
	- 제목, 내용, 작성자를 입력받아 저장/출력 구현하기
	- 게시물 클래스 설계하기
	- 게시물 3개 저장하기. 게시물 1개당 제목/내용/작성자 => 저장소 3개 필요
									게시물이 3개 => 저장소 9개 필요 
*/

// main 함수 갖는 실행 클래스
public class BoardProgram2 { // class start
	
	// main + 자동완성
	public static void main(String[] args) {
		
		// [5] 클래스 만들기. 객체 생성
		Board board1 = new Board();
		Board board2 = new Board();
		Board board3 = new Board();
		
		// [1] 반복문 while, while(true){ } 무한루프
		while(true) {
			// [2] 출력함수 println
			System.out.println("1.등록 2.출력 : ");
			// [3] 입력함수 Scanner
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			// [4] 연산, 조건문 = 코드의 흐름제어(갈림길) if
			if(choose == 1) {System.out.println(">> 등록 선택");
				System.out.println("> 제목 : "); String title = scan.next();
				System.out.println("> 내용 : "); String content = scan.next();
				System.out.println("> 작성자 : "); String writer = scan.next();
				// [6] 만약 비어있는 객체가 있으면
				if(board1.title == null) {
					board1.title = title; board1.content = content; board1.writer = writer;
				}else if(board2.title == null) {
					board2.title = title; board2.content = content; board2.writer = writer;
				}else if(board3.title == null) {
					board3.title = title; board3.content = content; board3.writer = writer;
				}
			} // if end
			else if(choose == 2) {System.out.println(">> 출력 선택");
				if(board1.title != null) {
					System.out.println("제목 : " + board1.title + " / 내용 : " + board1.content + " / 작성자 : " + board1.writer);
				}
				if(board2.title != null) {
					System.out.println("제목 : " + board2.title + " / 내용 : " + board2.content + " / 작성자 : " + board2.writer);
				}
				if(board3.title != null) {
					System.out.println("제목 : " + board3.title + " / 내용 : " + board3.content + " / 작성자 : " + board3.writer);
				}
				
			} // else if end
			
		} // while end
		
		
		
		
	} // main end
} // class end
