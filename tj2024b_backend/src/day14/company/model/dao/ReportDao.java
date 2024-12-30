package day14.company.model.dao;

import java.util.ArrayList;

import day14.company.model.dto.ReportDto;

public class ReportDao {
	// 싱글톤
	private ReportDao() {}
	private static ReportDao instance = new ReportDao();
	public static ReportDao getInstance() {return instance;}
	
	private ArrayList<ReportDto> reports = new ArrayList<>();
	

	// 보고서 등록
	public boolean create(ReportDto reportDto) {
		reports.add(reportDto);
		return true;
	}
	
	// 보고서 내역
	public ArrayList<ReportDto> printAll(){
		return reports; // 등록된 내역 출력만 
	}
	
	
	// 보고서 수정
	public boolean update(int uIndex, ReportDto reportDto) {
		if(uIndex > reports.size()-1) {
			return false;
		} // 입력받은 인덱스가 존재하는 내역의 인덱스보다 크면 false 반환
		reports.set(uIndex, reportDto); // 입력받은 인덱스에 입력받은 값 대입 .set(인덱스, 새로운 요소)
		return true;
		
	}
	
	
	// 보고서 삭제
	public boolean delete(int dIndex) {
		if(dIndex > reports.size()-1) {
			return false;
		}
		reports.remove(dIndex);
		return true;
	}
	
	
}