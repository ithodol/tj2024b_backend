package boardservice10.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import boardservice10.model.dto.BoardDto;

public class BoardDao extends Dao{

	// 싱글톤
	private static BoardDao instance = new BoardDao();
	private BoardDao() {};
	public static BoardDao getInstance() {return instance;}
	
	// 1. 전체 게시물 SQL 처리 메소드
	public ArrayList<BoardDto> findAll(){
		ArrayList<BoardDto> list = new ArrayList<>();
		// *조회된 레코드(=BoaardDto) 한개씩 저장하여 여러개의 레코드를 저장하는 리스트 객체
		
		try {
			String sql = "select * from board";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				// 레코드 : DB테이블의 가로(행) 데이터
				// 조회된 결과 레코드 1개 = 인스턴스 1개
				// 레코드 여러개 = 배열[] 또는 ArrayList 1개
				
				// (1) 현재 레코드의 각 속성별 값 반환하기
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				int bview = rs.getInt("bview");
				String bdate = rs.getString("bdate");
				int mno = rs.getInt("mno");
				int cno = rs.getInt("cno");
				// (2) 반환 속성값들을 dto(객체)로 만들기
				BoardDto boardDto = new BoardDto(bno, btitle, bcontent, bview, bdate, mno, cno);
				// (3) 생성된 dto(객체)를 리스트에 담기
				list.add(boardDto);
			} // while end
		}catch(SQLException e) {System.out.println(e);}
		return list; // 생성된 arrayList 객체 반환
	} // f findAll end
	
	
	// 2. 개별 게시물 SQL 처리 메소드
	public BoardDto findById(int bno) {
		try {
			String sql = "select *from board where bno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				BoardDto boardDto = new BoardDto(
											rs.getInt("bno"),
											rs.getString("btitle"),
											rs.getString("bcontent"),
											rs.getInt("bview"),
											rs.getString("bdate"),
											rs.getInt("mno"),
											rs.getInt("cno")
										);
				return boardDto;
			} // if end
		}catch(SQLException e) {System.out.println(e);}
		return null;
	} // findById end
	
	
	// 3. 게시물 작성
	public boolean write(BoardDto boardDto) {
		try {
			String sql = "insert into board(btitle, bcontent, cno, mno) values(?, ?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,  boardDto.getBtitle());
			ps.setString(2,  boardDto.getBcontent());
			ps.setInt(3,  boardDto.getCno());
			ps.setInt(4,  boardDto.getMno());
			int count = ps.executeUpdate();
			if(count == 1) {return true;}
		}catch(SQLException e) {System.out.println(e);}
		return false;
		
	} // write end
	
	
	// 4. 카테고리 전체 조회 SQL 메소드
	public ArrayList<BoardDto> categoryAll(){
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		try {
			String sql = "select * from category";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs =  ps.executeQuery();
			while(rs.next()) {
				BoardDto boardDto = new BoardDto();
				boardDto.setCno(rs.getInt("cno"));
				boardDto.setCname(rs.getString("cname"));
				list.add(boardDto);
			} // while end
		}catch(SQLException e) {System.out.println(e);}
		return list;
	}
	
	
	// 5. 게시물 수정 SQL 메소드 
	public boolean update(BoardDto boardDto) {
		try {
			String sql = "update board set btitle = ? , bcontent = ? where bno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, boardDto.getBtitle());
			ps.setString(2, boardDto.getBcontent());
			ps.setInt(3, boardDto.getBno());
			int count = ps.executeUpdate();
			if(count == 1) {return true;}
		}catch(SQLException e) {System.out.println(e);}
		return false;
	}
	
	
	
	// 6. 게시물 삭제 SQL 메소드 / bno : 삭제할 게시물 번호
	public boolean delete(int bno) {
		try {
			String sql = "delete from board where bno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
			int count = ps.executeUpdate();
			if(count == 1) {return true;}
		}catch(SQLException e) {System.out.println(e);}
		return false;
	}
	
	
	
	// 7. 내가 쓴 글 확인 SQL 메소드
		// 매개변수 : bno, mno, 특정 게시물(bno)의 작성자(mno) 일치 여부 확인
	public boolean writeCheck(int bno, int mno) {
		try {
			String sql = "select * from board where bno = ? and mno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
			ps.setInt(2, mno);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {return true;}
		}catch(SQLException e) {System.out.println(e);}
		return false;
	}
	

	
	
	
	
} // class end













