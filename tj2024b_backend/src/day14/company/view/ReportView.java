package day14.company.view;

import java.util.ArrayList;
import java.util.Scanner;

import day14.company.controller.ReportController;
import day14.company.model.dto.ReportDto;

public class ReportView {

	// 싱글톤
	private ReportView() {}
	private static ReportView instance = new ReportView();
	public static ReportView getinstace() {return instance;}
	
	private Scanner scan = new Scanner(System.in);
	
	public void infoIndex() {
		System.out.println("test");
	}
	// 회원 메인페이지
	
	
	// 회원등록 페이지
	
	
	// 로그인 페이지
	
	
	// 회원수정 페이지
	
	
	// 회원삭제 페이지
	
	
	
	// 보고서 메인페이지
	public void reportIndex() {
		while(true) {
			System.out.println("===== 보고서 메인 =====");
			System.out.println("1.보고서등록  2.보고서내역  3.보고서수정  4.보고서삭제");
			
			int choose2 = scan.nextInt();
			
			if(choose2 == 1) {create();}
			else if(choose2 == 2) {printAll();}
			else if(choose2 == 3) {update();}
			else if(choose2 == 4) {delete();}
		} // while end

	} // reportIndex end
	
	
	// 보고서 등록
	public void create() {
		System.out.println(">> 1.보고서 등록");
		System.out.print("타입 : ");		String type = scan.next();
		System.out.print("내용 : ");		String content = scan.next();
		System.out.print("작성자 : ");	String writer = scan.next();
		
		// 객체화
		ReportDto reportDto = new ReportDto(type, content, writer);
		
		// 결과값 가져오기
		boolean result = ReportController.getinstance().create(reportDto);
		
		if(result) {System.out.println("[보고서 등록 성공");}
		else {System.out.println("[보고서 등록 실패]");}
		
	} // create end
	
	
	// 보고서 내역
	public void printAll() {
		System.out.println(">> 2.보고서 내역");
		// 등록된 보고서 가져오기
		ArrayList<ReportDto> result = ReportController.getinstance().printAll();
		System.out.println("순번\t작성자\t타입\t내용");
		for(int index = 0; index <= result.size()-1; index++) {
			ReportDto report = result.get(index);
			System.out.printf("%d\t%s\t%s\t%s",
								index,
								report.getWriter(),
								report.getType(),
								report.getContent()
								);
		} // for end
		
	} // printAll end
	
	
	// 보고서 수정
	public void update() {
		System.out.println(">> 3. 보고서 수정");
		System.out.print("수정할 인덱스 : ");	int uIndex = scan.nextInt();
		System.out.print("(수정)타입 : ");		String type = scan.next();
		System.out.print("(수정)내용 : ");		String content = scan.next();
		System.out.print("(수정)작성자 : ");	String writer = scan.next();

		
		// 객체화
		ReportDto reportDto = new ReportDto(type, content, writer);
					// ****작성자 수정을 원치 않음. 일부 수정 방법 알아보기
		
		// 결과 가져오기
		boolean result = ReportController.getinstance().update(uIndex, reportDto);
		if(result) {System.out.println("[보고서 수정 성공");}
		else {System.out.println("[보고서 수정 실패]");}
		
	} // update end
	
	
	// 보고서 삭제
	public void delete() {
		System.out.println(">> 4. 보고서 삭제");
		System.out.print("삭제할 인덱스 : ");		int dIndex = scan.nextInt();
		
		boolean result = ReportController.getinstance().delete(dIndex);
		
		if(result) {System.out.println("[보고서 삭제 성공]");}
		else {System.out.println("[보고서 삭제 실패]");}
		
	} // delete end
	
	
	
	
}














