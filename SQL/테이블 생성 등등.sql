create table emp_alter
    as select * from emp;
    
alter table emp_alter
    add hp varchar2(20);

alter table emp_alter
    rename column hp to TEL;

alter table emp_alter
    modify empno number(5);

alter table emp_alter
    drop column TEL;
    
rename emp_alter to emp_rename;
rename emp_rename to emp_alter;

truncate table emp_alter; -- truncate는 롤백이 안됨.

drop table emp_alter;

desc emp_alter;

select *
    from emp_alter;