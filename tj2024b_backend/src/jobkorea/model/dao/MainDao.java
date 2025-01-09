package jobkorea.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jobkorea.model.dto.MemberDto;

  
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
	
	// 일반 회원가입 SQL 처리 메소드 
	public boolean mSignUp(MemberDto memberDto) {
		try {
			// SQL 작성
			
			String sql = "insert into member(mid, mpwd, mname, mgener, mdate, maddr) values('"+memberDto.getMid()+"', '"+memberDto.getMpwd()+"', '"+memberDto.getMname()+"','"+memberDto.isMgender()+"' '"+memberDto.getMdate()+"', '"+memberDto.getMaddr()+"')";
	
			
			// DB와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 기재된 SQL을 실행하고 결과 받기
			int count = ps.executeUpdate();
			
			// 결과에 따른 처리 및 반환
			if(count == 1) {return true;}
		}catch(SQLException e) {System.out.println(e);}
		return false;
		
	} // f mSignUp end
	
	
	
	
	// 일반 로그인 SQL 처리 메소드
	public boolean mLogin() {
		
	}
	
	
	// 일반 로그아웃 SQL 처리 메소드
	public boolean mLogout() {
		
	}
	
	
	
	
	// [1] 우수기업 R
    public void bestList() {
       try {
          String sql = "select e.ename , avg(r.rrating) as ravg from review r left join enterprise e "
                   + "on  r.eno = e.eno group by r.eno order by ravg desc";
          PreparedStatement ps = conn.prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          
          while(rs.next()) {
             int i = 0;
             String list = rs.getString("ename");
             String rating = rs.getString("ravg");
             System.out.println(i +"위 기업명 : " + list + "평균별점 : " + rating + " 점");
             i++; // i++ 되게 하기 -> 우수기업리스트 테이블??? / 소수점 1자리 까지만 나오게 하기 //
          }
       }catch (Exception e) {
          System.out.println(e);
      }
    }
    // [2] 후기 R
    public void reviewList(String ename) {
      try {
         String sql = "select e.ename,  r.rcontent, r.rrating from review r join enterprise e "
                  + "on r.eno = e.eno  where e.ename = ?";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, ename);
         ResultSet rs = ps.executeQuery();
         
         while(rs.next()) {
            String name = rs.getString("ename");
            String rcontent = rs.getString("rcontent");
            String rrating = rs.getString("rrating");
            
            System.out.println("기업명 : "+ name + "후기 : " + rcontent + "별점 : " + rrating);
         }
      }catch (SQLException e) {
         System.out.println(e);
      }
   }
}
