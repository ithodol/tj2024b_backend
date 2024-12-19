package day09;

import java.util.Scanner;

/*
	자바 과제9 : 회원 서비스 구현하기 
	   - 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체, 배열
	   - 회원은 최대 100명 까지 저장할수 있다.
	   - 회원정보는 아이디 , 비밀번호 , 닉네임을 갖습니다.
	   - 회원클래스와 회원서비스 클래스를 정의하십시오.
	   - 회원가입함수, 로그인함수 구현
	      회원가입 함수 : 아이디,비밀번호,닉네임 3개의 각 정보를 입력받아 객체 생성 후 배열에 저장
	      로그인 함수 : 아이디,비밀번호를 입력받아 기존의 저장된 정보와 일치한 정보가 있으면 '로그인성공' 아니면 '로그인실패' 출력한다.
	   - 프로그램 초기 메뉴 : 1.회원가입 2.로그인
	   제출 : 카톡 git 주소
	   
	   
	   ** 권장 순서
		   1. 구현하고자 하는 초기 화면 구성
		   2. 객체(클래스)설계, 메모리 설계
		   3. 메소드 구성 
	   
	   
	   
*/

public class Example2 {

	public static void main(String[] args) {
		InfoService is = new InfoService();
		
		Info[] infoList = new Info[100];
		
		while(true) {
			System.out.println("======== 선택 ========");
			System.out.print("1.회원가입 2.로그인 : ");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if(choose == 1) {
				is.infoAdd(scan, infoList);
			}else if(choose == 2) {
				is.infoPrint(scan, infoList);
			}
			
		} // while end
		
	} // main void end
	
} // class end









