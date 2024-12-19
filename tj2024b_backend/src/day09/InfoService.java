package day09;

import java.util.Scanner;

public class InfoService {

	// 회원가입
	void infoAdd(Scanner scan, Info[] infoList) {
		System.out.println("1.회원가입 선택");
		System.out.println("- 아이디");	String id = scan.next();
		System.out.println("- 비밀번호");	String pw = scan.next();
		System.out.println("- 닉네임");	String user = scan.next();
		
		Info info = new Info();
		info.id = id;
		info.pw = pw;
		info.user = user;
		
		for(int index = 0; index <= infoList.length-1; index++) {
			if(infoList[index] == null) {
				infoList[index] = info;
				break;
			}
		} // for end
	} // main void end
	
	
	// 로그인
	void infoPrint(Scanner scan, Info[] infoList) {
		boolean state = false;
		System.out.println("2.로그인 선택");
		System.out.println("- 아이디 : ");	String checkId = scan.next();
		System.out.println("- 비밀번호 : ");	String checkPw = scan.next();
		for(int index = 0; index <= infoList.length-1; index++) {
			if(infoList[index] != null &&
					infoList[index].id.equals(checkId) &&
					infoList[index].pw.equals(checkPw)) {
				state = true;
				break;
			}
		} // for end
		if(state) {
			System.out.print("로그인 성공 \n");
		}else{
			System.out.print("로그인 실패 \n");
		}
	}
	
	
	
} // class end



















