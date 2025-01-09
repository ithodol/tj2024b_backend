package boardservice10.controller;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
	// 싱글톤
	private static MemberController instance = new MemberController();
	private MemberController() {};
	public static MemberController getInsetance() {return instance;}
	
	
	// 1. 회원가입 컨트롤러 메소드
	public boolean signup(MemberDto memberDto) {
		boolean result = MemberDao.getInsetance().signup(memberDto);
		return result;
	}
	
	
	// 2. 로그인 컨트롤러 메소드
	private int loginMno = 0;
	public int getLoginMno() {return loginMno;} // boardController에서 호출할 예정(글쓰기)
	public boolean login(MemberDto memberDto) {
		int result = MemberDao.getInsetance().login(memberDto);
			// boolean -> int 변경 이유 :
			// 고객에게는 true/false 로 보여주지만
			// 로그인 성공한 회원번호를 내부적으로 저장하기 위해
		// if 를 쓴 이유 : 회원번호를 반환받아서 0이면 존재하지 않는 회원번호,
		//								0초과하면 존재하는 회원번호
		if(result > 0 ) {
			loginMno = result; // 로그인 성공시 로그인 저장변수에 로그인 성공한 회원번호 저장
			return true;
		}else {
			return false;
		} // if end
	}
	
	
	// 2-1 로그아웃 컨트롤러 메소드
	public void logout() {
		loginMno = 0;
	}

	
	
	// 3. 아이디찾기 컨트롤러 메소드
	public String findId(MemberDto memberDto) {
		
		// *다양한 유효성검사를 넣을 예정
		String result = MemberDao.getInsetance().findId(memberDto);
		return result;
	} // f findId end
	
	// 3. 비밀번호찾기 컨트롤러 메소드
	public String findPwd(MemberDto memberDto) {
		String result = MemberDao.getInsetance().findPwd(memberDto);
		return result;
	} // f findPwd end
	

	
	// 4. 내 정보 보기 컨트롤러 메소드
	// public 주는타입 myInfp(받는타입 받는변수){}
	public MemberDto myInfo() {
		// Dao에게 로그인(로그인된 회원번호pk)정보 주고 결과 받기
		MemberDto result = MemberDao.getInsetance().myInfo(loginMno);
		return result;
		
	}
	
	
	// 5. 회원탈퇴 컨트롤러 메소드
	public void delete() {
		MemberDao.getInsetance().delete(loginMno);
	}
	
	
	
	
	
	// 7. 회원 수정 컨트롤러 메소드
	public boolean update(MemberDto memberDto) {
		// + 누구를 수정할건지, 현재 로그인 회원이 수정하므로 현재 로그인된 회원번호를 DTO 담아주기
		memberDto.setMno(loginMno);
		boolean result = MemberDao.getInsetance().update(memberDto);
		return result;
	}
	
	
	
	
	
	
	
}















