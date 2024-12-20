package day10;

public class BoardDto {
	// D(date) t(transfer) o(object) 데이터 이동 객체
	// 목적 : 여러 사람들이 작업할 때 클래스명에 공통적으로 dto를 명시함으로써 클래스 사용처 파악이 쉽다.
		// 추후에 dto, vo, dao, controller, service, view, entity
	// DTO : 데이터베이스(DB)에 저장된 자료들을 자바로 이동할 때 사용되는 객체
		// 자바와 자바스크립트는 휘발성임(영구저장 불가능)
		// 자바/자바스크립트 <--연결--> DB(영구저장 가능)
	// 관례적으로 모든 멤버변수는 private,
	//	디폴트생성자 + 풀매개변수 + 그 외는 알아서,
	//	getter/setter 메소드, 
	//	toString 메소드 : 객체주소값대신 객체멤버변수값반환함수
	
	
	
	// 멤버변수 private
	private String title;
	private String content;
	private String writer;
	
	
	// 생성자 디폴트, 풀매개변수, 설계에 따라 만들기
		// 디폴트생성자
	public BoardDto() {}
		// 풀매개변수
	public BoardDto(String title, String content, String writer) {
		this.title = title;	this.content = content;	this.writer = writer;
	};
	
	
	// 메소드 멤버변수마다 getter/setter, toString
		// private 멤버변수는 외부 클래스로부터 차단했으므로 간접적으로 접근할 수 있도록 public 메소드 제공
		// 멤버변수 1개당 getter 호출 / setter 저장
	public String getTitle() {return this.title;}
	public void setTitle(String title) {this.title = title;}
	
	public String getContent() {return this.content;}
	public void setContent(String content) {this.content = content;}
	
	public String getWriter() {return this.writer;}
	public void setWirter(String writer) {this.writer = writer;}
		// toString() : 기본적으로 객체를 호출하면 주소(참조)값이 반환되지만, 오버라이딩(재정의)해서 주소값대신 원하는 반환값 정의

//	public String toString() {
//		return "객체참조값 대신 출력하고 싶은 문자열";
//	}
	
	@Override // 소스 자동완성
	public String toString() {
		return "BoardDto [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
	
	
	
	
}







