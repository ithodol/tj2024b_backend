package boardservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import boardservice10.model.dto.MemberDto;

public class MemberDao extends Dao {
			// 하위클래스 extends 상위클래스

	// 싱글톤
	private static MemberDao instance = new MemberDao();
	private MemberDao() {}	
	public static MemberDao getInsetance() {return instance;}
	
	// 1. 회원가입 SQL 처리 메소드
	public boolean signup(MemberDto memberDto) {
		try {
			// [1] SQL 작성
			String sql = "insert into member(mid, mpwd, mname, mphone) values('"+memberDto.getMid()+"','"+memberDto.getMpwd()+"','"+memberDto.getMname()+"','"+memberDto.getMphone()+"')";
			
			// [2] DB와 연동된 곳에 SQL 기재한다 / sql을 기재하는 방법 : conn.prepareStatement(sql) 
			PreparedStatement ps =  conn.prepareStatement(sql);
								// 오류해결 : super DAO에 있는 conn을 private->public
			// [3] 기재된 SQL을 실행하고 결과를 받는다 / 기재된 sql을 실행하는 방법 : ps.executeUpdate()
			int count = ps.executeUpdate();
			
			// [4] 결과에 따른 처리 및 반환을 한다
			if(count == 1) {return true;}
		}catch(SQLException e) {System.out.println(e);}
		return false;
		
	}
	
	// 2. 로그인 SQL 처리 메소드
	public int login(MemberDto memberDto) {
		try {
			// int 사용 이유 : SQL로 조회된 회원번호를 반환하기 위해서 = 로그인 성공시 회원번호를 저장하기 위해서
			// [1] SQL 작성
			String sql = "select mno from member where mid = ? and mpwd = ?";
			// [2] DB와 연동된 곳에 SQL 기재한다
			PreparedStatement ps = conn.prepareStatement(sql);
			// [2-1] 기재된 SQL에 매개변수 값을 대입한다
			ps.setString(1, memberDto.getMid());
			ps.setString(2, memberDto.getMpwd());
			// [3] 기재된 SQL을 실행하고 결과를 받는다
			ResultSet rs = ps.executeQuery();
			// [4] 결과에 따른 처리 및 반환을 한다
			if(rs.next()) {
				int mno = rs.getInt("mno");
				return mno;
			} // if end
		}catch(SQLException e){System.out.println(e);}
		return 0;
	} // f login end
	
	
	
	
	// 3. 아이디찾기 SQL 처리 메소드
	public String findId(MemberDto memberDto) {
		try {
			// [1] SQL 작성 // mname ='유재석' and phone = ? : mname은 어떤 값이 들어갈지 정해져있지않음. 매개(변수)
			String sql = "select mid from member where mname = ? and mphone = ?";
			
			// [2] DB와 연동된 곳에 SQL 기재한다
			PreparedStatement ps = conn.prepareStatement(sql);
			// ps.setString(1, "유재석"); // ps.setString() : mname이 String 타입이라서
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
	} // f findPwd end
	
	
	
	// 5. 내 정보 보기 컨트롤러 메소드
	public MemberDto myInfo(int loginMno) {
		try {
			// [1] SQL 작성
			String sql = "select * from member where mno = ?";
			
			// [2] DB와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// [2-1] 기재된 SQL에 매개변수 값 대입
			ps.setInt(1, loginMno);
			
			// [3] 기재된 SQL 실행하고 결과 받기
			ResultSet rs = ps.executeQuery();
			
			// [4]
			if(rs.next()) {
				MemberDto memberDto = new MemberDto();
				memberDto.setMid( rs.getString("mid") );
				memberDto.setMname( rs.getString("mname" ) );
				memberDto.setMphone( rs.getString("mphone") );
				memberDto.setMdate( rs.getString("mdate") );
				return memberDto; // 조회된 회원정보를 반환
			}
		}catch(SQLException e){System.out.println(e);}
		return null; // 조회한 회원정보가 없으면 null 반환
	} // f myInfo end
	
	
	
	
	 // 6. 회원탈퇴 SQL 처리 메소드
	public void delete( int loginMno ) {
		try {
			String sql = "delete from member where mno = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt( 1 , loginMno );
			int count = ps.executeUpdate();
		}catch( SQLException e ) { System.out.println(e); }
		return;
	} // f delete end 
	

	
	// 7. 회원 수정 SQL 처리 메소드
	public boolean update(MemberDto memberDto) {
		try {
			// [1] SQL 작성
			String sql = "update member set mpwd = ?, mname = ?, mphone =? where mno = ?";
			// [2] DB와 연동된 곳(conn)에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			// [*] 기재된 SQL에 매개변수 값 대입
			ps.setString(1, memberDto.getMpwd());
			ps.setString(2, memberDto.getMname());
			ps.setString(3, memberDto.getMphone());
			ps.setInt(4, memberDto.getMno());
			// [3] 기재된 SQL 실행하고 결과 받기
			int count = ps.executeUpdate();
			// [4] 결과에 따른 처리 및 반환
			if(count == 1) {return true;} // 수정 성공했을 때 
		}catch(SQLException e){System.out.println(e);}
		return false; // 수정 실패했을 때
	} // f update end
	
	
} // class end






















