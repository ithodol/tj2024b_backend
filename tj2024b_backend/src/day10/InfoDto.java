package day10;

public class InfoDto{

	// 멤버변수 InfoList
	private String id;
	private String pw;
	private String user;
	
	
	// 생성자
	public InfoDto() {}
	public InfoDto(String id, String pw, String user) {
		this.id = id; this.pw = pw; this.user = user;
	}
	
	
	// 메소드
	public String getId() {return this.id;}
	public void setId(String id) {this.id = id;}
	
	public String getPw() {return this.pw;}
	public void setPw(String pw) {this.pw = pw;}
	
	public String getUser() {return this.user;}
	public void setUser(String user) {this.user = user;}
}



