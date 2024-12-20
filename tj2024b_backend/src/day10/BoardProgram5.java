package day10;

import java.util.Scanner;

/*
	실습4 : 게시판 프로그램  v5
	- 문법 : 변수, 연산자, 제어문(조건문/반복문), 클래스/객체(매개변수/메소드/생성자), 배열
	- 제목, 내용, 작성자를 입력받아 *저장함수*와 *출력함수*로 구현하기
	- 게시물 클래스 설계하기
	- 게시물 최대 100개 저장하기. 게시물 1개당 객체 1개 필요, 객체 1개당 3개의 멤버변수를 갖는다
*/


public class BoardProgram5 { // class start

	public static void main(String[] args) {
		
		Board[] boards = new Board[100];
		BoardService bs = new BoardService();
		
		while(true) {
			System.out.println("1.등록 2.출력");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if(choose == 1) {
				
			}else if(choose == 2) {
				
			}
		} // while end
		
	} // main end
	
	
	
} // class end
