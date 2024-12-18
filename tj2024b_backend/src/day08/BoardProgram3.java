package day08;

import java.util.Scanner;

/*
	게시판 프로그램
	- 문법 : 변수, 연산자, 제어문(조건문/반복문), 클래스/객체, 배열
	- 제목, 내용, 작성자를 입력받아 저장/출력 구현하기
	- 게시물 클래스 설계하기
	- 게시물 최대 100개 저장하기. 게시물 1개당 객체 1개 필요, 객체 1개당 3개의 멤버변수를 갖는다
*/
public class BoardProgram3 {
	public static void main(String[] args) {
		// [5] 클래스 정의하기, 게시물 타입 만들기
		//		동일한 클래스의 서로 다른 객체를 저장하기 위한 *배열*선언
		// int[] arr1 = new int[100]; // 초기화를 하지 않고 int(정수)타입의 서로 다른 자료 100개 저장 가능한 배열 선언 => 정수 0. 100개 생성
		// 초기화를 하지 않고 Board(게시물) 타입의 서로 다른 객체 100개 저장 가능한 배열 선언 => null. 100개 생성
		Board[] boardArray = new Board[100];
		while(true) { // [1] 반복문, while(조건{}, while(true){} 무한루프 / 등록,출력 기능을 여러번 실행하기 위함
			// [2] 출력함수
			System.out.println("1.등록 2.출력 : ");
			// [3] 입력객체
			Scanner scan = new Scanner(System.in);
			// [3-1] 입력함수
			int choose = scan.nextInt();
			if(choose == 1) { // [4] 조건문, if(조건){}, 입력받은 값에 따른 흐름제어
				System.err.println(">> 1.등록 선택");
				// [6] 키보드로부터 3개의 정보를 입력받기
				System.out.println("> 제목 : "); String title = scan.next();
				System.out.println("> 내용 : "); String content = scan.next();
				System.out.println("> 작성자 : "); String writer = scan.next();
				// [7] 3개의 정보를 하나의 객체로 만들기
				Board board = new Board(); // 객체 생성
				// 객체 내 멤버변수에 접근하여 멤버변수 값 수정 // 변수명.멤버면수명 // .(접근연산자)
				board.title = title;
				board.content = content;
				board.writer = writer;
				// [8] 객체를 배열에 저장, 빈 공간(null)을 찾아서 빈 공간에 저장하기
				//		배열내 빈공간 찾기(여러개(배열) 중에서 원하는 값 찾기, 비교, ==같다)
				// [8-3] for문 실행한 결과를 저장하는 변수
				boolean saveState = false;
				for(int index = 0; index <= boardArray.length-1; index++) {
					// [8-1] index는 0부터 마지막 인덱스까지 1씩 증가하면서 반복 처리
					if(boardArray[index] == null) {
						// [8-2] 배열 내 index번재 요소가 null이면, 게시물 객체가 없으면
						boardArray[index] = board; // 해당 인덱스의 새로 만든 게시물(객체) 대입하기
						saveState = true; // 저장여부 상태 변경
						break; // 가장 가까운 반복문 종료. for 안에서 원하는 목표를 이뤘기 때문에 
					}
				} // for end
				if(saveState == true) {System.out.println("> 등록 성공");}
				else {System.out.println("> 등록 실패");}
				
				
			}else if(choose == 2) {
				System.out.println(" >> 2.출력 선택");		
				
				// [10] 배열 내 모든 요소(게시물 객체)를 출력하기, 빈 공간이 아니면(!= null)
				for(int index = 0; index <= boardArray.length-1; index++) {
					if(boardArray[index] != null) {
						Board board = boardArray[index];
						System.out.printf("순번 : %d / 제목 : %s / 내용 : %s / 작성자 : %s \n",
								index, board.title, board.content, board.writer);
					}
				} // for end
			}
			
			
			
			
			
			
			
			
			
		} // while end
		
		
		
	} // main end

} // class end
