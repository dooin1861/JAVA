select deptno,
        to_char(hiredate, 'YYYY') as hire_year,
        count(*) as cnt,
        max(sal) as max_sal,
        sum(sal) as max_sal,
        avg(sal) as avg_sal
    from emp
group by rollup(deptno, to_char(hiredate, 'YYYY'))