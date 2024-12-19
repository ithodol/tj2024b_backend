package day09;

import java.util.Scanner;

public class InfoService {

	// 회원가입
	void infoAdd(Scanner scan, Info[] infoList) {
		System.out.println(">> 회원가입 선택");
		System.out.println("- 아이디");	String id = scan.next();
		System.out.println("- 비밀번호");	String pw = scan.next();
		System.out.println("- 닉네임");	String user = scan.next();
		
		// 객체 생성
		Info info = new Info();
		info.id = id;
		info.pw = pw;
		info.user = user;
		
		// 회원가입 상태 확인
		boolean joinState = false;
		
		for(int index = 0; index <= infoList.length-1; index++) {
			if(infoList[index] == null) {
				infoList[index] = info; // 배열에 저장
				joinState = true;
				break;
			}
		} // for end
		if(joinState) {
			System.out.println("회원가입 완료");
		}else {
			System.out.println("회원가입 실패");
		}
	} // main void end
	
	
	// 로그인
	void infoPrint(Scanner scan, Info[] infoList) {
		// 로그인 상태 확인
		boolean loginState = false;
		System.out.println(">> 로그인 선택");
		System.out.println("- 아이디 : ");	String checkId = scan.next();
		System.out.println("- 비밀번호 : ");	String checkPw = scan.next();
		for(int index = 0; index <= infoList.length-1; index++) {
			if(infoList[index] != null &&
					infoList[index].id.equals(checkId) &&
					infoList[index].pw.equals(checkPw)) {
				loginState = true;
				break;
			}
		} // for end
		if(loginState) {
			System.out.print("로그인 성공 \n");
		}else{
			System.out.print("로그인 실패 \n");
		}
	} // main void end
	
	
	
} // class end



















