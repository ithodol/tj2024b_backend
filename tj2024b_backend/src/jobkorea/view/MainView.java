package jobkorea.view;

import java.util.Scanner;

import jobkorea.controller.MainController;
import jobkorea.model.dto.MemberDto;

public class MainView {

	// 싱글톤
	private static MainView instance = new MainView();
	private MainView() {}
	public static MainView getInstance() {return instance;}
	
	Scanner scan = new Scanner(System.in);
	
	
	// 1 : 회원 로그인 / 회원가입 메소드 연동 -> 성공시 지원 / 후기 view 연동 
	// 2 : 기업 로그인 / 회원가입 메소드 연동 -> 성공 시 기업 view 연동 
	// 3 : 취업 연동
	public void run() {
	   System.out.println("1.일반  2.기업  3.취업");
	   int choose = scan.nextInt();
	   if(choose == 1) {
		   System.out.println(">> 1.일반 회원가입  2.일반 로그인");
		   int choose2 = scan.nextInt();
		   if(choose2 == 1) {mSignUp();}
		   else if(choose2 == 2) {mLogin();}
	   }
	   else if(choose == 2) {
		   System.out.println(">> 1.기업 회원가입  2.기업 로그인");
		   int choose3 = scan.nextInt();
		   if(choose3 == 1) {eSignUp();}
		   else if(choose3 == 2) {eLogin();}
	   }
	   else if(choose == 3) {
		   System.out.println(">> 1.우수기업순위  2.합격자 후기  3.돌아가기");
		   int choose4 = scan.nextInt();
		   if(choose4 == 1) {}
		   else if(choose4 == 2) {}
		   else if(choose4 == 3) {}
	   }
	}
	
	   // [1] 일반 회원가입 메소드 / 타입 boolean
	   public void mSignUp() {
		  System.out.println("===== 일반 회원가입 =====");
	      System.out.print("아이디 : ");		String mid = scan.next();
	      System.out.print("비밀번호 : ");		String mpwd = scan.next();
	      System.out.print("이름 : ");		String mname = scan.next();
	      System.out.print("성별 : ");		boolean mgender = scan.nextBoolean();
	      System.out.print("생년월일 : ");		String mdate = scan.next();
	      System.out.print("주소 : ");		String maddr = scan.next();
	      MemberDto memberDto = new MemberDto();
	      memberDto.setMid(mid);
	      
	      //MemberDto memberDto = new MemberDto(mid, mpwd, mname, mgender, mdate, maddr);
	      boolean result = MainController.getInstance().mSignUp();

		   
	   }
	   // [2] 일반 로그인 메소드 / 타입 boolean
	   public void mLogin() {
	      
	   }
	   // [3] 일반 로그아웃 메소드 / 타입 boolean
	   public void mLogout() {
	      
	   }
	   
	   
	   
	   // [1] 기업 회원가입 메소드 / 타입 boolean
	   public void eSignUp() {
	      
	   }
	   // [2] 기업 로그인 메소드 / 타입 boolean
	   public void eLogin() {
	      
	   }
	   // [3] 기업 로그아웃 메소드 / 타입 boolean
	   public void eLogout() {
	      
	   }
}























