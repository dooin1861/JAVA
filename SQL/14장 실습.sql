create table table_check(
    login_id varchar2(20) constraint TBLCK_loginid_pk primary key,
    login_pwd varchar2(20) constraint TBLCK_loginpw_ck check (length(login_pwd) > 3), -- �ּ� 4�ڸ��� �̻�
    tel varchar2(20)
);                        -- �ǽ� 14-45
    
desc table_check;

insert into table_check
values ('test_id', '1234', '010-1234-5678');  -- login_pwd�� 4�ڸ��� �̻��̾�� ��, �ǽ� 14-46

select * from table_check;

create table table_default(
    login_id varchar2(20) constraint tblck2_loginid_pk primary key,
    login_pwd varchar2(20) default '1234',
    tel varchar2(20)
);                          -- �ǽ� 14-49

insert into table_default values('test_id', null, '010-1234-5678');

insert into table_default (login_id, tel) values ('test_id2', '010-1234-5678');

select * from table_default; -- �ǽ� 14-50