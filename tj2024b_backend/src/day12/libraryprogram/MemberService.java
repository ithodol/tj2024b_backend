package day12.libraryprogram;

import java.util.Scanner;

public class MemberService {

	// 회원가입 함수
	
		// 관리자
	public void signUpManager(Scanner scan, MemberDto[] members) {
		System.out.println(">> 관리자 회원가입");
		System.out.print("아이디 : "); String idM = scan.next();
		System.out.print("비밀번호 : "); String pwM = scan.next();
		System.out.println("닉네임 : "); String userM = scan.next();
		
		// 빠른 객체화
		MemberDto memberDto = new MemberDto(idM, pwM, userM);
		
		
		
	}
	
	
		// 일반
	public void signUp(Scanner scan) {
		System.out.println(">> 일반 회원가입");
		System.out.print("아이디 : "); String id = scan.next();
		System.out.print("비밀번호 : "); String pw = scan.next();
		
		
		
		
	}
	
	
	
	
	// 로그인 함수
	public void login() {
		
	}
	
	
}
