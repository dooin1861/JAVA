select to_char(hiredate, 'YYYY') as hire_year,
    deptno,
    count(*) as cnt
    from emp
    group by to_char(hiredate, 'YYYY'), deptno