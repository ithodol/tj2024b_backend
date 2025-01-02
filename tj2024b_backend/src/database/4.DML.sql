# 1. 데이터베이스 생성
drop database if exists mydb0102; -- 데이터베이스가 존재하면 삭제 
create database mydb0102;	-- 데이터베이스 생성
use mydb0102;	-- 데이터베이스 활성화

# 속성/필드 : 세로 단위 제목
# 레코드/튜플 : 가로 단위 자료

# 2. 테이블 생성
create table table1(
	mno int auto_increment,
    mname varchar(30) not null unique,
    mcount int,
    constraint primary key(mno)
);

# DML : 데이터베이스 조작어
-- 1.insert[C]   2.select[R]   3.update[U]   4.delete[D]


# 1. insert[C] : 레코드(행/튜플) 삽입
-- 작성법 : insert into 테이블명(속성명1, 속성명2) values(값1, 값2)
insert into table1(mname, mcount) values('김한주', 10);
insert into table1(mcount, mname) values(20, '김춘추'); -- 2번 이상 실행시 오류 / mname 속성의 제약조건이 unique했으므로 중복 삽입 불가능 / '유재석' 중복
insert into table1(mcount) values(30);	-- 오류 / mname 속성의 제약조건이 not null이므로 값을 대입해야 함 / mname이 공백임
-- mno 속성의 초기값을 생략하면 auto_increment 이므로 자동번호 부여됨
insert into table1(mno, mname, mcount) values(3, '김건재', 30);
-- 테이블의 모든 속성들을 초기값을 대입할 경우 속성명은 생략 가능
insert into table1 values(4, '최웅희', 40);
-- insert에 여러개의 레코드 삽입하기
insert into table1 values(5, '전은서', 50),(6, '전호돌', 60);




# 2. select[R] : 레코드(행/튜플) 조회
-- (1) 전체 속성의 레코드 조회 : select * from 테이블명;		*와일드카드 = 전체를 뜻함
select * from table1;
-- (2) 특정 속성의 레코드 조회 : select 속성명1 / 속성명이 2개 이상이면 ,(쉼표)로 구분
select mno from table1;
select mno, mname from table1; 
-- (3) 레코드 조회할 때 속성값 조건 / [조건절] where 조건;
select * from table1 where mname = '전은서';	-- mname 속성 값이 '유재석'인 레코드 조회
select * from table1 where mno = 3;	-- mno 속성 값이 3인 레코드 조회

 


# 3.update[U] : 레코드의 속성 값 수정
-- (1) 전체 레코드의 속성값 수정 : update 테이블명 set 속성명 = 새로운 값
update table1 set mcount = 0; -- *오류발생 : mysql workbench safemode
									-- 끄기 : set SQL_SAFE_UPDATES = 0;
                                    -- 켜기 : set SQL_SAFE_UPDATES = 1;
-- mysql workbench safemode 꺼야 실행 가능
set SQL_SAFE_UPDATES = 0;
-- (2) 특정 레코드의 속성값 수정 : update 테이블명 set 속성명 = 새로운 값 where[조건절]
update table1 set mcount = 100 where mname = '김한주'; -- mname 속성값이 '김한주'인 레코드의 mcount 속성값을 100으로 수정
-- (3) 여러 속성값 수정 (,(쉼표)로 구분) : update 테이블명 set 속성명1 = 새로운 값1, 속성명2 = 새로운값2 where[조건절]
update table1 set mname = '김춘추2', mcount = 200 where mno = 3; -- mno 속성값이 3인 레코드의 mname과 mcount 값을 수정한다
 
 
 
# 4.delete[D] : 레코드 삭제
-- (1) 전체 레코드 삭제 : delete from 테이블명;
-- mysql workbench safemode 꺼야 실행 가능
delete from table1;
-- (2) 특정 레코드 삭제 : delete from 테이블명 where [조건절]
delete from table1 where mno = 3;
