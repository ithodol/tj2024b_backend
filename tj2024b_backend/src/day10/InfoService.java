package day10;

import java.util.Scanner;

public class InfoService {

	// Example4 - main 함수에 이미 만들어놓았기 때문에 또 만들 필요없음
	// InfoDto[] infoList = new InfoDto[100];
	
	// InfoDto info = new InfoDto(); (18번 줄 참고)
	
	void infoAdd(Scanner scan, InfoDto[] infoList ) {
		System.out.println("-- 회원가입 --");
		System.out.println("아이디 : "); String id = scan.next();
		System.out.println("비밀번호 : "); String pw = scan.next();
		System.out.println("닉네임 : ");	String user = scan.next();
		
		// new infoDto를 함수 밖에 생성시 한번만 실행됨 -> 최근 자료만 저장됨 -> 앞전에 회원가입한 정보로는 로그인 불가능함.
		// 함수 안에 생성시 회원가입 버튼을 눌렀을 때마다 실행됨 -> 누적 가능
		// 내가 new infoDto를 함수 밖으로 뺀 이유 : 아래 함수(infoPrint)에서 info.get을 하기 위해서 => 52번 줄
		InfoDto info = new InfoDto();
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

//		info.getId(); 
//		info.getPw();
		// info에서 get할 필요 없음
		// 왜냐? infoAdd 함수에서 infoList에 정보를 넣어줬기 때문에 InfoList에서 get가능함 (61번 줄)
		
		
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





















