select deptno,
       d.dname,
       trunc(avg(sal)) as avg_sal,
       max(sal) as max_sal,
       min(sal) as min_sal,
       count(*) as cnt
    from emp e join dept d using (DEPTNO)
group by deptno, d.dname