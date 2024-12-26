package day13.example.view;

import java.util.Scanner;

import day13.example.controller.WaitingController;
import day13.example.model.dto.WaitingDto;

public class WaitingView {

	// 싱글톤 만들기
	private WaitingView() {}
	private static WaitingView instance = new WaitingView();
	public static WaitingView getInstance() {return instance;}
	
	// 멤버변수
	private Scanner scan = new Scanner(System.in);
	
	// 1. 메인 페이지
	public void index() {
		while(true) {
			System.out.println("===== index =====");
			System.out.print("1.대기등록 2.대기현황");	
			int choose = scan.nextInt();
			if(choose == 1) {
				// 등록 메소드 호출
				write();
			}else if(choose == 2) {
				// 전체출력 메소드 호출
				printAll();
			}
		} // while end
	} // index end
	
	
	// 2. 등록 페이지 (대기등록)
	public void write() {
		System.out.println("===== write =====");
		System.out.print("전화번호 : ");		String tel = scan.next();
		System.out.print("인원수 : ");		int count = scan.nextInt();
		
		// 객체화
		WaitingDto waitingDto = new WaitingDto(tel,count);
		
		boolean result = WaitingController.getInstance().write(waitingDto); 
		
		if(result == true) {
			System.out.println("[대기등록 성공]");
		}else {
			System.out.println("[대기등록 실패]");
		}
		
		
	} // write end
	
	
	// 3. 전체 출력 페이지(대기현황)
	public void printAll() {
		System.out.println("===== printAll =====");
		System.out.println("순번\t전화번호\t인원수");
		
		WaitingDto[] result = WaitingController.getInstance().printAll();
		
		for(int index = 0; index <= result.length-1; index++) {
			WaitingDto waiting = result[index];
			if(waiting != null) {
				System.out.printf("%d\t%s\t%d\n",
									index,
									waiting.getTel(),
									waiting.getCount()
									);
			}
		} // for end
	} // printAll end
	
	
	
	
	
	
}

















