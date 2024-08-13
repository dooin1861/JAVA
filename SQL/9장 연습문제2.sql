select e.empno, e.ename, d.dname, e.hiredate, d.loc, e.sal, s.grade
    from emp e, dept d, salgrade s
    where e.deptno = d.deptno
    and e.sal between s.losal and s.hisal
    and sal > (select avg(sal)
                from emp)
    order by e.sal desc, e.empno;