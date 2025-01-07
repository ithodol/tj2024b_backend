# 프로젝트 : boardservice10 DML
# 1. DB 구성
drop database if exists boardservice10;	-- 만약 boardservice10 DB명이 존재하면 삭제
create database boardservice10;		-- DB 생성
use boardservice10;		-- DB 접근

# 2. 테이블 생성, PK 테이블 먼저 생성, 적절하게 타입과 제약조건을 고려한다

-- [1] 회원테이블 생성
create table member(
	mno int unsigned auto_increment,
    mid varchar(30) not null unique,
    mpwd varchar(30) not null,
    mname varchar(10) not null,
    mphone varchar(13) not null unique,
    mdate datetime default now(),
    constraint primary key(mno)
);
-- [1-1] 회원테이블 샘플 레코드 삽입
insert into member(mid, mpwd, mname, mphone) values('qwe123','a123456','유재석','010-5465-464');
insert into member(mid, mpwd, mname, mphone) values('asd123','b123456','강호동','010-1010-2020');
insert into member(mid, mpwd, mname, mphone) values('zxc123','c123456','신동엽','010-2020-5864');
insert into member(mid, mpwd, mname, mphone) values('tyu123','d123456','서장훈','010-5165-6455');
insert into member(mid, mpwd, mname, mphone) values('ghj123','e123456','하동훈','010-1656-6159');


-- [2] 카테고리 테이블 생성
create table category(
	cno int unsigned auto_increment,
    cname varchar(10) not null unique,
    cdate datetime default now(),
    constraint primary key(cno)
);

-- [2-1] 카테고리 테이블 샘플 레코드 삽입
insert into category(cname) values('자유');
insert into category(cname) values('질문');
insert into category(cname) values('노하우');
insert into category(cname) values('공부');
insert into category(cname) values('친목');

-- [3] 게시물 테이블 생성
create table board(
	bno int unsigned auto_increment,
    btitle varchar(100) not null,
    bcontent longtext,
    bview int unsigned default 0,
    bdate datetime default now(),
    mno int unsigned,
    cno int unsigned,
    constraint primary key(bno),
    # FK 제약조건 옵션 on update/delete
		-- on update/delete(옵션) : fk가 참조하는 pk가 삭제 또는 수정에 따른 fk의 제약 옵션
		-- restrict : fk가 pk를 참조 중이면 pk 레코드를 삭제/수정 불가능
		-- cascade : pk값이 삭제/수정되면 fk도 같이 삭제/수정
		-- set null : pk값이 삭제/수정되면 fk는 참조를 없애고 null로 변경
        
	-- 만약 특정회원이 회원탈퇴(pk)를 하면 그를 참조하는 작성자(fk) 레코드도 함께 삭제된다.
    constraint foreign key(mno) references member(mno) on update cascade on delete cascade,
    -- 만약 특정 카테고리가 삭제되면 그를 참조하는 게시물도 같이 삭제/수정한다.
    constraint foreign key (cno) references category(cno) on update cascade on delete cascade
);

-- [3-1] 카테고리 샘플 레코드 삽입
insert into board(btitle, bcontent, mno, cno) values('안녕하세요1', '힘찬자바1', 1, 1);
insert into board(btitle, bcontent, mno, cno) values('안녕하세요2', '힘찬자바1', 1, 3);
insert into board(btitle, bcontent, mno, cno) values('안녕하세요3', '힘찬자바1', 4, 3);
insert into board(btitle, bcontent, mno, cno) values('안녕하세요4', '힘찬자바1', 2, 5);
insert into board(btitle, bcontent, mno, cno) values('안녕하세요5', '힘찬자바1', 3, 2);


-- [4] 댓글 테이블 삽입
create table reply(
	rno int unsigned auto_increment,
	rcontent varchar(100) not null,
	rdate datetime default now(),
	constraint primary key(rno),   
    mno int unsigned,
    constraint foreign key(mno) references member(mno) on update cascade on delete cascade,
    bno int unsigned,
    constraint foreign key(bno) references board(bno) on update cascade on delete cascade
);

-- [4-1] 댓글글 테이블 샘플 레코드 삽입
insert into reply(rcontent, mno, bno) values('하하하 댓글1', 3, 3);
insert into reply(rcontent, mno, bno) values('하하하 댓글2', 3, 3);
insert into reply(rcontent, mno, bno) values('하하하 댓글3', 4, 5);
insert into reply(rcontent, mno, bno) values('하하하 댓글4', 5, 5);
insert into reply(rcontent, mno, bno) values('하하하 댓글5', 1, 4);

# [확인] 조회
select * from member;
select * from category;
select * from board;
select * from reply;















