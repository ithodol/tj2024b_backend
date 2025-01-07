package boardservice10.view;

import java.util.Scanner;

import boardservice10.controller.MemberController;
import boardservice10.model.dto.MemberDto;

public class MemberView {

	// 싱글톤
	private static MemberView instance = new MemberView();
	private MemberView() {};
	public static MemberView getInsetance() {return instance;}
	
	private Scanner scan = new Scanner(System.in);
	// 0. 메인 메뉴 메소드
	public void run() {
		while(true) {
			System.out.println("1.회원가입  2.로그인  3.아이디찾기  4.비밀번호 찾기");
			int choose = scan.nextInt();
			if(choose == 1) {signup();}
			else if(choose == 2){}
			else if(choose == 3){}
			else if(choose == 4){}
			
		} // while end
	} // f run end
	
	
	// 1. 회원가입 화면 메소드
	public void signup() {
		System.out.print("아이디 : ");	String mid = scan.next();
		System.out.print("비밀번호 : ");	String mpwd = scan.next();
		System.out.print("이름 : ");		String mname = scan.next();
		System.out.print("전화번호 : ");	String mphone = scan.next();
		MemberDto memberDto = new MemberDto(mid, mpwd, mname, mphone);
		boolean result = MemberController.getInsetance().signup(memberDto);
		if(result) {
			System.out.println("[회원가입 성공]");
		}else {
			System.out.println("[회원가입 실패]");
		}
		
	} // f signup end
	
	
	
	
	
	
	
	
	
}


















