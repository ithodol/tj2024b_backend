package jobkorea.controller;

import jobkorea.model.dao.MainDao;
import jobkorea.model.dto.MemberDto;

public class MainController {

	// 싱글톤
	private static MainController instance = new MainController();
	private MainController() {}
	public static MainController getInstance() {return instance;}
	
	
	public boolean mSignUp(MemberDto memberDto) {
	      boolean result = MainDao.getInstance().mSignUp(memberDto);
	      return result;
	}
	
	
	// [2] 일반 로그인 메소드 / 타입 boolean
	public boolean mLogin() {

	}
	// [3] 일반 로그아웃 메소드 / 타입 boolean
	public boolean mLogout() {
	     
	}
	   
	   
	
	
	   
	// [1] 기업 회원가입 메소드 / 타입 boolean
	public boolean eSignUp() {
	      
	}
	// [2] 기업 로그인 메소드 / 타입 boolean
	public boolean eLogin() {
	      
	}
	// [3] 기업 로그아웃 메소드 / 타입 boolean
	public boolean eLogout() {
	      
	}
	
	
}