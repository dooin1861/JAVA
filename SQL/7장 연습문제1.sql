select deptno, trunc(avg(sal)) as avg_sal,
                max(sal) as max_sal, 
                min(sal) as min_sal, 
                count(*) as cnt
    from emp
group by deptno
    