package day12.libraryprogram;

import java.util.Scanner;

/*
	 [혼자 실습] 도서관리 프로그램
		1. 초기메뉴 : 회원가입 , 로그인 제공합니다.
		2. 회원가입시 일반인 인지 관리자 인지 구분 하여 가입을 진행합니다.
		3. 로그인시 일반인 인지 관리자 인지 구분하여 로그인을 진행합니다.
		4. 로그인 성공시
			4-1 관리자인경우 메뉴 : 1.도서등록 2.도서목록 제공 합니다.
			4-2 일반인경우 메뉴 : 1. 도서대여 2. 도서반납 3.대여현황 제공 합니다.
		5. 관리자는 도서정보를 입력받아 도서등록을 처리 합니다.
		6. 관리자는 현재 등록된 모든 도서목록을 출력 합니다.
		7. 일반인은 도서대여시 대여할 도서번호를 입력받아 대여가 가능하면 대여를 진행합니다.
		8. 일반인은 도서반납시 현재 내가 대여한 도서번호를 입력하여 반납을 진행합니다.
		9. 일반인은 내가 대여한 모든 도서 현황을 출력합니다.
		10. 로그아웃을 제공 합니다.
		11. 회원과 도서 정보 멤버변수는 각 3개 이상씩 하여 진행합니다. 
*/

public class LibraryProgram {

	public static void main(String[] args) {
		
		MemberDto[] members = new MemberDto[100]; // 100개까지 저장할 수 있는 객체 배열 생성
		MemberService ms = new MemberService(); // 함수 가져다가 쓰기
		
		while(true) {
			System.out.println("===== 전은서 도서관 =====");
			System.out.println("1.회원가입 2.로그인");
			
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if(choose == 1) {
				// 회원가입 함수 호출
				System.out.println(">> 회원가입 선택");
				System.out.println("0.관리자 1.일반");
				int choose2 = scan.nextInt();
				if(choose2 == 0) { // 관리자를 선택하면
					// 관리자 회원가입 함수 호출
				}else if(choose2 == 1) { // 일반을 선택하면
					// 일반 회원가입 함수 호출
				}
				
				
				
			}
			else if(choose == 2) {
				// 로그인 함수 호출
			}
			
		}
	} // main end
	
	
} // class end



















