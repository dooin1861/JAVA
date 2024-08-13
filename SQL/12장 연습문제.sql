create table emp_hw(
empno number(4),
ename varchar2(10),
job varchar2(9),
mgr number(4),
hiredate date,
sal number(7,2),
comm number(7,2),
deptno number(2));          -- ���� 1��

alter table emp_hw
    add BIGO varchar2(20);  -- ���� 2��
    
alter table emp_hw
    modify BIGO varchar2(30);  -- ���� 3��
    
alter table emp_hw
    rename column BIGO to REMARK; -- ���� 4�� (rename �ڿ� column)
    
create table emp_hw
    as select * from emp;         -- ���� 5�� 1
    
insert into emp_hw
select empno, ename, job, mgr, hiredate, sal, comm, deptno, null
    from emp;                     -- ���� 5�� 2

drop table emp_hw;                -- ���� 6��

desc emp_hw;

select * from emp_hw;