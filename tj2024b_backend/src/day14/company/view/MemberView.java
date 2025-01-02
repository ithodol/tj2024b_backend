package day14.company.view;

import java.util.Scanner;

import day14.company.model.dto.MemberDto;

public class MemberView {

	// 싱글톤
	private MemberView() {}
	private static MemberView instance = new MemberView();
	public static MemberView getInstance() {return instance;}
	
	private Scanner scan = new Scanner(System.in);
	
	public void infoIndex() {
		while(true) {
			System.out.println("===== 사원정보 메인 =====");
			System.out.println("1.사원등록 2.로그인 3.사원수정 4.사원삭제");
						
			int choose = scan.nextInt();
			
			if(choose == 1) {create();}
			else if(choose == 2) {login();}
			else if(choose == 3) {update();}
			else if(choose == 4) {delete();}
		} // while end
	} // infoIndex end
	
	
	// 사원등록
	public void create() {
		while(true) {
			System.out.println(">> 1.사원등록");
			System.out.print("직위 : ");	String position = scan.next();
			System.out.print("성명 : ");	String name = scan.next();
			
			// 객체화
			MemberDto memberDto = new MemberDto(position, name);
			
			
			
		} // while end
	}
	
	
	// 로그인
	public void login() {
		while(true) {
			System.out.println(">> 2.로그인");
			
		} // while end
	}
	
	
	// 사원수정
	public void update() {
		while(true) {
			System.out.println(">> 3.사원수정");
			
		} // while end
	}
	
	
	// 사원삭제
	public void delete() {
		while(true) {
			System.out.println(">> 4.사원삭제");
			
		} // while end
	}
	
	
} // class end



























