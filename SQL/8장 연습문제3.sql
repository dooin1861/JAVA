select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal
    from emp e, dept d
where e.deptno(+) = d.deptno
order by d.deptno, e.ename