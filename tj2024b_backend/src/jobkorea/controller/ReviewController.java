package jobkorea.controller;

import java.util.ArrayList;
import java.util.HashMap;

import jobkorea.model.dao.ReviewDao;
import jobkorea.model.dto.ReviewDto;

public class ReviewController {
	// 싱글톤
	private static ReviewController instance = new ReviewController();
	private ReviewController() {}
	public static ReviewController getInstance() { return instance; }
	
	// 후기 등록
	public boolean rWrite(ReviewDto reviewDto, int loginMno, int pno) {
		boolean result = ReviewDao.getInstance().rWrite(reviewDto, loginMno, pno);
		return result;
	}
	
	
	// 합격한 기업리스트
	public ArrayList<HashMap<String, String>> rPassPrint(int mno) {
		ArrayList<HashMap<String, String>> passList = ReviewDao.getInstance().rPassPrint(mno);
		return passList;
	}
	
	
	// 작성한 후기 리스트 (기업후기 출력)
	public ArrayList<HashMap<String, String>> rPrintAll(int mno) {
		ArrayList<HashMap<String, String>> printList = ReviewDao.getInstance().rPrintAll(mno);
		return printList;
	}
	
	
	// 후기 수정
	public boolean rUpdate(ReviewDto reviewDto) {
		boolean result = ReviewDao.getInstance().rUpdate(reviewDto);
		return result;
	}
	
	

	
} // class end