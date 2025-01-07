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
	
}
