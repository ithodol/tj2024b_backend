package day07;


/*
	* 개별검사
	임의의 점수 5개를 배열에 저장하고 총점과 평균을 구하는 코드 작성
*/

	// 연습


public class Ex {

	public static void main(String[] args) {
		
//		while(true) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("국어, 영어, 수학, 과학, 체육 각각의 점수를 입력하세요.");
//		int p1 = scan.nextInt(); 
//		int p2 = scan.nextInt();
//		int p3 = scan.nextInt();
//		int p4 = scan.nextInt();
//		int p5 = scan.nextInt();
//
//		int 총점 = p1 + p2 + p3 + p4 + p5;
//		int 평균 = 총점/5;
//		System.out.printf("국어 : %d점 / 영어 : %d점 / 수학 : %d점 / 과학 : %d점 / 체육 : %d점"
//						+ "\n총점 : %d점 \n평균 : %d \n",p1,p2,p3,p4,p5,총점,평균);
//	}
		
		

		int[] 점수 = new int[] {10,20,30,40,50};
		int 합계 = 0;
		for(int i = 0; i <= 점수.length-1; i++) {
			합계 += 점수[i];
		}
		int 평균 = 합계/점수.length;

	}

}
