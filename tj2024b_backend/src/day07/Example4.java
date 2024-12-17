package day07;

import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) {
		
		// [0] 배열 사용하기 전, 학번 10개를 저장하는 코드
		int studentID1; int studentID2; int studentID3; int studentID4; int studentID5; 
		int studentID6; int studentID7; int studentID8; int studentID9; int studentID10;
		
		
		// [1] 배열 사용, 학번 10개를 저장하는 코드
		int[] sutendtIDs = new int[10];
		
		// [2] 배열 조기화하기
			// 1. 개수 생략함
			int[] studentIDs2 = new int[] {101,102,103};
			// 2. 오류 발생
			//int[] studentIDs3 = new int3[] {101,102,103};
			// 3.
			int[] sutdentIDs4 = {101,102,103};
			// 4.
			int[] studentIDs5;
			studentIDs5 = new int[] {101,102,103};
		
		
		// [3] 배열 사용하기, 인덱스 사용하기
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(num);
			// 결과 : [I@28a418fc
		System.out.println(Arrays.toString(num));
			// 결과 : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(num[0]);
			// 결과 : 1
		System.out.println(num[3]);
			// 결과 : 4
		
		
		// 1분 복습 p.203
		int sum = 0;
		for(int index = 0; index <= num.length -1; index++) {
			sum += num[index];
		}
		
		
		// [4] 전체 배열의 길이와 유효한 요소 값
		double[] data = new double[5]; // 실수 5개를 저장할 수 있는 배열 선언
		
		data[0] = 10.0; // 첫번째 인덱스에 10.0 대입
		data[1] = 20.0; // 두번째 인덱스에 20.0 대입
		data[2] = 30.0; // 세번째 인덱스에 30.0 대입
		// 네번째 인덱스, 다섯번째 인덱스에는 대입하지 않았다.
		// [3], [5]는 기본값인 0.0이 들어있다.(기본값)
		
		for(int i = 0; i < data.length -1; i++) {
			System.out.println(data[i]);
		}
		
		
		
	} // main end

} // class end

























