package day12.boardprogram7;

import java.util.Scanner;

public class BoardService {

	// 게시물 등록 함수 선언
	public void boardAdd(Scanner scan, BoardDto[] boards, String loginId) {
		System.out.println("===== 게시판 =====");
		System.out.print("제목 : ");	String title = scan.next();
		System.out.print("내용 : ");	String content = scan.next();
		System.out.print("작성자 : 현재 로그인된 아이디 ");	String writer = loginId;
		
		// 생성자를 이용한 빠른 객체 생성
		BoardDto boardDto = new BoardDto(title, content, writer);
		// 게시물 목록에서 빈공간 찾아서 대입
		for(int index = 0; index <= boards.length-1; index++) {
			if(boards[index] == null) {
				boards[index] = boardDto;
				System.out.println("게시물 등록 성공");
				return;
			}
		} // for end
		
	} // boardAdd end
	
	
	
	// 게시물 출력 함수 선언
	public void boardPrint(BoardDto[] boards) {
		System.out.println("순번\t작성자\t제목\t내용");
		for(int index = 0; index <= boards.length-1; index++) {
			if(boards[index] != null) {
				System.out.printf("%d \t %s \t %s \t %s \n",
									index,
									boards[index].getWriter(),
									boards[index].getTitle(),
									boards[index].getContent()
									);
			}
		} // for end
		
		
	} // boardPrint end
	
}

















