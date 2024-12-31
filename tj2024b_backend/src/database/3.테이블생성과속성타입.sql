
# [1] db server의 전체 데이터베이스 목록 조회
show databases;
# [2] db server의 local path 조회
show variables like 'datadir';
# [3] db server의 데이터베이스 생성하기
create database mydb1230;
# [4] db server의 데이터베이스 삭제하기
drop database mydb1230;
# [4-1] 만약 지정한 데이터베이스가 존재하면 삭제하기
drop database if exists mtdb1230;
# [5] db server 내 여러개 데이터베이스 중에 사용/활성화할 데이터베이스 선택
use mydb1230;


create database my1230;
use my1230;
# [1] 테이블 생성 / create table 테이블명(필드명 타입);
create table testtable1(필드명 int);
# [2] 현재 활성화(사용) 중인 DB내 모든 테이블 조회
show tables;
# [3] 테이블 생성, create table 테이블명(필드명 타입, 필드명 타입);
# 여러개의 필드가 존재할 경우 ,(쉼표)로 구분한다.
create table testtable2(필드명1 int, 필드명2 double);
# [4] 테이블 삭제, drop table 테이블명;
drop table testtable1;
drop table if exists  testtable2;



# [5] MYSQL 데이터 타입
/*
	[정수]
		tinyint		1바이트		-128 ~ +127		(byte)
        smallint	2바이트		+-3만 정도		(short)
        mediumint	3바이트		+-800만 정도
        int			4바이트		+-21억 이상
        bigint		8바이트		+-21억 이상		(long")

	[실수]
		float		4바이트		부동소수점(표현범위 이상일 경우 오차 발생)
        double		8바이트		부동소수점(표현범위 이상일 경우 오차 발생)
        decimal		문자타입		실수를 문자로 처리하는 타입, 오차가 없음

	[날짜/시간]
		date		날짜표현		0000-00-00		1000년 ~ 9999년
		time		시간표현		00:00:00
        datetime	날짜/시간표현	0000-00-00 00:00:00
        
	[문자]
    char(문자길이)	문자열표현		고정길이 / 최대 255글자 char(5)	=> "유재석" -> [유] [재] [석] [ ] [ ]
    varchar(문자길이)	문자열표현		가변길이 / 최대 255글자	varchar(5) => "유재석" -> [유] [재] [석] -> 남은 길이 제거
    text			문자열표현		최대 6만 글자
    longtext		문자열표현		최대 42억 글자 / 4GB / 대용량
    
    [논리]
    bool			true or false 표현	tintyint와 같다.
    
*/
# 다양한 데이터 타입을 이용한 테이블 생성 실습
create table testtable3( -- 주의할점 : db 사용 활성화가 된 상태에서 가능, use ~~ 실행 확인
	-- 속성명 타입, 속성명 타입
    정수필드1 tinyint, 정수필드2 smallint, 정수필드3 mediumint, 정수필드4 int, 정수필드5 bigint,
    실수필드1 float, 실수필드2 double,
    날짜필드 date, 시간필드 time, 날짜시간 datetime,
    문자필드1 char(100), 문자필드 varchar(100), 문자필드3 text, 문자필드4 longtext,
    논리필드 bool
);


# [6] 특정한 테이블 조회
select * from testtable3;

# 실습 : boardservice9의 db 설계 하시오
	-- 단계1 : db서버의 db만들기
    create database boardservice9; 
    -- 단계2 : 지정한 db의 테이블을 만들기 위해서 db 활성화
    use boardservice9;-- 
    -- 단계3 : 지정한 db의 테이블 생성하기
    create table board(
		title varchar(100),	-- 임의로 제목은 최대 100글자
        content longtext,	-- 임의로 내용은 긴 글과 사진 첨부 가능하게 설계함
        writer varchar(30)	-- 임의로 작성자 최대 30글자
    );
show tables;



# 실습2 : day09 패키지의 WaitingService의 db설계
create database waitingservice;
use waitingservice;
create table waiting( 
	phone char(13),
    count int
);
show tables;



# [7] 제약조건 : 테이블에서 문제/결함되는 데이터가 입력되지 않도록 제약
create database mydb12300;
use mydb12300;
create table testtable4(
	# 필드명 타입 제약조건
    필드명1 tinyint not null,			-- 지정한 필드에는 null을 대입할 수 없다
    필드명2 smallint unique,			-- 지정한 필드에는 중복값을 대입할 수 없다(중복제거)
    필드명3 int default 10,			-- 지정한 필드에는 레코드삽입시 값을 생략하면 자동으로 기본값이 대입된다
    필드명4 bigint auto_increment,	-- 지정한 필드에는 레코드 삽입시 자동으로 순서번호가 대입된다
    PK필드명5 double,					
    constraint primary key(PK필드명5) -- 지정한 필드를 pk필드로 설정
);
create table testtable5(
	FK필드명1 double,
    constraint foreign key(FK필드명1) references testtable4(PK필드명5)
    -- 지정한 필드를 fk필드로 설정하고 참조할 pk필드가 위치한 테이블명과 pk필드명을 작성한다
);



# 실습 : boardservice7에서 회원제 게시판 db 설계하시오.
	-- 회원테이블, 게시판테이블 -> 회원이 존재해야 게시물이 존재한다. 즉, 회원(pk) 게시물(fk)
create database boardservice7;
use boardservice7;
-- 회원테이블
create table member(
	-- 회원번호
	mno int auto_increment,
    -- 회원번호에 자동번호를 부여하기 위해 auto_increment 제약조건 선택
	-- 회원번호는 최대 20억 이상이 될 경우가 없을 것 같아서 int 타입 선택
    
    -- 회원아이디
	mid varchar(30) not null unique,
    -- 회원아이디는 공백이라는 아이디가 존재하면 안 됨. not null 제약조건 선택
	-- 회원아이디는 중복을 차단해야함. unique 제약조건 선택
    
    -- 회원비밀번호
	mpwd varchar(30) not null,
    -- 회원 비밀번호는 공백을 차단해야함. not null 제약조건 선택
    
    -- 회원이름
    mname varchar(10) not null,
    -- 회원명은 최대 10글자까지 입력받기로 함. varchar(10)으로 선택
    
    constraint primary key(mno)
    -- 회원번호를 pk필드로 선정. not null과 unique가 포함됨
);

-- 게시판 테이블
create table board(
	-- 게시물 번호
	bno bigint auto_increment,
    -- 게시물번호는 자동번호를 부여하기 위함. auto_increment 사용,
    -- 20억 이상의 게시물번호를 표현하기 위해 bigint 사용
    
    -- 게시물 제목
    btitle varchar(100) not null,
    -- 게시물 제목은 공백을 없애기 위해 not null 사용
    -- 문자가 최대 100글자까지 입력 가능하도록 사용
    
    -- 게시물 내용
    bcontent text,
    -- 게시물 내용은 공백을 허용하고, 최대 4GB까지 대용량 입력 가능하도록 사용
    
    -- 게시물 작성일
    bdate datetime default now(),
    -- 게시물 작성일에는 default 기본값에 now() 함수를 사용하면 자동으로 시스템 날짜/시간이 삽입됨.
    
    -- 게시물 조회수
    dview int default 0,
    -- 게시물 조회수에는 기본값을 0으로 설정
    
    -- pk필드는 1개 이상 만드는 것을 권장
    constraint primary key(bno)
    -- 게시물 번호를 pk필드로 선정
    
    -- fk필드 / 회원번호 fk / 참조할 필드와 동일한 타입으로 선정
    mno int,
    constraint foreign key(mno) references member(mno)
    -- board테이블의 mno필드가 member테이블의 mno 필드를 참조함
    
);


show tables;












