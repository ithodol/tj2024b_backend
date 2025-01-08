use boardservice10;
# [1] 회원가입 : insert into 테이블명(속성명, 속성명) values(속성값, 속성값);
insert into member( mid , mpwd , mname , mphone ) values( '값' , '값', '값', '값' );

# [2] 로그인 : select


# [3] 아이디찾기 : select 속성명 from 테이블명 where 조건	SQL = and, java/js = &&
-- select mid from member where mname = 찾을값 and phone = 찾을값;
select mid from member where mname = '유재석' and mphone = '010-3333-3333';

# [4] 비밀번호 찾기 select * from 테이블명 where 조건
select * from member where mid = 'qwe123' and mphone = '010-3333-3333';


# [5] 내정보 보기 select
select * from member where mno = 1;
-- JDBC : select * from member where mno = ?

# [6] 회원탈퇴
 -- JDBC : delete from memmber where mno = ?
