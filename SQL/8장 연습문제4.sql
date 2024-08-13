select d.deptno, d.dname,
       e.empno, e.ename, e.mgr, e.sal, e.deptno as deptno1,
       s.losal, s.hisal, s.grade,
       e2.empno as mgr_empno, e2.ename as mgr_ename
    from emp e, dept d, salgrade s, emp e2
    where e.deptno(+) = d.deptno
        and e.sal between s.losal(+) and s.hisal
        and e.mgr = e2.empno(+)
    order by d.deptno, e.empno