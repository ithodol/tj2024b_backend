package day10;

public class Example3 {

	public static void main(String[] args) {
		
		// [1] Dto 객체 생성하기
		BoardDto board = new BoardDto();
		// board.title = "안녕";
			// 오류 : title 멤버변수는 private 이기 때문
		board.setTitle("안녕");
		
		// System.out.println(board.title);
			// 오류 : title 멤버변수는 private 이기 때문
		System.out.println(board.getTitle());
		
		
			// toStirng 함수를 재정의하지 않았다면// day10.BoardDto@5305068a
			// 					  정의했다면 // 객체참조값 대신 출력하고 싶은 문자열
		System.out.println(board); 
		
	}
	
	
}