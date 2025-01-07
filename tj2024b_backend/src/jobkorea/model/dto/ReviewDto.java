package jobkorea.model.dto;

public class ReviewDto {

	private int rno;
	private int rrating;
	private String rcontent;
	private String rdate;
	
	
	public ReviewDto() {}
	public ReviewDto(int rno, int rrating, String rcontent, String rdate) {
		super();
		this.rno = rno;
		this.rrating = rrating;
		this.rcontent = rcontent;
		this.rdate = rdate;
	}
	
	
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getRrating() {
		return rrating;
	}
	public void setRrating(int rrating) {
		this.rrating = rrating;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
}
