package day18.step2_JDBC;

public class Example2 {
	public static void main(String[] args) {
		
		// [확인]
		Dao.getInstance();
		
		// [insert 확인]
		Dao.getInstance().insert();
		// [select 확인]
		Dao.getInstance().select();
		// [update 확인] 조건 : uno=2인 uname"강호동"수정
		Dao.getInstance().update();
		// [delete 확인]
		Dao.getInstance().delete();
	} // main end
}
