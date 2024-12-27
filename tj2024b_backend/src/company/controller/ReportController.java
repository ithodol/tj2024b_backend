package company.controller;

import java.util.ArrayList;

import company.model.dao.ReportDao;
import company.model.dto.ReportDto;

public class ReportController {
	// 싱글톤
	private ReportController() {}
	private static ReportController instance = new ReportController();
	public static ReportController getinstance() {return instance;}
	

	// 회원등록 페이지
	
	
	// 로그인 페이지
	
	
	// 회원수정 페이지
	
	
	// 회원삭제 페이지
	
	
	
	
	// 보고서 등록
	public boolean create(ReportDto reportDto) {
		boolean result = ReportDao.getInstance().create(reportDto);
		return result;
	}
	
	// 보고서 내역
	public ArrayList<ReportDto> printAll(){
		ArrayList<ReportDto> result = ReportDao.getInstance().printAll();
		return result;
	}

	
	// 보고서 수정
	public boolean update(int uIndx, ReportDto reportDto) {
		boolean result = ReportDao.getInstance().update(uIndx, reportDto);
		return result;
	}
	
	
	// 보고서 삭제
	public boolean delete(int dIndex) {
		boolean result = ReportDao.getInstance().delete(dIndex);
		return result;
	}
	
}
