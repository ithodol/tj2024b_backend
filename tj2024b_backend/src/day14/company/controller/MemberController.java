package day14.company.controller;

import java.util.ArrayList;

import day14.company.model.dto.MemberDto;

public class MemberController {

	// 싱글톤
	private MemberController() {}
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {return instance;}
	
	// 사원등록
//	public boolean create() {
//		boolean result = MemberDao.getInstance().create(memberDto);
//	}
//	
//	// 로그인
//	public ArrayList<MemberDto> login(){
//		
//	}
	
	
	// 사원수정
	
	
	// 사원삭제
	
}
