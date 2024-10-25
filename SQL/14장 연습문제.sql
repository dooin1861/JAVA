create table dept_const (
    deptno number(2) constraint deptconst_deptno_pk primary key,
    dname varchar2(14) constraint deptconst_dname_unq unique,
    loc varchar2(13) constraint deptconst_loc_nn not null
);  -- 연습문제 1

create table emp_const (
    empno number(4) constraint empconst_empno_pk primary key,
    ename varchar2(20) constraint empconst_empno_nn not null,
    job varchar2(20),
    tel varchar2(20) constraint empconst_tel_unq unique,
    hiredate date,
    sal number(7, 2) constraint empconst_sal_chk check (sal between 1000 and 9999),
    comm number(7, 2),
    deptno number(2) constraint empconst_deptno_fk references dept_const (Deptno)
);  -- 연습문제 2

select table_name, constraint_name, constraint_type
    from user_constraints
  where table_name in ('emp_const', 'dept_const')
order by constraint_name; -- 연습문제 3
