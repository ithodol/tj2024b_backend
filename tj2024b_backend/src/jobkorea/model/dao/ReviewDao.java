package jobkorea.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;

public class ReviewDao {

	private Connection conn;
	private String dburl = "jdbc:mysql://localhost:3306/jobkorea";
	private String dbuser = "root";
	private String dbpwd = "1234";
	
	// 싱글톤
	private static ReviewDao instance = new ReviewDao();
	private ReviewDao() { // 생성자
	    try {    // 예외처리
	       // 1) JDBC 클래스 드라이버 로드 : .Class.forName()
	       Class.forName("com.mysql.cj.jdbc.Driver");
	       // 2) 설정한 경로 / 계정 / 비밀번호로 DB 서버 연동 시도 후 결과(구현체) 반환  
	       conn = DriverManager.getConnection(dburl,dbuser,dbpwd);
	       System.out.println(">> DB 연동 성공");
	    }catch (Exception e) {
	       System.out.println(">> DB 연동 실패 "+ e);
	    }
	}
	public static ReviewDao getInstance() {return instance;}
	
	
	
}
