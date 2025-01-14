package boardservice10.view;

import java.util.ArrayList;
import java.util.Scanner;

import boardservice10.controller.BoardController;
import boardservice10.model.dto.BoardDto;

public class BoardView {
	// 싱글톤
	private static BoardView instance = new BoardView();
	private BoardView() {}
	public static BoardView getInsetance() {return instance;}
	
	private Scanner scan = new Scanner(System.in);
	
	// 0. (로그인했을 때) 메인 메뉴 메소드 // 로그아웃시 탈출
	public void index() {
		while(true) {
			// + 게시물 전체 조회
			findAll();
			
			System.out.println("1.로그아웃 2.내정보 3.게시물작성 4.게시물상세보기 : ");
			int choose = scan.nextInt();
			if(choose == 1) {MemberView.getInsetance().logout(); break;}
			else if(choose == 2) {
				int state = MemberView.getInsetance().myInfo();
				if(state == 0) {return;}
			}
			else if(choose == 3) {write();}
			else if(choose == 4) {findById();}
		} // while end
	} // f index end
	
	// 1. 전체 게시물 조회 화면
	public void findAll() {
		// 1. 컨트롤러에게 요청하고 결과 받기
		ArrayList<BoardDto> result= BoardController.getInstance().findAll();
		// 2. 결과에 따른 출력
		System.out.println("===== 전체 게시물 =====");
		System.out.println("순번\t카테고리\t회원번호\t작성일자\t\t\t제목");
		for(int index = 0; index <= result.size()-1; index++) {
			// -index는 0부터 리스트의 요소개수-1 까지 1씩 증가 반복
			BoardDto boardDto = result.get(index); // index번째의 요소 객체 꺼내기
			System.out.print(boardDto.getBno() + "\t");
			System.out.print(boardDto.getCno() + "\t");
			System.out.print(boardDto.getMno() + "\t");
			System.out.print(boardDto.getBdate() + "\t");
			System.out.print(boardDto.getBtitle() + "\n");
		}
	} // f findAll end
	
	
	// 2. 개별(1개) 게시물 조회 화면
	public void findById() {
		// 0. 입력받기
		System.out.print(">> 게시물 번호 : ");		int bno = scan.nextInt();
		// 1. 컨트롤러에게 요청하고 결과 받기
		BoardDto result = BoardController.getInstance().findById(bno);
		// 2. 결과
		System.out.println("===== " + result.getBno() + "번 게시물 =====");
		System.out.println("카테고리\t회원번호\t조회수\t작성일자\t\t\t제목\t내용");
		System.out.print(result.getCno() + "\t" + result.getMno() + "\t" + result.getBview() + "\t" + result.getBdate());
		System.out.print(result.getBtitle() + "\t");
		System.out.print(result.getBcontent() + "\n");
			// 추후에 댓글 출력되는 코드
		while(true) {
			System.out.print("1.뒤로가기  2.댓글작성(구현x)  3.수정  4.삭제 : ");
			int choose = scan.nextInt();
			if(choose == 1) {break;}
			else if(choose == 2) {}
			else if(choose == 3) {update(result.getBno());}
			else if(choose == 4) {delete(result.getBno());}
		}

	}
	
	// 3. 게시물 작성 화면
	public void write() {
		// 카테고리 전체 조회
		categoryAll();
		System.out.print("카테고리 번호 : ");	int cno = scan.nextInt();
		System.out.print("제목 : ");			String btitle = scan.next();
		System.out.print("내용 : ");			String bcontnent = scan.next();
		
		BoardDto boardDto = new BoardDto();
		
		boardDto.setCno(cno);
		boardDto.setBtitle(btitle);
		boardDto.setBcontent(bcontnent);
		
		boolean result = BoardController.getInstance().write(boardDto);
		if(result) {System.out.println("[글쓰기 성공]");}
		else {System.out.println("[글쓰기 실패]");}
	} // write end
	
	
	// 4. 카테고리 전체 조회 화면
	public void categoryAll() {
		ArrayList<BoardDto> result = BoardController.getInstance().categoryAll();
		for(int index = 0; index <= result.size()-1; index++) {
			BoardDto boardDto = result.get(index);
			System.out.printf("번호 : %d  카테고리명 : %s \n",
					boardDto.getCno(), boardDto.getCname());
		} // for end
	} // categoryAll end
	
	
	// 5. 게시물 수정 작성 화면
	public void update(int bno) {
		System.out.print("새로운 제목 : ");	String btitle = scan.next();
		System.out.print("새로운 내용 : ");	String bcontent = scan.next();
		BoardDto boardDto = new BoardDto();
		boardDto.setBno(bno);
		boardDto.setBtitle(btitle);
		boardDto.setBcontent(bcontent);
		boolean result = BoardController.getInstance().update(boardDto);
		if(result) {System.out.println("[수정 성공]");}
		else {System.out.println("[수정 실패]");}
	} // update end
	
	
	// 6. 게시물 삭제 작성 화면
	public void delete(int bno) {
		boolean result = BoardController.getInstance().delete(bno);
		if(result) {System.out.println("[삭제 성공]");}
		else {System.out.println("[삭제 실패]");}
	} // delete end
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // class end
