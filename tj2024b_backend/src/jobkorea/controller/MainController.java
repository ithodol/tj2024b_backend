package jobkorea.controller;

import jobkorea.model.dao.MainDao;
import jobkorea.model.dto.EnterpriseDto;
import jobkorea.model.dto.MemberDto;
import jobkorea.model.dto.PostDto;

public class MainController {

	// 싱글톤
	private static MainController instance = new MainController();
	private MainController() {}
	public static MainController getInstance() {return instance;}

	// [1] 일반 회원가입 메소드

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
	public boolean eSignUp(EnterpriseDto enterpriseDto) {
	      boolean result = MainDao.getInstance().eSignUp(enterpriseDto);
	      return result;
	}
	// [2] 기업 로그인 메소드 / 타입 boolean
	public boolean eLogin() {
	      
	}
	// [3] 기업 로그아웃 메소드 / 타입 boolean
	public boolean eLogout() {
	      
	}
	
	
	
    // [1] 우수기업 리스트 메소드 R
    public void bestList(PostDto postDto) {
       MainDao.getInstance().bestList();
   }
    // [2] 후기 리스트 메소드 R
    public void reviewList(String ename) {
      MainDao.getInstance().reviewList(ename);
   }
	
}