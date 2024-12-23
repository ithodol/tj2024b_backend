package day11;

import java.util.Scanner;

public class Example1 {

/*
	자바 과제 11 : 회원제 게시판
		- 초기메뉴는 회원가입과 로그인을 제공한다
		- 로그인에 성공하면 게시물등록과 게시물출력을 제공한다
			- 단, 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록된다
	제출 : 카톡 git 주소
*/
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("===== 선택 =====");
			System.out.println("1.회원가입 2.로그인");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if(choose == 1) {
				System.out.println(">> 회원가입");
				System.out.println("아이디 : "); String joinId = scan.next();
				System.out.println("비밀번호 : "); String joinPw = scan.next();
			}else if(choose == 2) {
				System.out.println(">> 로그인");
				System.out.println("아이디 : "); String loginId = scan.next();
				System.out.println("비밀번호 : "); String loginPw = scan.next();
			}
			
			
		} // while end		
		
	} // main end
	
} // class end
