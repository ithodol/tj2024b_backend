package day10;

public class Board {

	// 클래스 멤버
	// 1. 멤버변수
	String title;
	String content;
	String writer;
	
	// 2. 생성자 : 객체(new)생성시 조기화(선택사항)를 담당하는 역할
		// 규칙 : 생성자명은 클래스명과 동일하다. 리턴값 없음, 매개변수 없음. 생성자 사용시 매개변수의 타입, 갯수 일치해야함
		//		(동일하지 않으면 함수가 돼버림)
		// 목적 : 주로 객체 생성시 매개변수를 받아 멤버변수에 대입한다, 유효성 검사할 때 사용됨
		// 관례적으로 매개변수과 멤버변수명이 동일하게 하되, 식별 가능하게끔 멤버변수명 앞에 this를 붙인다
		// 오버로드 : 원래는 동일한 이름으로 여러개의 선언이 불가능하지만,
		//			매개변수 갯수, 타입, 순서가 다르면 오버로딩을 지원한다(함수/생성자)(변수에는 적용x)
		// 주의할점 : 멤버변수가 많으면 과도한 생성자의 갯수가 경우에따라 늘어날 수 있다(관리/유지보수 힘듦)
		// 사용할 지점 : 객체를 만들 때 객체내 멤버변수에 처음값을 대입하고자할 때 생성자를 만든다
		//				=>	객체가 많을 때 상황에 따라 처음값(초기화)이 다르면 다양하게 생성자를 상황에 맞추어 만든다
		//				ex) 게시물 : 게시물등록, 게시물수정, 게시물 삭제 생성자가 필요함
		//					-> 문법이 중요한 게 아니라, 내가 객체를 만들 때 객체내 멤버변수 값들을 *대입할 것이 있는지 초기에 빠르게 판단*
	
		// 1. 디폴트 생성자 : 매개변수가 없는 생성자
	Board(){}
	
		// 2. 매개변수 1개 생성자
	Board(String title){
		this.title = title;
	}
	
		// 3. 매개변수 3개 생성자
	Board(String title, String content, String writer){
		this.title = title;	this.content = content;	this.writer = writer;
	}
	
	
	
	
	// 3. 메소드/멤버함수
	
}
