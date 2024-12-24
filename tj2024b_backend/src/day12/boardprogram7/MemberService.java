package day12.boardprogram7;

import java.util.Scanner;

public class MemberService {
	// 멤버변수 // 생성자
	
	// 메소드
	// 회원가입 함수
	public void signUp(Scanner scan, MemberDto[] members) {
		System.out.println("======= 회원가입 ======");
		System.out.print("아이디 : "); String id = scan.next();
		System.out.print("비밀번호 : "); String pwd = scan.next();
		System.out.print("닉네임 : "); String name = scan.next();
		
		// 객체화. // 생성자를 이용한 빠른 객체 생성
		MemberDto memberDto = new MemberDto(id, pwd, name);
		
		// 반복활용한 회원목록에서 빈공간 찾아서 memberDto 대입
		for(int index = 0; index <= members.length-1; index++) {
			if(members[index] == null) {
				members[index] = memberDto;
				System.out.println("* 회원가입 성공 *");
				return; // 함수 종료
			} // if end
		} // for end
	} // func sign end
	
	
	
	// 로그인 함수
	public String login(Scanner scan, MemberDto[] members) {
		System.out.println("======== 로그인 =======");
		System.out.print("아이디 : ");	String id = scan.next();
		System.out.print("비밀번호 : ");	String pwd = scan.next();
		// 기존 회원목록에서 입력받은 값과 비교하여 같은 값 찾기
		for(int index = 0; index <= members.length-1; index++) {
			MemberDto memberDto = members[index];
			if(memberDto != null) {
				if(memberDto.getId().equals(id) && memberDto.getPwd().equals(pwd)) {
					System.out.println("로그인 성공");
					return memberDto.getId(); // 로그인 성공한 아이디 반환 // 반환할 타입과 함수 타입 통일 시켜야함 void -> String
				}
			}
		} // for end
		System.out.println("로그인 실패");
		return null; // 로그인 실패시 null 반환
	} // func login end
	
	
} // class end








