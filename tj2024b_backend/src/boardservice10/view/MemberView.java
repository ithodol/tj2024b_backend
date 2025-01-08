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
			else if(choose == 2){login();}
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
	
	// 2. 로그인 화면 메소드
	public void login() {
		// 순서 : 입력 -> 객체화 -> 컨트롤러에게 전달하고 응답 결과받기 -> 컨트롤러의 결과에 따른 처리
		System.out.print("아이디 : ");	String mid = scan.next();
		System.out.print("비밀번호 : ");	String mpwd = scan.next();
		MemberDto memberDto = new MemberDto();
		memberDto.setMid(mid);
		memberDto.setMpwd(mpwd);
		boolean result = MemberController.getInsetance().login(memberDto);
		if(result) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("동일한 회원정보가 없습니다");
		}
	} // f login end
	
	// 2-1 로그아웃 화면 메소드
	public void logout() {
		MemberController.getInsetance().logout();
		System.out.println("로그아웃 완료했습니다");
	}
	
	
	
	// 3. 아이디찾기 화면 메소드
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
	
	
	// 4. 비밀번호찾기 화면 메소드
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
	
	} // f findPwd end
	
	
	// 5. 내 정보 보기 화면 메소드
	public void myInfo() {
		// 순서 : 1입력 -> 2객체화 -> 3컨트롤러에게 전달하고 응답 결과받기 -> 4컨트롤러의 결과에 다른 처리
		// 1,2 입력, 객체화 생략
		// 3 받는 곳 = MemberController().myInfo(주는곳);
		MemberDto result = MemberController.getInsetance().myInfo();
		// 4
		System.out.println("===== 마이페이지 =====");
		System.out.println("mid : " + result.getMid());
		System.out.println("mname : " + result.getMname());
		System.out.println("mphone : " + result.getMphone());
		System.out.println("mdate : " + result.getMdate());
		// 서브메뉴
		while(true) {
			System.out.println("1.회원수정  2.회원탈퇴  3.뒤로가기");
			int choose2 = scan.nextInt();
			if(choose2 == 1) {}
			else if(choose2 == 2) {delete(); break;}
			else if(choose2 == 3) {break;}
		}
	} // f myInfo end
	
	// 6. 회원탈퇴 화면 메소드
	public void delete() {
		System.out.println("정말 탈퇴하시겠습니까? 0.확인  1.취소");
		int choose2 = scan.nextInt();
		if(choose2 == 0) {
			// 탈퇴처리 컨트롤러 요청
			MemberController.getInsetance().delete();
			logout();
		}
	} // f delete end
	
	
	
}


