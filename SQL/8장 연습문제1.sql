select d.deptno, d.dname, e.empno, e.ename, e.sal
    from emp e, dept d
where e.deptno = d.deptno