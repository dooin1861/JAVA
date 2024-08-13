select d.deptno,
       d.dname,
       trunc(avg(sal)) as avg_sal,
       max(sal) as max_sal,
       min(sal) as min_sal,
       count(*) as cnt
    from emp e, dept d
where e.deptno = d.deptno
group by d.deptno, d.dname