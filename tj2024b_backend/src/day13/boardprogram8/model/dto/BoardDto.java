package day13.boardprogram8.model.dto;

public class BoardDto {
	// 싱글톤X : 각 게시물의 정보를 저장할 목적이므로 서로 고유한 객체가 필요하기 때문
	
	// 멤버변수
	private String title;
	private String content;
	private String writer;
	
	// 생성자
	// 왜 생성자를 쓸까?
	// 왜 생성자를 두개를 만들까?
	public BoardDto() {}
	public BoardDto(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	
	// 메소드
	public String getTitle() {return this.title;}
	public String getContent() {return this.content;}
	public String getWriter() {return this.writer;}
	
	public void setTitle(String title) {this.title = title;}
	public void setContent(String content) {this.content = content;}
	public void setWriter(String writer) {this.writer = writer;}
	
}















