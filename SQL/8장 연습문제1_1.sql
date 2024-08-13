select d.deptno, d.dname, e.empno, e.ename, e.sal
    from emp e join dept d on(e.deptno = d.deptno)
where e.sal > 2000