# SQL 과제1 : 키오스크 개발의 메모리 설계 하고 DB와 테이블 생성을 SQL로 작성하여 제출 하시오.
/*
	https://www.youtube.com/watch?v=ksuYwD1oC3A
	위 링크와 같은 프로그램을 만들기 위한 DB 설계를 하시오.
	[요구사항]
	1. 여러개 카테고리중에 카테고리를 선택을 해서 카테고리 별로 제품들을 출력/확인 한다.
	2. 해당 제품을 선택해서 수량 입력받아 주문처리 한다. 단, 하나의 주문의 여러개 제품을 주문할수있다.
	3. 주문번호를 받아서 대기한다.
	4. 설계 조건
		1. [ 메모리 설계 필수 속성 ]	
		- 식별자코드 , 카테고리명 , 가격 , 제품명 , 주문수량 , 주문날짜 하되 추가 가능 합니다.
		2. 테이블간의 데이터 중복을 최소화한다.
		3. 총 테이블은 3개 이상으로 설계한다.
		4. 적절한 타입과 제약조건을 최대한 활용하시오.
        5. DB명 , 테이블명, 속성명은 임의로 합니다. 
        
	* 제출 : 카카오톡방에 SQL 과제 코드가 존재하는 본인 git 상세주소 제출 
*/
# 참고 자료
-- https://docs.google.com/spreadsheets/d/1KdUcGaOcm3QW3OeiwOikTxZRsuWU_idvy2NTlV-IIpY/edit?usp=sharing

# 피드백

-- [1] db 생성
create database kiosk;
-- [2] db 사용 활성화
use kiosk;
-- **주의할점 :  [3] 테이블 생성시 상위pk 테이블 먼저 생성
-- [4] 카테고리 테이블 생성
create table category(
	cno int auto_increment,	-- 카테고리 번호
    cname varchar(30) not null,	-- 카테고리 이름
    constraint primary key(cno) -- pk 필드 선정
);

-- [5] 제품 테이블 생성
create table product(
	pno int auto_increment,	-- 제품 번호
    pname varchar(100) not null, -- 제품 이름
    ppirce int unsigned default 0, -- 제품 가격
    constraint primary key(pno), -- pk필드 설정
    cno int, -- fk필드 선언(pk필드와 동일한 타입 권장)
    constraint foreign key(cno) references category(cno) -- fk필드 설정
);

-- [6] 주문 테이블 생성
create table porder(
	pono int auto_increment, -- 주문번호
    pndate datetime default now(), -- 주문날짜, 현재 시스템 날짜 자동
    constraint primary key(pono) -- pk필드 설정
);

-- [7] 주문 상세 테이블 생성
create table porderdetail(
	podno int auto_increment, -- 주문 상세
    podamount tinyint unsigned not null, -- 주문 수량
    constraint primary key(podno), -- 주문상세 pk 설정
    pno int, -- 제품번호 fk 필드
    constraint foreign key(pno) references product(pno), 
    pono int, -- 주문번호 fk 필드
    constraint foreign key(pono) references porder(pono)
);













