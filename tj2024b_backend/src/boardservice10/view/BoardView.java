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
			else if(choose == 3) {}
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

	}
	
	
	
} // class end
