
create table empidx
    as select * from emp;    -- �������� 1-1
 
create index idx_empidx_empno
    on empidx (empno);       -- �������� 1-2

select *
    from user_indexes
where index_name = 'idx_empidx_empno'; -- �������� 1-3

create or replace view empidx_over15k
    as (select empno, ename, job, deptno,
            sal, nvl2(comm, 'O', 'X') as comm
        from empidx
        where sal > 1500);             -- �������� 2
        
create table deptseq
    as select * from dept;      -- �������� 3-1
        
create sequence dept_seq
    increment by 1
    start with 1
    maxvalue 99
    minvalue 1
    nocycle  -- ���� ����
    nocache; -- ���� ����           �������� 3-2
    
INSERT INTO DEPTSEQ (DEPTNO, DNAME, LOC)
VALUES (dept_seq.NEXTVAL, 'DATABASE', 'SEOUL'); 

insert into deptseq (deptno, dname, loc)
values (dept_seq.nextval, 'WEB', 'BUSAN');

insert into deptseq (deptno, dname, loc)
values (dept_seq.nextval, 'MOBILE', 'SEOUL');  -- �������� 3-3

select * from deptseq;
