package day12.boardprogram7;

import java.util.Scanner;

/*
	자바 과제 11 : 회원제 게시판
		- 초기메뉴는 회원가입과 로그인을 제공한다
		- 로그인에 성공하면 게시물등록과 게시물출력을 제공한다
			- 단, 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록된다
	
	1. 프론트 시각화 요소 구성, console 표현하고 싶은 내용물 구성
	2. 메모리(저장소) 구성
	3. 함수/기능 구성
*/


public class BoardProgram7 {

	public static void main(String[] args) {
		// 공통으로 사용되는 저장소 변수
			// 회원관리
		MemberDto[] members = new MemberDto[100];
		MemberService ms = new MemberService(); // 함수를 가져다가 쓰기 위해서 인스턴스(객체) 생성
		String loginId = null; // 로그인을 안 했을 때 null 저장, 로그인을 했으면 아이디 저장
			// 게시판
		BoardDto[] boards = new BoardDto[100];
		BoardService bs = new BoardService();
		
		
		while(true) {
			System.out.println("======== 선택 =======");
			System.out.println("1.회원가입 2.로그인");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if(choose == 1 ) {
				// 회원가입 함수 호출
				ms.signUp(scan, members);
			}else if(choose == 2) {
				// 로그인 함수 호출
				loginId = ms.login(scan, members);
				if(loginId != null) { // 로그인 했다
					while(true) {
						System.out.println("======== 게시판 =======");
						System.out.println("1.등록 2.출력 3.로그아웃");
						int choose2 = scan.nextInt();
						if(choose2 == 1) {
							bs.boardAdd(scan, boards, loginId);
						}
						else if(choose2 == 2) {
							bs.boardPrint(boards);
						}
						else if(choose2 == 3) {
							loginId = null; // 로그인 상태를 null 로 수정함으로써 증거 없애기
							break; // 가장 가까운 반복문(while) 종료
						}
					} // while end
				} // if end
			} // choose == 2 end
			
		} // while end
		
	} // main end
	
} // class end
















