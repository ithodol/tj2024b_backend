package day13.example;

import day13.example.view.WaitingView;

/*
	자바 과제12 : 식당 대기번호 발행 프로그램
		1. MVC패턴으로 패키지와 클래스 구성
			- appStart 클래스
			- WaitingView 클래스
			- WaitingController 클래스
			- WaitingDao 클래스
			- WaitingDto 클래스
		2. 전화번호와 인원수를 입력받아 대기등록 기능 구축하기
		3. 현재 모든 대기명단을 출력하는 기능 구축하기
	제출 : 카톡 git 주소	
*/
public class AppStart {
	public static void main(String[] args) {
		// 싱글톤 메소드 호출
		WaitingView.getInstance().index();	
	}

	
}
