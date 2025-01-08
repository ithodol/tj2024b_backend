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
			else if(choose == 3){findId();}
			else if(choose == 4){findPwd();}
			
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
	
	
	// 2. 아이디찾기 화면 메소드
	public void findId() {
		// (1) 입력
		System.out.print("이름 : ");		String mname = scan.next();
		System.out.print("전화번호 : ");		String mphone = scan.next();
		// (2) 객체화 // 데이터 포장(view 에서 controller 이동)
		//MemberDto memeberDto = new MemberDto(mname, mphone); // 오류발생 : 생성자를 만들지 않음
			// 1. 클래스에서 매개변수 2개의 생성자를 만든다
			// 2. 디폴트 생성자로 인스턴스 생성 후 setter로 값을 넣는다
		MemberDto memberDto = new MemberDto();
		memberDto.setMname(mname);
		memberDto.setMphone(mphone);
		
		// (3) 컨트롤러에게 전달(request/요청/매개변수)하고 응답(response/응답/리턴) 결과 받기
		String result = MemberController.getInsetance().findId(memberDto);
		
		// (4) 컨트롤러의 응답 결과에 따른 결과 처리
		if(result != null) {
			System.out.println("[찾은 아이디 : ]" + result);
		}else {
			System.out.println("[동일한 회원 정보가 없습니다]]");
		}
	}
	
	// 3. 비밀번호찾기 화면 메소드
	public void findPwd() {
		// (1) 입력
		System.out.print("아이디 : ");	String mid = scan.next();
		System.out.print("전화번호 : ");	String mphone = scan.next();
		// (2) 객체화 // 데이터 포장(view 에서 controller 이동)
		MemberDto memberDto = new MemberDto();
		memberDto.setMid(mid);
		memberDto.setMphone(mphone);
		
		// (3) 컨트롤러에게 전달(request/요청/매개변수)하고 응답(response/응답/리턴) 결과 받기
		String result = MemberController.getInsetance().findPwd(memberDto);
		// (4) 컨트롤러의 응답 결과에 따른 결과 처리
		if(result != null) {
			System.out.println("[찾은 비밀번호 : ]" + result);
		}else {
			System.out.println("[동일한 회원 정보가 없습니다]]");
		}
	
	}
	
	
	
	
	
}


















