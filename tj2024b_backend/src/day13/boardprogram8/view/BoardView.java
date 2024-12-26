package day13.boardprogram8.view;

import java.util.Scanner;

import day13.boardprogram8.model.dto.BoardDto;
import day13.boardprogram8.controller.BoardController;

public class BoardView {

	// 싱글톤 만들기 : 입출력 기능은 하나만 있어도 됨
	private BoardView() {}
	private static BoardView instance = new BoardView();
	public static BoardView getInstance() {return instance;}
	
	// 멤버변수(입력객체) 모든 메소드에서 사용하기 위해 함수 밖에 작성
	private Scanner scan = new Scanner(System.in);
	
	
	// 1. 메인페이지 입출력 메소드
	public void index() {
		while(true) {
			System.out.println("===== index =====");
			System.out.print("1.글등록 2.글출력 : ");
			int choose = scan.nextInt();
			if(choose == 1) {
				write();
			}else if(choose == 2) {
				findAll();
			}
		} // while end
	} // index end
	
	
	// 2. 글쓰기 입출력 메소드
	public void write() {
		System.out.println("===== write =====");
		// [1] 입력
		System.out.print("제목 : "); String title = scan.next();
		System.out.print("내용 : "); String content = scan.next();
		System.out.print("작성자 : "); String writer = scan.next();
		// [2] 객체화
		BoardDto boardDto = new BoardDto(title, content, writer);
		
		// [3] 컨트롤러에게 저장할 객체를 전달, 결과를 응답받기
		// 컨트롤러에게 객체를 전달하고 결과를 응답받아 변수에 저장
		boolean result = BoardController.getInstance().write(boardDto);
		// [4]
		if(result == true) {
			System.out.println("[글쓰기 성공]");
		}else {
			System.out.println("[글쓰기 실패]");
		}
		
	} // write end
	
	
	// 3. 모든 글 출력 입출력 메소드
	public void findAll() {
		System.out.println("===== findAll =====");
		System.out.println("순번\t작성자\t제목\t내용");
		// [1] 컨트롤러에게 모든 게시물 정보를 요청, 결과 받기
		BoardDto[] result =BoardController.getInstance().findAll(); 
				// 컨트롤러에게 모든 게시물정보(배열) 요청, 결과 받기
		// [2] 요청 결과 출력하기
			for(int index = 0; index <= result.length-1; index++) {
				BoardDto board = result[index];
				if(board != null) {
					System.out.printf("%d\t%s\t%s\t%s\n",
										index,
										board.getWriter(),
										board.getTitle(),
										board.getContent()
										);
				}
			} // for end
	} // findAll end
}
















