package day13.example.model.dto;

public class WaitingDto {

	private String tel;
	private int count;
	
	// 생성자
	public WaitingDto() {}
	public WaitingDto(String tel, int count) {
		this.tel = tel;
		this.count = count;
	}
	
	// 메소드 get/set
	public String getTel() {return this.tel;}
	public int getCount() {return this.count;}
	
	public void setTel(String tel) {this.tel = tel;}
	public void setCount(int count) {this.count = count;}
	
	
	
}
