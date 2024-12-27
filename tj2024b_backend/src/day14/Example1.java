package day14;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		// [1] 배열은 길이를 변경할 수 없다
		String[] names = new String[3]; // String 객체 3개를 저장할 수 있는 배열
		// [2] 배열에 객초(요소) 대입
		names[0] = "유재석";
		names[1] = "강호동";
		names[2] = "신동엽";
		// [3] 배열내 요소 순회/조회
		for(int index = 0; index <= names.length-1; index++) {
			System.out.println(names[index]);
			// 유재석 강호동 신동엽
		}
		// [4] 배열내 길이 이상의 요소 대입
		//names[3] = "전은서";
		// 오류 발생 Index 3 out of bounds for length 3
		
		// [5] 배열 중간 요소 삭제
		names[1] = null;
		// 공백으로 두는 건 가능하지만 삭제는 불가능. 삭제 개념이 존재하지 않음.
		
		
		
		
		// (1) ArrayList 클래스 / 배열과 다르게 가변길이로 사용 가능 // 단점 : 느리다. 라이브러리이기때문
			// 상단 import java.util.ArrayList;
			// <제네릭타입> : 리스트에 저장할 객체의 타입
			// ArrayList<요소타입> 변수명 = new ArryList<>();
		ArrayList<String> nameList = new ArrayList<>();
		
		// (2) .add(요소) / 리스트에 요소 추가 함수
		nameList.add("유재석");
		nameList.add("강호동");
		nameList.add("신동엽");
		
		// (3) .size() / 리스트의 요소 총개수 반환 함수
		// (3-1) .get(인덱스) / 리스트의 지정한 인덱스 요소값 반환 함수
		// 대괄호 대신 사용해서 접근
		for(int index = 0; index <= nameList.size()-1; index++) {
			System.out.println(nameList.get(index));
		}
		
		// (4) .add(요소) : 리스트에 요소 추가 함수
		nameList.add("전은서"); // 배열과 다르게 리스트는 가변길이. 자동으로 길이가 조정된다
		
		// (5) .remove(인덱스) / 리스트에 지정하나 인덱스 요소 삭제 함수
		nameList.remove(1); // index가 1인 '강호동'요소 삭제 // 배열과 다르게 리스트는 가변길이. 요소 삭제 가능
		
		// 확인
		System.out.println(nameList);
		// [유재석, 신동엽, 전은서]
		
		
		
		
		// 실습 Book 클래스 객체들을 저장하는 리스트 객체 생성
			// [1] 리스트 객체 선언
		ArrayList<Book> library = new ArrayList<>();
			// [2] .add() 이용한 리스트객체 내 요소객체 추가
		library.add(new Book("눈먼 올빼미", "샤데크 헤다야트"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("동물농장", "조지 오웰"));
		library.add(new Book("호밀밭의 파수꾼", "제롬 데이비드 샐린저"));
		
		Book book1 = new Book("동물농장", "조지 오웰");
		library.add(book1);
		
		Book book2 = new Book("호밀밭의 파수꾼", "제롬 데이비드 샐린저");
		library.add(book2);
		
		library.add(new Book("이방인","알베르 카뮈"));
		
			// [3] .size() : 리스트객체내 요소 총개수 반환함수
			// [3-1] .get( 인덱스 ) : 리스트객체내 지정한 인덱스 요소객체 반환 함수.
		for( int index = 0 ; index <= library.size()-1 ; index++ ) {
			Book book = library.get(index);
			System.out.println( book );
		} // for end 
			
		System.out.println( library );
		
		
		
	} // main end
} // class end


































