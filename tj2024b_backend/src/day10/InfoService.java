package day10;

import java.util.Scanner;

public class InfoService {

	InfoDto info = new InfoDto();
	InfoDto[] infoList = new InfoDto[100];
	
	void infoAdd(Scanner scan, InfoDto[] infoList ) {
		System.out.println("-- 회원가입 --");
		System.out.println("아이디 : "); String id = scan.next();
		System.out.println("비밀번호 : "); String pw = scan.next();
		System.out.println("닉네임 : ");	String user = scan.next();
		
		info.setId(id); 
		info.setPw(pw);
		info.setUser(user);
		
//		boolean addState = false;
		
		for(int index = 0; index <= infoList.length-1; index++) {
			if(infoList[index] == null) {
				infoList[index] = info;
//				addState = true;
				System.out.println("회원가입 완료");
				break;
			}
		} // for end
//		if(addState) {
//			System.out.println("회원가입 완료");
//		}else {
//			System.out.println("회원가입 실패");
//		}
		
	} // infoAdd end
	
	
	void infoPrint(Scanner scan, InfoDto[] infoList) {
		boolean loginState = false;
		System.out.println("-- 로그인 --");
		System.out.println("아이디 : ");	String checkId = scan.next();
		System.out.println("비밀번호 : ");	String checkPw = scan.next();
		
		info.getId(); 
		info.getPw();
//		System.out.println(info.getId());
		for(int index = 0; index <= infoList.length-1; index++) {
			if(infoList[index] != null && 
					infoList[index].getId().equals(checkId) &&
					infoList[index].getPw().equals(checkPw)) {
				loginState = true;
				break;
			}
		} // for end
		if(loginState) {
			System.out.println("로그인 성공 \n");
		}else {
			System.out.println("로그인 실패 \n");
		}
		
		
		
		
	} // infoPrint end
	
}





















