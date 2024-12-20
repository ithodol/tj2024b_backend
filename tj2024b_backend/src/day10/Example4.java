package day10;

import java.util.Scanner;

/*
	자바 과제10 : 회원 서비스 구현하기 
   - 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수/메소드/생성자)/객체, 배열
   - 회원은 최대 100명 까지 저장할수 있다.
   - 회원정보는 아이디 , 비밀번호 , 닉네임을 갖습니다.
   		+ 모든 멤버변수는 private 키워드를 적용
   		+ 멤버변수는 private 이므로 외부 클래스에서 호출시 getter/setter 함수를 활용함
   		+ 회원가입과 로그인시 사용되는 회우너객체는 생성자를 활용함
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



public class Example4 {

	public static void main(String[] args) {
		InfoService is = new InfoService();
		InfoDto[] infoList = new InfoDto[100];
		
		
		
		while(true) {
			System.out.println("====== 선택 ======");
			System.out.println("1.회원가입 2.로그인");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if(choose == 1) {
				is.infoAdd(scan, infoList);
			}else if(choose == 2) {
				is.infoPrint(scan, infoList);
			}
			
		} // while end
	}// main end
	
	
	
	
	
} // class end


























