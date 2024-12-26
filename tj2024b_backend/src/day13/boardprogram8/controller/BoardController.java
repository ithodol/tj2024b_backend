package day13.boardprogram8.controller;

import day13.boardprogram8.model.dao.BoardDao;
import day13.boardprogram8.model.dto.BoardDto;

public class BoardController {

	// 싱글톤 만들기
	private BoardController() {} // 생성자 만들기
	private static BoardController instance = new BoardController();
	public static BoardController getInstance() {return instance;}
	
	// **함수를 왜 써야 하는지 생각하기
	
	// 1. 글쓰기 제어 메소드
		// 함수명 : 임의, 매개변수 : BoardDto , 리턴값 : boolean 글쓰기 성공 true / 글쓰기 실패 false 
	public boolean write(BoardDto boardDto) {
		// [1] dao 에게 저장할 객체를 전달하고 응답받기
		boolean result = BoardDao.getInstance().write(boardDto);
		// [2] view 에게 응답하기
		return result;
	} // write end
	
	
	// 2. 모든 글 출력 제어 메소드
		// 함수명 : 임의, 매배변수 : x, 리턴값 : BoardDto[]
	public BoardDto[] findAll() {
		// [1] dao 에게 모든 게시물 정보를 요청하고 응답받기
		BoardDto[] result = BoardDao.getInstance().findAll();
		// [2] view 에게 응답하기
		return result; 
	} // findAll end
	
} // class end
