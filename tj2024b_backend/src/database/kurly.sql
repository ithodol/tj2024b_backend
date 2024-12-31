#https://docs.google.com/spreadsheets/d/1KdUcGaOcm3QW3OeiwOikTxZRsuWU_idvy2NTlV-IIpY/edit?pli=1&gid=0#gid=0
create database kurly;
use kurly;

create table member(
	mno int auto_increment,
    id varchar(20) not null,
    pw varchar(20) not null,
    name varchar(10) not null,
    email varchar(40),
    constraint primary key(mno)
);

create table category(
	cno int auto_increment,
    catename varchar(10) not null,
    constraint primary key(cno)
);

create table product(
	pno int auto_increment,
	productname varchar(50) not null,
    price smallint unsigned default 0,
    constraint primary key(pno), -- pk 설정
    cno int, -- fk 선언
    constraint foreign key(cno) references category(cno) -- fk 설정
);

create table porder(
	ono int auto_increment,
    orderdate datetime default now(),
    constraint primary key(ono), -- pk 설정
    mno int, 
    constraint foreign key(mno) references member(mno) -- 멤버 mno fk 설정
);

create table porderdetail(
	odno int auto_increment,
    ordercount int unsigned not null,
    totalprice int unsigned not null,
    constraint primary key(odno),
    pno int,
    constraint foreign key(pno) references product(pno),
    ono int,
    constraint foreign key(ono) references porder(ono)
);

show databases;











