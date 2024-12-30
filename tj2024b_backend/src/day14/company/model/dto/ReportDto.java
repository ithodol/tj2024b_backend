package day14.company.model.dto;

public class ReportDto {
	
	// 멤버변수
	private String type;
	private String content;
	private String writer;

	
	// 생성자
	public ReportDto() {}
	public ReportDto(String type, String content, String writer) {
		this.type = type;
		this.content = content;
		this.writer = writer;
	}
	
	
	// 메소드 get/set
	public String getType() {return this.type;}
	public String getContent() {return this.content;}
	public String getWriter() {return this.writer;}
	
	public void setType(String type) {this.type = type;}
	public void setConent(String content) {this.type = content;}
	public void setWriter(String writer) {this.type = writer;}
	
}