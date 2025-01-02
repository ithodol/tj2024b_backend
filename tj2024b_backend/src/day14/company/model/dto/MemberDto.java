package day14.company.model.dto;

public class MemberDto {
	// 멤버변수
	private String position;
	private String name;
	
	// 생성자
	public MemberDto() {}
	public MemberDto(String position, String name) {
		this.position = position;
		this.name = name;
	}
	
	
	// 메소드 get/set
	public String getPosition() {return this.position;}
	public String getName() {return this.name;}
	
	public void setPosition(String position) {this.position = position;}
	public void setName(String name) {this.name = name;}
}
