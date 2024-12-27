package day14.boardprogram9.view;

import java.util.ArrayList;
import java.util.Scanner;

import day14.boardprogram9.controller.BoardController;
import day14.boardprogram9.model.dto.BoardDto;

public class BoardView {
	// 싱글톤
	private BoardView() {}
	private static BoardView instance = new BoardView();
	public static BoardView getInstance() {return instance;}
	
	// + 입력객체(현재 클래스내부의 모든 함수들에서 사용하기 위해 멤버변수에 선언함)
	private Scanner scan = new Scanner(System.in);
	
	
	// 0. 메인페이지 표현 함수
	public void run() {
		while(true) {
			System.out.println("===== run =====");
			System.out.println("1.C  2.R  3.U  4.D : ");
			
			int choose = scan.nextInt();
			if(choose == 1 ) {create();}
			else if(choose == 2) {readAll();}
			else if(choose == 3) {update();}
			else if(choose == 4) {delete();}
		} // while end
	} // f run end
	
	
	// 1. 게시물 쓰기 페이지 함수
	public void create() {
		System.out.println("===== create =====");
		System.out.println("[C]");
		// [1] 저장할 게시물 정보를 입력 받는다
		System.out.print("제목 : ");	String title = scan.next();
		System.out.print("내용 : ");	String content = scan.next();
		System.out.print("작성자 : ");	String writer = scan.next();
		
		// [2] 게시물 정보를 하나의 객체로 만든다
		BoardDto boardDto = new BoardDto(title,content,writer);
		// [3] 객체를 컨트롤러에게 전달하고 쓰기 결과를 받는다
		boolean result = BoardController.getInstance().create(boardDto);
		// [4] 받은 결과에 따른 메세지를 출력한다
		if(result == true) {System.out.println("[등록 성공]");}
		else {System.out.println("[등록 실패]");}
		
	} // f create end
	
	
	// 2. 게시물 출력 페이지 함수
	public void readAll() {
		System.out.println("===== readAll =====");
		System.out.println("[R]");
		// [1] 컨트롤에게 모든 게시물 정보를 요청한다
		ArrayList<BoardDto> result =  BoardController.getInstance().readAll();
		// [2] 요청받은 모든 게시물 정보를 출력한다
		System.out.println("순번\t작성자\t제목\t내용");
		for(int index = 0; index <= result.size()-1; index++) {
			BoardDto board = result.get(index);
			System.out.printf("%d\t%s\t%s\t%s\n",
								index,
								board.getWriter(),
								board.getTitle(),
								board.getContent()
								);
		} // for end
	} // f readAll end
	
	// 3. 게시물 수정 페이지 함수
	public void update() {
		System.out.println("===== update =====");
		System.out.println("[U]");
		// [1] 수정할 정보들을 입력받는다
		System.out.print("수정할 인덱스 : ");	int uIndex = scan.nextInt();
		System.out.print("수정할 제목 : ");		String title = scan.next();
		System.out.print("수정할 내용 : ");		String content = scan.next();
		System.out.print("수정할 작성자 : ");	String writer = scan.next();
		// [2] 입력받은 값들을 객체로 만든다
		BoardDto boardDto = new BoardDto(title, content, writer);
		// [3] 컨트롤러에게 수정할 인덱스와 수정할 객체를 전달하고 결과를 받는다
		boolean result = BoardController.getInstance().update(uIndex, boardDto);
		// [4] 결과에 따른 메세지를 출력한다
		if(result) {System.out.println("[수정 성공]");}
		else {System.out.println("[수정 실패]");}
		
		
	} // f update end
	
	// 4. 게시물 삭제 페이지 함수
	public void delete() {
		System.out.println("===== delete =====");
		System.out.println("[D]");
		// [1] 삭제할 인덱스(식별)번호를 입력 받는다
		System.out.print("삭제할 인덱스 : "); int dIndex = scan.nextInt();
		// [2] 삭제할 번호를 컨트롤러에게 전달하고 처리결과를 받는다
		boolean result = BoardController.getInstance().delete(dIndex);
		// [3] 처리결과에 따른 메세지를 출력한다
		if(result) {System.out.println("[삭제 성공]");}
		else {System.out.println("[삭제 실패]");
		} 
	
	} // f delete end
	
	
} // class end



































