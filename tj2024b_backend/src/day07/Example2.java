package day07;

import java.util.Scanner;

/*
	자바 과제6 : 키오스크 프로그램 
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
	- 제품은 콜라,사이다,환타 인 3개가 존재한다는 가정 한다.
	- 각 제품의 재고는 초기에 10개씩 존재한다.
	- 각 제품의 가격은 콜라 1000원 사이다 1500원 환타 2000원 가정 한다.
	- 제품 클래스를 정의한다. 제품객체 활용하여 구현한다.
	- 프로그램 초기 메뉴] 1.콜라 2.사이다 3.환타 4.결제
	   1 선택시 : 콜라 선택시 콜라 재고 1 차감하고 장바구니에 담는다.
	   2 선택시 : 사이다 선택시 사이다 재고 1 차감하고 장바구니에 담는다.
	   3 선택시 : 환타 선택시 환타 재고 1차감하고 장바구니에 담는다.
	   4 선택시 : 현재 장바구니에 담긴 모든 현황을 보여주고 금액 합산을 출력한다. 
	      ex] 콜라1개 , 사이다2개 , 환타0개 총금액 : 4000원
	   * 추가 유효성검사 : 만일 재고가 부족하면 "재고가 부족합니다" 라고 출력하시오.
	제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/

// [1] main 갖는 실행 클래스
public class Example2 {

	public static void main(String[] args) {
		//[5] 클래스 정의하기, 샘플 객체 생성, new연산자 : 객체생성시 사용되는 연산자
		Product p1 = new Product();	p1.name="콜라";	p1.price=1000; p1.stock = 10;
		Product p2 = new Product();	p2.name="콜라";	p2.price=1000; p2.stock = 10;
		Product p3 = new Product();	p3.name="콜라";	p3.price=1000; p3.stock = 10;
		
		 
		while(true) {
			// [2] 출력함수
			System.out.println("1.콜라 2.사이다 3.환타 4.결제 : ");
			// [3] 입력객체
			Scanner scan = new Scanner(System.in);
			// [4] 입력함수
			int choose = scan.nextInt();
			if(choose == 1) { // 콜라 선택
				if(p1.stock > 0) {//콜라의 재고가 존재하면
					p1.stock--; p1.cart++; // 재고-1, 장바구니+1
				}else { // 콜라의 재고가 존재하지 않으면
					System.out.println("콜라 재고가 부족합니다");
				}
			}
			else if(choose == 2) { // 사이다 선택
				if(p2.stock > 0) {p2.stock--; p2.cart++;}
				else {System.out.println("사이다 재고가 부족합니다");}
			}else if(choose == 3) { // 환타 선택
				if(p3.stock > 0) {p3.stock--; p3.cart++;}
				else {System.out.println("환타 재고가 부족합니다");}
			}else if(choose == 4) { // 결제 선택
				int 총금액 = (p1.cart * p1.price) + (p2.cart * p2.price) + (p3.cart * p3.price); // 장바구니에 담긴 제품의 금액 계산
				System.out.printf("장바구니 현황 : 콜라%2d개, 사이다%2d개, 환타%2d개, 총금액 : %d원 \n",
									p1.cart, p2.cart, p3.cart, 총금액);
				p1.cart = 0; p2.cart = 0; p3.cart = 0; // 결제완료했으니 장바구니 초기화
			}

		} // while end
	} // main end
} // class end
