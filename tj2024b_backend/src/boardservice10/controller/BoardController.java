package boardservice10.controller;


import java.util.ArrayList;

import boardservice10.model.dao.BoardDao;
import boardservice10.model.dto.BoardDto;

public class BoardController {

	// 싱글톤
	private static BoardController instance = new BoardController();
	private BoardController() {};
	public static BoardController getInstance() {return instance;}
	
	
	// 1. 전체 게시물 컨트롤러 메소드
	public ArrayList<BoardDto> findAll(){
		ArrayList<BoardDto> result = BoardDao.getInstance().findAll();
		return result;
	} // findAll end

	
	// 2. 개별 게시물 컨트롤러 메소드
	public BoardDto findById(int bno) {
		BoardDto boardDto = BoardDao.getInstance().findById(bno);
		return boardDto;
	} // f findById end
	
	
	// 3. 게시물 작성
	public boolean write(BoardDto boardDto) {
		 // 현재 로그인된 회원번호 가져오기
		int loginMno = MemberController.getInstance().getLoginMno(); // 현재 로그인된 회원번호 호출
		boardDto.setMno(loginMno); // DTO에 넣어주기
		return BoardDao.getInstance().write(boardDto);
	} // write end
	
	// 4. 카테고리 전체 조회 컨트롤러 메소드
	public ArrayList<BoardDto> categoryAll(){
		return BoardDao.getInstance().categoryAll();
	} // categoryAll end
	
	
	// 5. 게시물 수정 컨트롤러 메소드
	public boolean update(BoardDto boardDto) {
		// + 내가 쓴 글인지 유효성 검사
			// 현재 로그인된 회원번호
		int loginMno = MemberController.getInstance().getLoginMno();
			// 현재 내가 보고 있는 게시물 번호
		int currentBno = boardDto.getBno();
			// 현재 수정할 게시물 번호와 현재 로그인된 회원번호 전달	
		boolean result = BoardDao.getInstance().writeCheck(currentBno, loginMno);
		
			// 만약 내가 쓴 글이 아니면 리턴 false
		if(result == false) {return false;}
		
			// 내가 쓴 글이 맞으면 수정 진행
		boolean result2 = BoardDao.getInstance().update(boardDto);
		return result2;
	} // update end
	
	
	
	// 6. 게시물 삭제 컨트롤러 메소드
	public boolean delete(int bno) {
		int loginMno = MemberController.getInstance().getLoginMno();
		boolean result = BoardDao.getInstance().writeCheck(bno, loginMno);
			// 만약 내가 쓴 글이 아니면 리턴 false
		if(result == false) {return false;}
		
			// 내가 쓴 글이 맞다면 삭제 진행
		boolean result2 = BoardDao.getInstance().delete(bno);
		return result2;
	} // delete end
	
	
	
}

