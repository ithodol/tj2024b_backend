package jobkorea.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import boardservice10.model.dto.MemberDto;

public class MainDao {

	private Connection conn;
	private String dburl = "jdbc:mysql://localhost:3306/jobkorea";
	private String dbuser = "root";
	private String dbpwd = "1234";
	
	// 싱글톤
	private static MainDao instance = new MainDao();
	private MainDao() { // 생성자
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
	public static MainDao getInstance() {return instance;}
	
	// 일반 회원가입 SQL 처리 메소드 // boolean은 sql에 어떻게 저장하나요
	public boolean mSignUp(MemberDto memberDto) {

		// SQL 작성
		String sql = "insert into member(mid, mpwd, mname, mdate, maddr) values('"+memberDto.getMid()+"', '"+memberDto.getMpwd()+"', '"+memberDto.getMname()+"', '"+memberDto.getMdate()+"', '"+memberDto.getMaddr()+"')";
		boolean sqlB = "insert into member(mgender) value('"+memberDto.isMgender()+"')";
		
		
		// DB와 연동된 곳에 SQL 기재
		PreparedStatement ps = conn.prepareStatement(sql);
		
		// 기재된 SQL을 실행하고 결과 받기
		int count = ps.executeUpdate();
		
		// 결과에 따른 처리 및 반환
		if(count == 1) {return true;}

		return false;
		
	}
	
	
	// 일반 로그인 SQL 처리 메소드
	public boolean mSignUp() {
		
	}
	
	
	// 일반 로그아웃 SQL 처리 메소드
	public boolean mSignUp() {
		
	}
	
	
}
