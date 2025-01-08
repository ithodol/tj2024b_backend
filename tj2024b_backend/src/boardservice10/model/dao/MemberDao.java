package boardservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import boardservice10.model.dto.MemberDto;

public class MemberDao {
	private Connection conn; 
	private String dburl = "jdbc:mysql://localhost:3306/boardservice10";
	private String dbuser = "root";
	private String dbpwd = "1234";
	// 싱글톤
	private static MemberDao instance = new MemberDao();
	private MemberDao() {
		try {
			// 1. JDBC 클래스 드라이버 로드, Class.forname() *예외처리 try{} catch{}
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. 설정한 경로/계정//비밀번호로 DB 서버 연동 시도, 결과를 (구현체) 반환
			conn = DriverManager.getConnection(dburl, dbuser, dbpwd);
			}catch(Exception e){
				System.out.println("[DB 연동 실패]" + e);
		}
	}	
	public static MemberDao getInsetance() {return instance;}
	
	// 1. 회원가입 SQL 처리 메소드
	public boolean signup(MemberDto memberDto) {
		try {
			// [1] SQL 작성
			String sql = "insert into member(mid, mpwd, mname, mphone) values('"+memberDto.getMid()+"','"+memberDto.getMpwd()+"','"+memberDto.getMname()+"','"+memberDto.getMphone()+"')";
			
			// [2] DB와 연동된 곳에 SQL 기재한다 / sql을 기재하는 방법 : conn.prepareStatement(sql) 
			PreparedStatement ps =  conn.prepareStatement(sql);
			
			// [3] 기재된 SQL을 실행하고 결과를 받는다 / 기재된 sql을 실행하는 방법 : ps.executeUpdate()
			int count = ps.executeUpdate();
			
			// [4] 결과에 따른 처리 및 반환을 한다
			if(count == 1) {return true;}
		}catch(SQLException e) {System.out.println(e);}
		return false;
		
	}
	
	
	
	
	// 3. 아이디찾기 SQL 처리 메소드
	public String findId(MemberDto memberDto) {
		try {
			// [1] SQL 작성 // mname ='유재석' and phone = ? : mname은 어떤 값이 들어갈지 정해져있지않음. 매개(변수)
			String sql = "select mid from member where mname = ? and mphone = ?";
			
			// [2] DB와 연동된 곳에 SQL 기재한다
			PreparedStatement ps = conn.prepareStatement(sql);
			// ps.setString(1, "유재석"); // ps.setString() : mnamedl String 타입이라서
			ps.setString(1, memberDto.getMname());
			ps.setString(2, memberDto.getMphone());
			
			// [3] 기재된 SQL을 실행하고 결과를 받는다
			ResultSet rs = ps.executeQuery();
			
			// [4] 결과에 따른 처리 및 반환을 한다
			if(rs.next() ) { // .next() 다음으로 이동.
				String findMid = rs.getString("mid");
				return findMid; // 찾았다. 찾은 아이디 반환
			} // if end
		}catch(SQLException e) {System.out.println(e);}
		return null; // 못 찾았다. null 반환
	} // f findId end
	
	
	
	// 4. 비밀번호찾기 SQL 처리 메소드
	public String findPwd(MemberDto memberDto) {
		try {
			String sql = "select * from member where mid = ? and mphone = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, memberDto.getMid());
				ps.setString(2, memberDto.getMphone());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String findPwd = rs.getString("mpwd");
				return findPwd;
			} // if 
		}catch(SQLException e) {System.out.println(e);}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

