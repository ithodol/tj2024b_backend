package day12.libraryprogram;

public class MemberDto {
	
	// 멤버변수
	private String id;
	private String pw;
	private String user;
	
	// 생성자
	public MemberDto() {}
	public MemberDto(String id, String pw, String user) {
		this.id = id;
		this.pw = pw;
		this.user = user;
	}
	
	
	// 메소드
	public String getId() {return this.id;}
	public String getPw() {return this.pw;}
	public String getUser() {return this.user;}
	
	public void setId(String id) {this.id = id;}
	public void setPw(String pw) {this.id = pw;}
	public void setUser(String user) {this.id = user;}
	
}
