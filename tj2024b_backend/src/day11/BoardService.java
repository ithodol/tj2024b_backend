package day11;

import java.util.Scanner;

public class BoardService {

	
		// 게시물 등록
		public void boardAdd(Scanner scan, BoardDto[] boards) {
			System.out.print("제목 : ");		String title = scan.next();
			System.out.print("내용 : ");		String content = scan.next();
			System.out.print("작성자 : ");	String writer = scan.next();
			// 생성자를 이용한 객체 생성
			BoardDto boardDto = new BoardDto(title,content,writer);
			// 배열에 저장
			boolean saveState = false; // 저장 상태
			for(int index = 0; index <= boards.length-1; index++) {
				if(boards[index] == null) {
					boards[index] = boardDto;
					saveState = true;
					break;
				} // if end
			} // for end
			if(saveState) {
				System.out.println("등록 성공");
			}else {
				System.out.println("등록 실패");
			}
			
		} // boardAdd main end
			
				
	
			
		// 모든 게시물 출력
		public void boardPrint(BoardDto[] boards) {
			for(int index = 0; index <= boards.length-1; index++) {
				if(boards[index] != null) {
					System.out.printf("제목 : %s / 내용 : %s / 작성자 : %s \n",
										boards[index].getTitle(),
										boards[index].getContent(),
										boards[index].getWriter());
				} // if end
				
			} // for end
			
		} // boardPrint main end
	

} // class end















