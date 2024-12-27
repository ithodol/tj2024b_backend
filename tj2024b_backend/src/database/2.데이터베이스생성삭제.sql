/*
	1. SQL 코드 작성 방법
		SQL 문법을 작성한다
        SQL 문장이 끝나면 ;(세미콜론)으로 마친다
	2. SQL 코드 실행 방법
		방법1 : 단위실행
			실행할 코드에 커서를 두고 ctrl + enter
			실행할 코드에 커서를 두고 번개 I아이콘 클릭 : 
		방법2 : 전체 실행 (위에서 아래 순으로 실행)
			ctrl + shift + enter
            번개아이콘 클릭
	3. SQL 코드 실행 결과
		하단에 Result Grid 탭에서 확인 가능
*/ 
# [1] db server 내 모든 데이터베이스 확인
# 데이터베이스란? 데이터의 집합, 표/테이블들을 모아둔 곳
show databases;

# [2] db server의 local path
show variables like 'datadir';
-- C:\ProgramData\MySQL\MySQL Server 8.0\Data\

# [3] db server의 데이터베이스 생성하기
#create(생성한다) database(데이터베이스) DB명 / create database DB명
create database mydb1226;

# [4] db server의 데이터베이스 삭제하기
# drop(버린다) database(데이터베이스) DB명 / drop database DB명
drop database mydb1226;

# [4-1] 만약 지정한 데이터베이스가 존재하면 삭제하기
# if(만약) exists(존재하다)
drop database if exists mydb1226;

# [5] db server 내 여러개 데이터베이스 중에 사용/활성화할 데이터베이스 선택
use mydb1226;





# 실습1 : 아래와 같이 순서대로 SQL코드를 작성하고 실행하시오.

-- 1. 'test1' 이름의 데이터베이스가 존재하면 삭제하기 SQL 작성 [4-1]참고
drop database if exists test1;

-- 2. 'test1' 이름의 데이터베이스 생성하기 SQL 작성
create database test1;

-- 3. 서버 전체 데이터베이스 목록 확인 SQL 작성
show databases;

-- 4. 로컬PC에 데이터베이스가 만들어졌는지 경로 확인 SQL 작성
show variables like 'datadir';

-- 5. 'test1' 이름의 데이터베이스 사용 활성화하기 SQL 작성
use test1;


# 참고 : 현재 작성한 코드 파일을 sql확장자 파일










