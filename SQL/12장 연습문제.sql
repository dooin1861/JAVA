create table emp_hw(
empno number(4),
ename varchar2(10),
job varchar2(9),
mgr number(4),
hiredate date,
sal number(7,2),
comm number(7,2),
deptno number(2));          -- 문제 1번

alter table emp_hw
    add BIGO varchar2(20);  -- 문제 2번
    
alter table emp_hw
    modify BIGO varchar2(30);  -- 문제 3번
    
alter table emp_hw
    rename column BIGO to REMARK; -- 문제 4번 (rename 뒤에 column)
    
create table emp_hw
    as select * from emp;         -- 문제 5번 1
    
insert into emp_hw
select empno, ename, job, mgr, hiredate, sal, comm, deptno, null
    from emp;                     -- 문제 5번 2

drop table emp_hw;                -- 문제 6번

desc emp_hw;

select * from emp_hw;